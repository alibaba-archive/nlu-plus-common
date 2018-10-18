package com.alibaba.idst.nlu.response.slot;

import java.util.List;

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
public class NumberSlot extends BaseSlot {

    @JSONField(name = "raw")
    private String raw;

    @JSONField(name = "type")
    private String type;

    @JSONField(name = "norm")
    private List<Integer> norm;
}
