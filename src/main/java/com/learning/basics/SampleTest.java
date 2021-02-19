package com.learning.basics;

public class SampleTest {

    public static void main(String[] args) {

        SampleTest s1 = new SampleTest();
        s1.stringToDouble("10.0");
        s1.doubleToString(10.9);
        s1.stringToLong("10");
        stringToBoolean("false");
    }

    public void stringToDouble(String str) {
        double d1 = Double.parseDouble(str);
        System.out.println(d1);

    }

    public void doubleToString(double d2) {
        String str = String.valueOf(d2);
        System.out.println(str);

    }

    public void stringToLong(String str1) {

        long l1 = Long.parseLong(str1);
        System.out.println(l1);
    }

    static void stringToBoolean(String s1){

        Boolean b2 = Boolean.parseBoolean(s1);
        System.out.println(b2);
    }
}
