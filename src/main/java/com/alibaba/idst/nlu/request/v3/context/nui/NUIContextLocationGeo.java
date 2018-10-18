package com.alibaba.idst.nlu.request.v3.context.nui;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * [NUI协议]请求上下文信息：地理位置信息：五级地理位置信息
 */
@Data
public class NUIContextLocationGeo {
    @JSONField(name = "level1")
    private String level1;

    @JSONField(name = "level2")
    private String level2;

    @JSONField(name = "level3")
    private String level3;

    @JSONField(name = "level4")
    private String level4;

    @JSONField(name = "level5")
    private String level5;
}
