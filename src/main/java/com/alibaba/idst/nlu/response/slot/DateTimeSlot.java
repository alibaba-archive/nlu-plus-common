package com.alibaba.idst.nlu.response.slot;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.idst.nlu.response.common.BaseSlot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DateTimeSlot extends BaseSlot {

    @Setter
    @JSONField(name = "error_code")
    private String errorCode;

    @Setter
    @JSONField(name = "raw")
    private String raw;

    @Setter
    @JSONField(name = "norm")
    private List<String> norm;

    @Setter
    @JSONField(name = "date")
    private String date;

    @Setter
    @JSONField(name = "time")
    private List<String> time;

    @JSONField(serialize = false, deserialize = false)
    private JSONObject timexObject;
    @Setter
    @JSONField(name = "relative_mode")
    private String relativeMode;
    @Setter
    @JSONField(name = "type")
    private String type;
    @Setter
    @JSONField(name = "use_week")
    private String useWeek;

    public void setTimexObject(JSONObject object) {
        this.timexObject = object;
    }

    @JSONField(name = "timex")
    public JSONObject timex() {
        return timexObject;
    }
}
