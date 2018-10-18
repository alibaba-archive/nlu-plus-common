package com.alibaba.idst.nlu.request.v3.context.nui;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * [NUI协议]请求上下文信息：应用信息
 */

@Data
public class NUIContextApplication {
    /**
     * 客户端业务app名称（app_name）
     */
    @JSONField(name = "application_id")
    private String applicationId;

    /**
     * 客户端业务app版本
     */
    @JSONField(name = "version")
    private String version;

    /**
     * 淘系（YunOS）用户名【未登陆则不填】
     */
    @JSONField(name = "user_id")
    private String userId;

    /**
     * 客户端NUI Service名称【未使用NUI Service则不填】
     */
    @JSONField(name = "service_id")
    private String serviceId;

    /**
     * 客户端NUI Service版本【未使用NUI Service则不填】
     */
    @JSONField(name = "service_version")
    private String serviceVersion;
}
