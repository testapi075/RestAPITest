package com.learning.basics;

public class Example2ValidateString {
    public boolean validateString() {
        String str = "Welcome";
        if (str.length() > 8) {
            return false;
        }
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                   continue;
                }
                else {
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        Example2ValidateString example2ValidateString = new Example2ValidateString();
        boolean flag = example2ValidateString.validateString();
        if (flag==true){
            System.out.println("The given string is valid and is a word");
//            System.out.println("Its a word");
        }
        else{
            System.out.println("The given string is not valid string, but it could be valid number");
//            System.out.println("Its a number");
        }
    }
}
