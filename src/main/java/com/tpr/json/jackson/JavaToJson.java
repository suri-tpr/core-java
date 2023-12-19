package com.tpr.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class JavaToJson {
    public static void main(String[] args) throws JsonProcessingException {

        //plain json to Java
        javaToJson();

        //

    }

    private static void javaToJson() throws JsonProcessingException {
        Staff staff = new Staff("tpr", "38", Arrays.asList("Java", "Spring"));
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = objectMapper.writeValueAsString(staff);
        System.out.println(jsonString);

        //pretty print
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff));



    }
}
