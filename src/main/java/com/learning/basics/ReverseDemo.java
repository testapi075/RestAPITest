package com.learning.basics;

public class ReverseDemo {
    public static void main(String[] args) {

        String str = "malayalaM";
        String revString = "";
        System.out.println(reverseString(str));
    }

    static String reverseString(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }
}
