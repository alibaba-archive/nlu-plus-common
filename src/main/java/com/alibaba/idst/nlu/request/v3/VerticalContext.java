package com.alibaba.idst.nlu.request.v3;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VerticalContext {
    @JSONField(name = "is_vertical_request")
    private String isVerticalRequest = "0";

    @JSONField(name = "vertical_domain")
    private String verticalDomain;

    @JSONField(name = "vertical_intent")
    private String verticalIntent;
}
