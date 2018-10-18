package com.alibaba.idst.nlu.request.v3.context.nui;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * [NUI协议]请求上下文信息：地理位置信息
 */
@Data
public class NUIContextLocation {
    @JSONField(name = "longitude")
    private String longitude;

    @JSONField(name = "latitude")
    private String latitude;

    @JSONField(name = "geo")
    private NUIContextLocationGeo geo;
}
