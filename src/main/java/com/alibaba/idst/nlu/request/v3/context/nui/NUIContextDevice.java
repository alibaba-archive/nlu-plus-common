package com.alibaba.idst.nlu.request.v3.context.nui;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * [NUI协议]请求上下文信息：设备信息
 */
@Data
public class NUIContextDevice {
    /**
     * 设备UUID
     */
    @JSONField(name = "device_uuid")
    private String deviceUuid;

    /**
     * 设备IMEI
     */
    @JSONField(name = "device_imei")
    private String deviceImei;

    /**
     * 设备MAC
     */
    @JSONField(name = "device_mac")
    private String deviceMac;

    /**
     * 设备类型，如car、phone、watch
     */
    @JSONField(name = "device_type")
    private String deviceType;

    /**
     * 设备品牌【无则不填】
     */
    @JSONField(name = "device_brand")
    private String deviceBrand;

    /**
     * 设备产品具体型号
     */
    @JSONField(name = "device_model")
    private String deviceModel;

    /**
     * 操作系统类型，如yunos，android，iphone
     */
    @JSONField(name = "os_type")
    private String osType;

    /**
     * 操作系统版本
     */
    @JSONField(name = "os_version")
    private String osVersion;

    /**
     * 设备网络接入类型，如wifi、4G
     */
    @JSONField(name = "network_type")
    private String networkType;

    /**
     * 设备区域
     */
    @JSONField(name = "system_locale")
    private String systemLocale;

    /**
     * 设备时区
     */
    @JSONField(name = "timezone")
    private String timezone;

    /**
     * 本地时间
     */
    @JSONField(name = "localtime")
    private long localtime;
}
