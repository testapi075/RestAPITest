package com.learning.basics;

public class CheckPalindrome {
    public static void main(String[] args) {
        boolean flag = reverseString("MalaYalam");
        System.out.println(flag);
    }

    static boolean reverseString(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();

      /*  if(str.toUpperCase().equals(stringBuffer.reverse().toString().toUpperCase())){
            return true;
        }*/

        return(str.equalsIgnoreCase(stringBuffer.reverse().toString()));


    }
}


