package com.spring.java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExpressionDemo2 {
//    @FunctionalInterface
//    interface Arithemtic{
//        int operations(int a, int b);
//    }

    public static void main(String[] args) {

//        Runnable runnable = ()-> System.out.println(Thread.currentThread().getName());
//        runnable.run();

//        Arithemtic arithemtic = (a, b)->a+b;
//        System.out.println(arithemtic.operations(40, 40));

        Predicate<Product> predicate = (product)->product.getAge() >40;
        System.out.println(predicate.test(new Product("Ahmed", 100)));










//        List<Integer> list = new ArrayList<>(Arrays.asList(50,10,18,77,60,5));
//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);
////        list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList()).forEach(System.out::println);
//
//        List<Product> products =  new ArrayList<>();
//        products.add(new Product(1, "Ahmed", 2500.0));
//        products.add(new Product(2, "Zeyad", 3000.0));
//        products.add(new Product(3, "Kamal", 28000.0));
//        products.add(new Product(4, "Gamal", 9000.0));
//        Collections.sort(products, (o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
//        products.stream().forEach(System.out::println);
//    }
//    public static List<Product> getProducts(){
//        List<Product> products =  new ArrayList<>();
//        products.add(new Product(1, "Ahmed", 2500.0));
//        products.add(new Product(2, "Zeyad", 3000.0));
//        products.add(new Product(3, "Kamal", 28000.0));
//        products.add(new Product(4, "Gamal", 9000.0));
//        return products;
//    }
}}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Product {
//    private int id;
    private String name;
    private int age;
//    private double price;
}

