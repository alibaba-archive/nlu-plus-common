package com.alibaba.idst.nlu.request.v3;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * question under discussion
 * 提供给NLU的辅助信息
 */

@Data
public class QUD {

    public static final String VERB_ASK_SLOT = "ask_slot";
    public static final String VERB_MULTI_DOMAIN = "process_multi_domain";

    @JSONField(name = "count")
    private int count;

    @JSONField(name = "object")
    private String object;

    @JSONField(name = "verb")
    private String verb;

    /**
     * 动作
     * 取值有:ask_slot, select, dontcare, confirm_intent
     * 与verb相同，后续废掉verb，统一使用action
     */
    @JSONField(name = "action")
    private String action;

    @JSONField(name = "expects")
    private List<String> expects = new ArrayList();

    /**
     * 业务数据的json字符串
     * 可选, 如需对列表处理时，如select, 则需同步当前页面列表
     */
    @JSONField(name = "data")
    private String data;

    public String getVerb() {
        return getAction();
    }

    public void setVerb(String verb) {
        this.action = verb;
        this.verb = verb;
    }

    public void setAction(String action) {
        this.action = action;
        this.verb = action;
    }

    public void setExpects(List<String> expects) {
        this.expects = expects;

        //object取expects第一个值
        if (expects != null && expects.size() > 0) {
            setObject(expects.get(0));
        }
    }

}
