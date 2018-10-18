package com.alibaba.idst.nlu.request.v6.context.dialog;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QUDData {
    private List<QUDItem> items;
}
