package com.alibaba.idst.nlu.response.slot;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.idst.nlu.response.common.BaseSlot;
import com.alibaba.idst.nlu.response.common.NluResultElement;
import com.alibaba.idst.nlu.response.utils.SlotConstants;

public class SlotProcessor implements ExtraTypeProvider, ExtraProcessor {
    public static final DateTimeSlotProcessor DATE_TIME_SLOT_PROCESSOR = new DateTimeSlotProcessor();
    public static final String KEY_SLOTS = "slots";

    public static String getSlotType(JSONObject slot) {
        if (slot.containsKey("level_1") || slot.containsKey("level_2")
            || slot.containsKey("level_3") || slot.containsKey("level_4")
            || slot.containsKey("level_5") || slot.containsKey("location")) {
            return SlotConstants.SLOT_TYPE_GEO_INFO;
        } else if (slot.containsKey("norm") && (slot.get("norm") instanceof JSONArray)) {
            if (slot.containsKey("error_code") || slot.containsKey("relative_mode")
                || slot.containsKey("time") || slot.containsKey("timex")
                || slot.containsKey("use_week") || slot.containsKey("date")) {
                return SlotConstants.SLOT_TYPE_DATETIME;
            } else if (slot.containsKey("type")) {
                return SlotConstants.SLOT_TYPE_NUMBER;
            }
        } else if (slot.containsKey("timex")) {
            return SlotConstants.SLOT_TYPE_TIME_DURATION;
        }
        return SlotConstants.SLOT_TYPE_BASIC;
    }

    @Override
    public Type getExtraType(Object object, String key) {
        if (key.equals(KEY_SLOTS)) {
            return new TypeReference<Map<String, List<JSON>>>() {
            }.getType();
        }

        return null;
    }

    @Override
    public void processExtra(Object object, String key, Object value) {
        if (key.equals(KEY_SLOTS) && value != null) {
            NluResultElement element = (NluResultElement)object;

            Map<String, List<JSON>> keyValues = (Map<String, List<JSON>>)value;
            for (Map.Entry<String, List<JSON>> entry : keyValues.entrySet()) {
                String slotKey = entry.getKey();
                List<JSON> slotArray = entry.getValue();
                if (slotArray.size() == 0) {
                    element.putSlot(slotKey, null);
                } else if (slotArray.get(0) instanceof JSONObject) {
                    String type = getSlotType((JSONObject)slotArray.get(0));
                    for (JSON json : slotArray) {
                        String text = JSON.toJSONString(json);
                        BaseSlot slot;
                        switch (type) {
                            case SlotConstants.SLOT_TYPE_GEO_INFO:
                                slot = JSON.parseObject(text, GeoSlot.class);
                                break;
                            case SlotConstants.SLOT_TYPE_DATETIME:
                                slot = JSON.parseObject(text, DateTimeSlot.class, DATE_TIME_SLOT_PROCESSOR);
                                break;
                            case SlotConstants.SLOT_TYPE_TIME_DURATION:
                                slot = JSON.parseObject(json.toJSONString(), TimeDurationSlot.class);
                                break;
                            case SlotConstants.SLOT_TYPE_NUMBER:
                                slot = JSON.parseObject(json.toJSONString(), NumberSlot.class);
                                break;
                            case SlotConstants.SLOT_TYPE_BASIC:
                            default:
                                slot = JSON.parseObject(json.toJSONString(), BasicSlot.class);
                                break;
                        }

                        handleSlotJsonObject(element, slotKey, (JSONObject)json, type);
                        element.putSlot(slotKey, slot);
                    }
                }
            }
        }
    }

    protected void handleSlotJsonObject(NluResultElement element, String slotKey, JSONObject jsonObject, String type) {
    }
}
