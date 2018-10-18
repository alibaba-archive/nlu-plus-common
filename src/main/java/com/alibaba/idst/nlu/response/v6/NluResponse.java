package com.alibaba.idst.nlu.response.v6;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.idst.nlu.response.common.NluResultElement;
import com.alibaba.idst.nlu.response.slot.SlotProcessor;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class NluResponse {
    public static final SlotProcessor SLOT_PROCESSOR = new SlotProcessor();

    @JSONField(name = "error_code")
    private String errorCode;

    @JSONField(name = "error_message")
    private String errorMessage;

    @JSONField(name = "query")
    private String query;

    @JSONField(name = "version")
    private String version;

    @JSONField(name = "request_id")
    private String requestId;

    @JSONField(name = "elements")
    private List<NluResultElement> elements;

    public static NluResponse parseNluResponse(String text) {
        if (StringUtils.isNotEmpty(text)) {
            return JSON.parseObject(text, NluResponse.class, SLOT_PROCESSOR);
        }

        return null;
    }
}
