package com.learning.basics;

public class ExampleValidateString {

    public void validateString(){
        String str = "Welcome";
        if(str.length()< 8){
            System.out.println(str +" is a valid String");
        }
        else{
            System.out.println(str +" is not a valid String");
        }

    }

    public static void main(String[] args) {
        ExampleValidateString exampleValidateString = new ExampleValidateString();
        exampleValidateString.validateString();
    }
}
