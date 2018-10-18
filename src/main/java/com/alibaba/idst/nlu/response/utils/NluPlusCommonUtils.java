package com.alibaba.idst.nlu.response.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nlu.response.slot.SlotProcessor;
import com.alibaba.idst.nlu.response.v3.NLUOutputV3;

import org.apache.commons.lang3.StringUtils;

public class NluPlusCommonUtils {
    public static final SlotProcessor SLOT_PROCESSOR = new SlotProcessor();

    public static NLUOutputV3 parseObjectNLUOutputV3(String text) {
        if (StringUtils.isNotEmpty(text)) {
            return JSON.parseObject(text, NLUOutputV3.class, SLOT_PROCESSOR);
        }

        return null;
    }
}
