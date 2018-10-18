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
public class QUD {

    /**
     * dialogue act
     */
    @JSONField(name = "verb")
    private Verb verb;

    @JSONField(name = "action")
    private Action action;

    @JSONField(name = "count")
    private int count;

    @JSONField(name = "data")
    private QUDData data;

    @JSONField(name = "expects")
    private List<String> expects;

    @JSONField(name = "object")
    private String object;
}