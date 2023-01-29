package com.spring.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface EvenOdd{
    void check(int num);
}
public class EvenOddNumber {

    public static void main(String[] args) {

//        EvenOdd evenOdd = (a)->{
//            if (a %2 ==0){
//                System.out.println("Number: "+ a + " Is Even");
//            } else {
//                System.out.println("Number: "+ a + " Is Odd");
//            }
//        };
//        evenOdd.check(11);

//        Function<Integer, String> function = (a)->{
//            if (a %2 ==0){
//                return "Number: "+ a + " Is Even";
//            } else {
//                return "Number: "+ a + " Is Odd";
//            }
//        };
//        System.out.println(function.apply(11));

//        Function<String, Integer> function = (t)->t.length();
//        Function<Integer, Integer> function2 = (num)->num *2;
//        System.out.println(function.andThen(function2).apply("Ahmed"));

//        Predicate<Integer> predicate = (Integer a)->{
//            if(a %2 ==0){
//                return true;
//            } else {
//                return false;
//            }
//        };
//        System.out.println(predicate.test(11));

        List<Integer> list = new ArrayList<>(Arrays.asList(15,7,12,3,20));
        Predicate<Integer> predicate = (x)->x>5;
        Predicate<Integer> predicate2 = (x)->x<15;
        list.stream().filter(predicate.and(predicate2)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
