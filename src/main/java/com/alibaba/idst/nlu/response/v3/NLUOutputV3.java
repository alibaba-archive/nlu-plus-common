package com.alibaba.idst.nlu.response.v3;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.idst.nlu.response.common.NluResultElement;
import com.alibaba.idst.nlu.response.slot.SlotProcessor;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class NLUOutputV3 {
    public static final SlotProcessor SLOT_PROCESSOR = new SlotProcessor();

    @JSONField(name = "status")
    private String status;

    @JSONField(name = "version")
    private String version;

    @JSONField(name = "frames")
    private List<NluResultElement> frames;

    public static NLUOutputV3 parseObjectNLUOutputV3(String text) {
        if (StringUtils.isNotEmpty(text)) {
            return JSON.parseObject(text, NLUOutputV3.class, SLOT_PROCESSOR);
        }

        return null;
    }
}
