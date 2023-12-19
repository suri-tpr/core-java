package com.tpr.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File_Read {
    public static void main(String[] args) throws IOException {

        readFile_java_8(); //recommended
        readFile_java_11(); // Not recommended since it cause Out of memory exception.
    }
    static void readFile_java_8() throws IOException {

        Stream<String> lines = Files.lines(Paths.get("C:/TPR/Projects/test.txt"));
        lines.forEach(System.out::println);

    }
   static void readFile_java_11() throws IOException {

       String content =  Files.readString(Paths.get("C:/TPR/Projects/test.txt"));
       System.out.println(content); // Not recommended since it cause Out of memory exception.

    }

}
