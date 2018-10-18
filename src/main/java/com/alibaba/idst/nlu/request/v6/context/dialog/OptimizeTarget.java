package com.alibaba.idst.nlu.request.v6.context.dialog;

public enum OptimizeTarget {
    /**
     * 提供给模型算法使用
     */
    model,

    /**
     * 提供给grammar-slu算法使用
     */
    grammar,

    /**
     * 两者均提供
     */
    both
}
