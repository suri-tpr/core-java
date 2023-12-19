package com.tpr.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {

        Product2 product2 = new Product2();
        product2.add(2);
        product2.add("abc");
        product2.display();


    }
}

class Product2 {

    List<Integer> iList = new ArrayList<>();
    List<String> sList = new ArrayList<>();

    public <T> void add(T t) {
        if (t instanceof Integer)
            iList.add((Integer) t);

        if (t instanceof String)
            sList.add((String) t);

    }

    void display(){
        iList.forEach(System.out::println);
        sList.forEach(System.out::print);

    }


}