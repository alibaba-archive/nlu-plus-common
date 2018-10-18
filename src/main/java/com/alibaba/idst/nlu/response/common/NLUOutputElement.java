package com.alibaba.idst.nlu.response.common;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NLUOutputElement extends NluResultElement {

    @JSONField(name = "domain_source")
    private String domainSource;

    @JSONField(name = "processer")
    private String processer;

    @JSONField(name = "session_id")
    private String sessionId;

    @JSONField(name = "session_index")
    private int sessionIndex;

    @JSONField(name = "raw_words")
    private List<String> rawWords;

    @JSONField(name = "device_geo")
    private List<String> deviceGeo;

    @JSONField(name = "intention_word")
    private String intentionWord;

    @JSONField(name = "is_specified")
    private boolean isSpecified;
}