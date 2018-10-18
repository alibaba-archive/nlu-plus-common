package com.alibaba.idst.nlu.response.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Getter;
import lombok.Setter;

@Getter
public class NluResultElement {
    public static final String SOURCE_TYPE_MODEL = "model";
    public static final String SOURCE_TYPE_COMMON = "common";
    public static final String SOURCE_TYPE_CORRECT = "correct";

    public static final String SOURCE_JSGF = "jsgf";
    public static final String SOURCE_JSGF_CORRECT = "jsgf_correct";
    public static final String SOURCE_MODEL = "model";
    public static final String SOURCE_MODEL_CORRECT = "model_correct";

    @Setter
    @JSONField(name = "domain")
    private String domain;

    @Setter
    @JSONField(name = "intent")
    private String intent;

    @Setter
    @JSONField(name = "back_domain")
    private String backDomain;

    @Setter
    @JSONField(name = "back_intent")
    private String backIntent;

    @Setter
    @JSONField(name = "classify_type")
    private String classifyType;

    @Setter
    @JSONField(name = "score")
    private double score;

    @Setter
    @JSONField(name = "intentionName")
    private String intentionName;

    @Setter
    @JSONField(name = "raw_score")
    private double rawScore;

    @Setter
    @JSONField(name = "keywords")
    private List<String> keywords;

    @JSONField(serialize = false, deserialize = false)
    private Map<String, List<BaseSlot>> slotMap = new HashMap<>();
    @Setter
    @JSONField(name = "source")
    private String source;
    @Setter
    @JSONField(name = "source_type")
    private String sourceType;

    @JSONField(name = "slots")
    public Map<String, List<BaseSlot>> slots() {
        return slotMap;
    }

    public void putSlot(String key, BaseSlot slot) {
        if (slot == null) {
            slotMap.computeIfAbsent(key, k -> new ArrayList<>());
        } else {
            slotMap.computeIfAbsent(key, k -> new ArrayList<>()).add(slot);
        }
    }

    public void removeSlot(String name) {
        slots().remove(name);
    }

    public BaseSlot getSlot(String name) {
        List<BaseSlot> slots = slots().get(name);
        if (slots != null && slots.size() > 0) {
            return slots.get(0);
        } else {
            return null;
        }
    }

    public String getSlotStringValue(String name) {
        BaseSlot slot = getSlot(name);
        if (slot != null) {
            return slot.toString();
        } else {
            return "";
        }
    }

    public String[] getSlotStringValues(String name) {
        List<BaseSlot> slots = slots().get(name);
        if (slots == null || slots.size() < 1) {
            return null;
        }
        return slots.stream().map(Object::toString).toArray(String[]::new);
    }
}