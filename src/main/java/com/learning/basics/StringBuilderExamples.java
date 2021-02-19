package com.learning.basics;

public class StringBuilderExamples {
    public static void main(String[] args) {
        StringBuilderExamples stringBuilderExamples = new StringBuilderExamples();
        stringBuilderExamples.appendString();
    }

    public void  appendString() {
        String str1 = "Welcome";
        String str2 = "to";
        String str3 = "Java";
        StringBuffer stringBuffer = new StringBuffer("Hello James");
        stringBuffer.append(" ").append(str1).append(" ")
                .append(str2).append(" ")
                .append(str3);
        System.out.println(stringBuffer);

    }
}
