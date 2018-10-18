package com.alibaba.idst.nlu.response.slot;

import java.lang.reflect.Type;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;

public class DateTimeSlotProcessor implements ExtraTypeProvider, ExtraProcessor {
    private static final String JSON_FIELD_TAG_TIMEX = "timex";

    @Override
    public Type getExtraType(Object object, String key) {
        if (key.equals(JSON_FIELD_TAG_TIMEX)) {
            return new TypeReference<JSON>() {
            }.getType();
        }

        return null;
    }

    @Override
    public void processExtra(Object object, String key, Object value) {
        if (key.equals(JSON_FIELD_TAG_TIMEX) && value != null) {
            if (object instanceof DateTimeSlot) {
                if (value != null && !"".equals(value)) {
                    try {
                        DateTimeSlot dateTimeSlot = (DateTimeSlot)object;
                        JSONObject jsonObject = (JSONObject)value;
                        dateTimeSlot.setTimexObject(jsonObject);
                    } catch (Exception ignored) {
                    }
                }
            }
        }
    }
}
