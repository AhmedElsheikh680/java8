package com.spring.java8;

public class lambdaExpression {

    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Inside Function");
//            }
//        });
//        thread.run();



        Thread thread =new Thread(()-> System.out.println("Hello World!!!!"));
        thread.start();


    }
}
