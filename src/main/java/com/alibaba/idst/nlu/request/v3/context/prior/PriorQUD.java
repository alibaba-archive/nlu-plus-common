package com.alibaba.idst.nlu.request.v3.context.prior;

import java.util.List;

import lombok.Data;

@Data
public class PriorQUD {
    private String action;
    private List<String> expects;
    private Integer count;
    private PriorData data;
}
