package com.alibaba.idst.nlu.response.slot;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeoLevel {

    @JSONField(name = "raw")
    private String raw;

    @JSONField(name = "norm")
    private String norm;
}
