package com.alibaba.idst.nlu.response.slot;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeoLocation {

    @JSONField(name = "raw")
    private String raw;

    @JSONField(name = "norm")
    private String norm;

    @JSONField(name = "shape")
    private String shape;

    @JSONField(name = "tag")
    private List<String> tag;
}
