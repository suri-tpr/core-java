package com.tpr.json.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonToJava {
    public static void main(String[] args) throws JsonProcessingException {

        //plain json to Java
        jsonToJava();

        //ignore null values in json
        jsonToJavaByIgnoreNulls();

        //with partial JSON
        jsonToJavaWithPartialJson();


    }

    static void jsonToJava() throws JsonProcessingException {
        String jsonString = "{\n" +
                "   \"name\": \"tpr\",\n" +
                "   \"age\": \"38\",\n" +
                "   \"skills\": [ \"jave\", \"spring\"]\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Staff staff = objectMapper.readValue(jsonString, Staff.class);

        System.out.println(objectMapper.writeValueAsString(staff));

        //pretty print:
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff));


        String jsonStringWithNUll = "{\n" +
                "   \"name\": \"tpr\",\n" +
                "   \"age\": null,\n" +
                "   \"skills\": null\n" +
                "}";


        Staff staff2 = objectMapper.readValue(jsonStringWithNUll, Staff.class);
        System.out.println(objectMapper.writeValueAsString(staff2));

        //pretty print:
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2));
    }

    static void jsonToJavaByIgnoreNulls() throws JsonProcessingException {

        String jsonStringWithNUll = "{\n" +
                "   \"name\": \"tpr\",\n" +
                "   \"age\": null,\n" +
                "   \"skills\": null\n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        Staff staff = objectMapper.readValue(jsonStringWithNUll, Staff.class);


        System.out.println("Ingoring NULL values from JSON");

        System.out.println(objectMapper.writeValueAsString(staff));
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff));

    }


    static void jsonToJavaWithPartialJson() throws JsonProcessingException {

        String jsonStringWithNUll = "{\n" +
                "    \"name\": \"tpr\"\n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();

        Staff staff = objectMapper.readValue(jsonStringWithNUll, Staff.class);


        System.out.println("with partial JSON");

        System.out.println(objectMapper.writeValueAsString(staff));
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff));

    }

}
