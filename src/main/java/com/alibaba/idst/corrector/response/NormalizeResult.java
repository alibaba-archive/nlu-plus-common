package com.alibaba.idst.corrector.response;

import com.alibaba.fastjson.JSONObject;

import lombok.Data;

@Data
public class NormalizeResult {
    private Double confidence;
    private String norm;
    private String raw;
    private Integer qid;
    private JSONObject timex;
}