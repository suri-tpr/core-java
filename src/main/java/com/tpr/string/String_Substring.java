package com.tpr.string;

public class String_Substring {
    public static void main(String[] args) {
       subString();
    }

    static void subString(){

        String s = "SachinTendulkar";

        System.out.println(s.substring(6)); //Tendulkar
        System.out.println(s.substring(0,6)); //Sachin


        //Params:
        //beginIndex – the beginning index, inclusive.
        // endIndex – the ending index, exclusive.

    }
}
