package com.learning.basics;

public class PrintEvenNos {

    public void evenNumbers(){

        for(int i=1; i<=100;i++){
            System.out.println(i);
            i=i+1;
        }
    }

    public static void main(String[] args) {
        PrintEvenNos printEvenNos = new PrintEvenNos();
        printEvenNos.evenNumbers();
    }
}
