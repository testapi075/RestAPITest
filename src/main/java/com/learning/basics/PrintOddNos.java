package com.learning.basics;

public class PrintOddNos {

    public void checkOddNosOneTo100(){
        {
            for (int i = 0; i <= 10; i++) {
                if (i %2 != 0){
                    System.out.println(i);
                }
            }

        }
    }

    public static void main(String[] args) {
        PrintOddNos printOddNos = new PrintOddNos();
        printOddNos.checkOddNosOneTo100();
    }
}
