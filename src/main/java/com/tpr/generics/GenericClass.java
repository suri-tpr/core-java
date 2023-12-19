package com.tpr.generics;

public class GenericClass {
    public static void main(String[] args) {

        Product integer = new Product<Integer>();
        Product string = new Product<String>();
        integer.add(2);
        System.out.println(integer.get());

        string.add("Two");
        System.out.println(string.get());

    }
}

class Product<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

        public T get () {
            return t;
        }
}