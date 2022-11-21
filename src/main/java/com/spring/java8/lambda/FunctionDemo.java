package com.spring.java8.lambda;

import java.time.LocalDateTime;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class FunctionDemoImpl {

//    @Override
//    public Integer apply(String s) {
//        return s.length();
//    }

}
@FunctionalInterface
interface Printable {
    void print(String message);
}
public class FunctionDemo {
    public void display(String message){
        System.out.println(message.toLowerCase());
    }
    public static void main(String[] args) {
//        Function<String, String> function = (input)->input.toLowerCase();
//        System.out.println(function.apply("AHMED")) ;

        Function<String, String> function = String::toLowerCase;
        System.out.println(function.apply("ELSHEIKH"));

//        FunctionDemo functionDemo = new FunctionDemo();
////        Printable printable = (msg) ->functionDemo.display(msg);
////        printable.print("Ahmed Mohamed");
//        Printable printable = functionDemo::display;
//        printable.print("AHMED ELSHEIKh");


//        Function<String, Integer> function = new FunctionDemoImpl();
//        System.out.println(function.apply("Ahmed"));

//        Function<String, Integer> function = (s)->s.length();
//        System.out.println(function.apply("Ali"));
//        Consumer<String> consumer = (e)-> System.out.println(e);
//        consumer.accept("Ahmed Elsheikh");

//        Function<String, Integer> fun = (s)->s.length();
//        System.out.println(fun.apply("AHmed"));
//        Consumer<String> cons = s-> System.out.println(s);
//        cons.accept("AHmed");

//        Supplier<LocalDateTime> supplier = ()-> LocalDateTime.now();
//        System.out.println(supplier.get());

//        Runnable runnable = ()-> System.out.println("Run");

//        Function<String, Integer> function= (e)->e.length();
//        System.out.println(function.apply("Ahmed"));
//        Consumer<String> consumer = (e)-> System.out.println(e);
//        consumer.accept("Ahmed");
//
//        Supplier<LocalDateTime> supplier = ()->LocalDateTime.now();
//        System.out.println(supplier.get());

//        Function<Integer, Double> function= (input) -> Math.sqrt(input);
//        System.out.println(function.apply(4));

//        Function<Integer, Double> function = Math::sqrt;
//        System.out.println(function.apply(16));

//        BiFunction<Integer, Integer, Integer> biFunction = (a,b) ->FunctionDemo.add(a, b);
//        System.out.println(biFunction.apply(10,20));

//        BiFunction<Integer, Integer, Integer> biFunction = FunctionDemo::add;
//        System.out.println(biFunction.apply(20, 20));

    }

//    public static int add(int a, int b){
//        return a+b;
//    }

}
