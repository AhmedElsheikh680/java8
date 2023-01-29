package com.spring.java8.amigoscode.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _function {
    public static void main(String[] args) {
        Function<Integer, Integer> incrmentNum = num-> num +1;
        int increment = incrmentNum.apply(1); //2
        Function<Integer, Integer> multiple = num-> num *5; //10
        int multi = multiple.apply(increment);
//        Function<Integer, Integer> res = multiple.andThen(incrmentNum);
//        System.out.println(res.apply(1));
        BiFunction<Integer, Integer, Integer> biFunction = (x,y)-> x*y;
        Integer apply = biFunction.apply(10, 10);
        System.out.println(apply);
    }
}
