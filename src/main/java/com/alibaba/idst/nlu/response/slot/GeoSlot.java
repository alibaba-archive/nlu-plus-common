package com.alibaba.idst.nlu.response.slot;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.idst.nlu.response.common.BaseSlot;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class GeoSlot extends BaseSlot {

    @JSONField(name = "level_1")
    private GeoLevel country;

    @JSONField(name = "level_2")
    private GeoLevel province;

    @JSONField(name = "level_3")
    private GeoLevel city;

    @JSONField(name = "level_4")
    private GeoLevel district;

    @JSONField(name = "level_5")
    private GeoLevel township;

    @JSONField(name = "location")
    private List<GeoLocation> location;

}
