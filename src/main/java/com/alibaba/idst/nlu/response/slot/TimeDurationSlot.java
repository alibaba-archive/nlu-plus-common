package com.alibaba.idst.nlu.response.slot;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class TimeDurationSlot extends BasicSlot {

    @JSONField(name = "timex")
    private String timeX;

}
