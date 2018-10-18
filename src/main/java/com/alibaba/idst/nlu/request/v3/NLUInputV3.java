package com.alibaba.idst.nlu.request.v3;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.idst.nlu.request.v3.context.prior.PriorContext;

import lombok.Data;

@Data
public class NLUInputV3 {
    private static final String NLU_VERSION = "3.0";

    @JSONField(name = "version")
    private String version = NLU_VERSION;

    @JSONField(name = "norm_query")
    private String normQuery;

    @JSONField(name = "rawQuery")
    private String rawQuery;

    @JSONField(name = "query_id")
    private String queryId;

    @JSONField(name = "request_id")
    private String requestId;

    @JSONField(name = "app_key")
    private String appKey;

    @JSONField(name = "dialog_context")
    private List<DialogContext> dialogContexts;

    @JSONField(name = "device_context")
    private DeviceContext deviceContext;

    @JSONField(name = "paraphrase")
    private String[] paraphrase;

    @JSONField(name = "prior")
    private List<PriorContext> prior;

    @JSONField(name = "optional")
    private String optional;
}
