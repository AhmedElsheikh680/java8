package com.spring.java8.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

    public static void main(String[] args) {

        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("Mango");
        fruitCollection.add("Apple");
//        System.out.println(fruitCollection);
//        System.out.println("====");
//        fruitCollection.remove("Apple");
//        System.out.println(fruitCollection);
//        System.out.println(fruitCollection.contains("Banana"));
        fruitCollection.forEach((e)-> System.out.println(e));
        fruitCollection.clear();
        System.out.println(fruitCollection);

    }




}
