package com.tpr.string;

public class String_Concat {
    public static void main(String[] args) {

        // different ways of concatination
       stringConcat();

    }

    static void stringConcat(){

        //with + operator
        String s1 = "sachin";
        String s2 =  s1 + " tendulkar";
        //above is equal to
        // String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();
        System.out.println("S2 with + operator " + s2);

        //with conact
        String s3="Sachin ";
        String s4=" Tendulkar";
        String s5=s3.concat(s4);
        System.out.println("S5 with concat operator " + s5);//Sachin Tendulkar

        //with SB
        StringBuilder sb1 = new StringBuilder("Hello");    //String 1
        StringBuilder sb2 = new StringBuilder(" World");    //String 2
        StringBuilder sb = sb1.append(sb2);   //String 3 to store the result
        System.out.println("SB with string builder " +  sb.toString());  //Displays result

        //with format method
        String a1 = new String("Hello");    //String 1
        String a2 = new String(" World");    //String 2
        String a3 = String.format("%s%s",a1,a2);   //String 3 to store the result
        System.out.println("A3 with format method" + a3);  //Displays result

        // String.join method
        String b1 = new String("Hello");    //String 1
        String b2 = new String(" World");    //String 2
        String b3 = String.join("",b1,b2);   //String 3 to store the result

        System.out.println("With String.join " + b3);  //Displays result
    }



}

