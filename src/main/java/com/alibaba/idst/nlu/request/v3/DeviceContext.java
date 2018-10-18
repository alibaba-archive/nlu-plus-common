package com.alibaba.idst.nlu.request.v3;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.idst.nlu.request.v3.context.nui.NUIContextApplication;
import com.alibaba.idst.nlu.request.v3.context.nui.NUIContextDevice;
import com.alibaba.idst.nlu.request.v3.context.nui.NUIContextLocation;

import lombok.Data;

@Data
public class DeviceContext {
    @JSONField(name = "device")
    private NUIContextDevice device;

    @JSONField(name = "application")
    private NUIContextApplication application;

    @JSONField(name = "location")
    private NUIContextLocation location;

    @JSONField(name = "vertical")
    private VerticalContext vertical;
}
