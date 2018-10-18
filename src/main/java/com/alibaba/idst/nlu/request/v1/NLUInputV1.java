package com.alibaba.idst.nlu.request.v1;

import lombok.Data;

@Data
public class NLUInputV1 {

    private String version = "1.0";

    private String k;

    private String domain;

    private String intent;

    private String isVerticalRequest;

    private String qud;

    private String serviceType;

    private String appKey;
}
