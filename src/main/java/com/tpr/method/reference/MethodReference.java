package com.tpr.method.reference;

public class MethodReference {
    public static void main(String[] args) {

        //static method reference
        Product p = MethodReference::hello;
        p.addProduct();

        //instance method reference
        Product p1 = new MethodReference()::sayHello;
        p1.addProduct();

    }

    static void hello(){

        System.out.println("Staic method Hello");
    }

    void sayHello(){
        System.out.println("Instanace method Hello");
    }


}
interface Product{

    void addProduct();
}