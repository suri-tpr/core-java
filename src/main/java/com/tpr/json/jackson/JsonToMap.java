package com.tpr.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JsonToMap {
    public static void main(String[] args) throws JsonProcessingException {

        jsonToMap();
    }

    static void jsonToMap() throws JsonProcessingException {
        String jsonString = "{\n" +
                "   \"name\": \"tpr\",\n" +
                "   \"age\": \"38\",\n" +
                "   \"skills\": [ \"jave\", \"spring\"],\n" +
                "   \"qualification\": \"test\"\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> jsonMap = objectMapper.readValue(jsonString, Map.class);

        jsonMap.entrySet().forEach( (k) -> {
            System.out.println(k.getKey());
            System.out.println(k.getValue());
        });        }

    }

