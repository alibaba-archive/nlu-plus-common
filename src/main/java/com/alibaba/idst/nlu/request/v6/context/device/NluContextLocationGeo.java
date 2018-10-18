package com.alibaba.idst.nlu.request.v6.context.device;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 请求上下文信息：地理位置信息：五级地理位置信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NluContextLocationGeo {
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
