package com.alibaba.idst.nlu.request.v3;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class ServiceResult {

    @JSONField(name = "data")
    private List<String> data;
}
