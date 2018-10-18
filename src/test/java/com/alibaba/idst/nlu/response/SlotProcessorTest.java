package com.alibaba.idst.nlu.response;

import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nlu.response.slot.SlotProcessor;
import com.alibaba.idst.nlu.response.v3.NLUOutputV3;

import org.junit.Test;

public class SlotProcessorTest {
    private SlotProcessor processor = new SlotProcessor();

    @Test
    public void testSlotProcessor() {
        String text = "{\n" +
            "    \"frames\": [\n" +
            "        {\n" +
            "            \"back_domain\": \"music\",\n" +
            "            \"back_intent\": \"play_music\",\n" +
            "            \"classify_type\": \"neural_network_classifier\",\n" +
            "            \"dialog_session_id\": \"\",\n" +
            "            \"domain\": \"music\",\n" +
            "            \"intent\": \"play_music\",\n" +
            "            \"intentionName\": \"音乐\",\n" +
            "            \"keywords\": [],\n" +
            "            \"raw_score\": 0.7042152285575867,\n" +
            "            \"score\": 0.4132196548634413,\n" +
            "            \"slots\": {\n" +
            "                \"geo\": [\n" +
            "                    {\n" +
            "                        \"level_1\": {},\n" +
            "                        \"level_2\": {},\n" +
            "                        \"level_3\": {\n" +
            "                            \"norm\": \"北京\",\n" +
            "                            \"raw\": \"北京\"\n" +
            "                        },\n" +
            "                        \"level_4\": {},\n" +
            "                        \"level_5\": {},\n" +
            "                        \"location\": []\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"song\": [],\n" +
            "                \"mood\": [],\n" +
            "                \"artist\": [\n" +
            "                    {\n" +
            "                        \"norm\": \"刘德华\",\n" +
            "                        \"raw\": \"刘德华\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"number\": [\n" +
            "                    {\n" +
            "                        \"type\": \"interval\",\n" +
            "                        \"norm\": [\n" +
            "                            100,\n" +
            "                            200\n" +
            "                        ],\n" +
            "                        \"raw\": \"RMB\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"album\": [],\n" +
            "                \"time\": [\n" +
            "                    {\n" +
            "                        \"error_code\": \"0\",\n" +
            "                        \"norm\": [\n" +
            "                            \"2017-08-12 00:00:00\",\n" +
            "                            \"2017-08-12 23:59:59\"\n" +
            "                        ],\n" +
            "                        \"raw\": \"周六\",\n" +
            "                        \"relative_mode\": \"0\",\n" +
            "                        \"time\": [],\n" +
            "                        \"timex\": {\n" +
            "                            \"type\": \"DATE\",\n" +
            "                            \"value\": \"XXXX-WSAXX\"\n" +
            "                        },\n" +
            "                        \"type\": \"interval\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            \"source\": \"model\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"status\": \"0\",\n" +
            "    \"version\": \"5.0\"\n" +
            "}";

        NLUOutputV3 element = JSON.parseObject(text, NLUOutputV3.class, processor);

        System.out.println(JSON.toJSONString(element));
    }

}
