package com.tpr.string;

public class String_Compare {
    public static void main(String[] args) {

        compareStrings();
    }


    private static void compareStrings(){

        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");

        String s4 = new String("Sachin");

        if (s1 ==s2)
        System.out.println(" S1 and S2 String objects are same");
        else
            System.out.println(" S1 and S2 String objects are not same");

        if (s1 ==s3)
            System.out.println(" S1 and S3 String objects are same");
        else
            System.out.println(" S1 and S3 String objects are not same");

        s2.concat("Tendulkar");
        System.out.println(" S2 = " + s2);

        if (s4==s3)
            System.out.println(" S4 and S3 String objects references are same");
        else
            System.out.println(" S4 and S3 String objects references are not same");


        if (s4.equals(s3))
            System.out.println(" S4 and S3 String contents are same");
        else
            System.out.println(" S4 and S3 String contents are not same");


    }

}
