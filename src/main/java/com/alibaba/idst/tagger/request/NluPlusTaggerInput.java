package com.alibaba.idst.tagger.request;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class NluPlusTaggerInput {
    @JSONField(name = "version")
    private String version;
    @JSONField(name = "query")
    private String query;
    @JSONField(name = "app_key")
    private String appKey;
    @JSONField(name = "request_id")
    private String requestId;
    @JSONField(name = "candidate_tags")
    private List<CandidateTag> candidateTags;
}
