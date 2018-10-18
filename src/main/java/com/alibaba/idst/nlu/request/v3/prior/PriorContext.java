package com.alibaba.idst.nlu.request.v3.prior;

import java.util.List;

import lombok.Data;

@Data
public class PriorContext {
    private String domain;
    private String intent;
    private List<PriorQUD> qud;
}
