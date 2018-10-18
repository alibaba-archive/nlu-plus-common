package com.alibaba.idst.nlu.request.v6.context.device;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 请求上下文信息：地理位置信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NluContextLocation {
    @JSONField(name = "longitude")
    private String longitude;

    @JSONField(name = "latitude")
    private String latitude;

    @JSONField(name = "geo")
    private NluContextLocationGeo geo;
}
