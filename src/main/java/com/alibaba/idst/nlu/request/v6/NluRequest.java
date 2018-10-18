package com.alibaba.idst.nlu.request.v6;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.idst.nlu.request.v6.context.device.NluDeviceContext;
import com.alibaba.idst.nlu.request.v6.context.dialog.NluDialogContext;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class NluRequest {

    @JSONField(name = "version")
    private String version;

    @JSONField(name = "query")
    private String query;

    @JSONField(name = "request_id")
    private String requestId;

    @JSONField(name = "app_key")
    private String appKey;

    @JSONField(name = "dialog_context")
    private List<NluDialogContext> nluDialogContexts;

    @JSONField(name = "device_context")
    private NluDeviceContext deviceContext;

    @JSONField(name = "session_id")
    private String sessionId;

    @JSONField(name = "service")
    private String service;

    @JSONField(name = "v_log")
    private int vLog;

    @JSONField(name = "optional")
    private String optional;
}
