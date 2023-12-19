package com.tpr.optional;

import java.util.Optional;

public class Optional_Example {
    public static void main(String[] args) {
        Product product = null;
        Product product2 = new Product("1", "test");
        Optional.ofNullable(product).ifPresentOrElse(product1 -> display(product1), () -> display());

        Optional.ofNullable(product).orElseThrow(() -> new RuntimeException("Object is null"));
    }

    static void display(Product product) {
        System.out.println(product.getPanme());
    }

    static void display() {
        System.out.println("product is empty");
    }


}

class Product {
    String pid;
    String panme;

    public Product(String pid, String panme) {
        this.pid = pid;
        this.panme = panme;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPanme() {
        return panme;
    }

    public void setPanme(String panme) {
        this.panme = panme;
    }



}