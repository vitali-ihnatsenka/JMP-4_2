package com.epam.jmp42;

public class Main {

    public static void main(String[] args) {
        //OutOfMemoryError: Java heap space
        String bigString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        while(true){
            bigString += bigString;
        }

        //StackOverflowError
  //      methodA();
    }

    private static void methodA(){
        methodC();
    }

    private static void methodC(){
        methodA();
    }

}
