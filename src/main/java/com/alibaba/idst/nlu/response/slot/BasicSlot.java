package com.alibaba.idst.nlu.response.slot;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.idst.nlu.response.common.BaseSlot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class BasicSlot extends BaseSlot {

    @JSONField(name = "raw")
    private String raw;

    @JSONField(name = "norm")
    private String norm;
}
