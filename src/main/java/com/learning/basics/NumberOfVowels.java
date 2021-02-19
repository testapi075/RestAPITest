package com.learning.basics;


public class NumberOfVowels {

    static void countVowels(){
        String newWord =  "Welcome to Java";
        int count = 0;
        for(int i=0;i<newWord.length();i++){
            char c = newWord.charAt(i);
            if(c =='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count ++;
            }
        }
        System.out.println("The count is "+ count);
    }

    public static void main(String[] args) {
        countVowels();
    }

}
