package com.spring.java8.closures;

public class ClosuresDemo {

    public static void main(String[] args) {
     Thread thread  = new Thread(ClosuresDemo::printMessage);
     thread.start();
    }

    public static void printMessage(){
        System.out.println("Print Message!!");
    }
}



