package com.tpr.lamda;

public class Lamda {
    public static void main(String[] args) {
        Addition A = (a, b) -> {
            return a + b;
        };
        System.out.println("lamda example " + A.add(2, 4));
    }
}

interface Addition {
    int add(int a, int b);
}
