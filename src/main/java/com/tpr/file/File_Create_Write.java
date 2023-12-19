package com.tpr.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File_Create_Write {
    public static void main(String[] args) throws IOException {

        createFile_Java_8();
        createFile_Java_11();
    }

    static void createFile_Java_8() throws IOException {

        Path path = Paths.get("C:/TPR/Projects/test.txt");
        String content = "Hello World";

        Files.write(path, content.getBytes(StandardCharsets.UTF_8));

        //Apend content to file
        Files.write(path, content.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }

    static void createFile_Java_11() throws IOException {

        Path path = Paths.get("C:/TPR/Projects/test.txt");
        String content = "Hello World";

        String NEW_LINE = System.lineSeparator();

        Files.writeString(path, content+NEW_LINE);

        //Apend content to file
        Files.writeString(path, content+NEW_LINE, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }
}
