package com.tpr.tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Try_withResource {
    public static void main(String[] args) {

       // tryWithResource_Java_old();
        tryWithResource_Java_11();

    }

    static void tryWithResource_Java_old() {

        String fileName = "C:/TPR/Projects/test.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException ioe) {

        }

    }

    static void tryWithResource_Java_11() {

        String fileName = "C:/TPR/Projects/test.txt";
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException ioe) {

        }
    }

}
