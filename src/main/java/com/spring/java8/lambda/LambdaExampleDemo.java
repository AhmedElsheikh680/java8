package com.spring.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaExampleDemo {

    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface =new MyFunctionalInterface() {
            @Override
            public void print(String str) {
                System.out.println("hello : "+ str);
            }
        };


//        List<String> list = new ArrayList<>();
//        list.add("str1");
//        list.add("str2");
//        list.add("str3");
//        list.add("str4");
////        list.stream().forEach(s -> myFunctionalInterface.add(1,2));
//        list.stream().forEach(s -> MyFunctionalInterface.ee(8,2));




        MyFunctionalInterface.ee(8,2);
        //static
        MyFunctionalInterface.sub(20,10);
        //Default
        myFunctionalInterface.add(10,10);
        myFunctionalInterface.dd(3,2);
    }
}
@FunctionalInterface
interface MyFunctionalInterface {
    void print(String str);
    default void add(int a, int b){
        System.out.println(a + b);
    }
    static void sub(int a, int b){
        System.out.println(a - b);
    }
    static void subb(int a, int b){
        System.out.println(a - b);
    }
    default void dd(int a, int b){
        System.out.println(a * b);
    }
    static void ee(int a, int b){
        System.out.println(a * b);
    }

}

