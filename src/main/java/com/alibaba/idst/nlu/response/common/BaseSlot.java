package com.alibaba.idst.nlu.response.common;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public abstract class BaseSlot {
    private String tag;
    @JSONField(serialize = false)
    private Double score;
    @JSONField(serialize = false)
    private Integer qid;
}
