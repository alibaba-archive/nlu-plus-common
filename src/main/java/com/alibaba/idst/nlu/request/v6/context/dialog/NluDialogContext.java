package com.alibaba.idst.nlu.request.v6.context.dialog;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NluDialogContext {
    @JSONField(name = "domain")
    private String domain;

    @JSONField(name = "intent")
    private String intent;

    @JSONField(name = "question_under_discussion")
    private List<QUD> quds;

    @JSONField(name = "optimize_target")
    private OptimizeTarget optimizeTarget;

    @JSONField(name = "round_index")
    private Integer roundIndex;
}
