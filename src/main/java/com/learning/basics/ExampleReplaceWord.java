package com.learning.basics;

public class ExampleReplaceWord {

    public void replaceWord(){

        String str = "I am learning C++ programming";
        str = str.replace("C++","Java");
        System.out.println(str);
    }

    public static void main(String[] args) {
        ExampleReplaceWord exampleReplaceWord = new ExampleReplaceWord();
        exampleReplaceWord.replaceWord();
    }
}
