package com.alibaba.idst.nlu.request.v3;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class DialogContext {

    @JSONField(name = "dialogue_act")
    private String dialogAct;

    @JSONField(name = "domain")
    private String domain;

    @JSONField(name = "intent")
    private String intent;

    @JSONField(name = "back_domain")
    private String backDomain;

    @JSONField(name = "back_intent")
    private String backIntent;

    @JSONField(name = "intent_status")
    private int intentStatus;

    @JSONField(name = "is_confirmed")
    private boolean isConfirmed;

    @JSONField(name = "question_under_discussion")
    private List<QUD> qud;

    @JSONField(name = "selected_item")
    private String selectedItem;

    @JSONField(name = "service_result")
    private ServiceResult serviceResult;

    @JSONField(name = "session_id")
    private String sessionId;

    @JSONField(name = "slots")
    private String slots;

    @JSONField(name = "status_param")
    private String statusParam;

    @JSONField(name = "user_id")
    private String userId;
}
