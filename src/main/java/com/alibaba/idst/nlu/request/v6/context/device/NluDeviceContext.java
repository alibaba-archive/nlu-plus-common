package com.alibaba.idst.nlu.request.v6.context.device;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NluDeviceContext {
    @JSONField(name = "location")
    private NluContextLocation location;

    @JSONField(name = "device_uuid")
    private String deviceUuid;

    @JSONField(name = "uid")
    private String uid;
}
