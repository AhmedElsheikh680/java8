package com.spring.java8.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> programmingLangs= new ArrayList<>();
        System.out.println("Are Programming Langs Is Empty?: "+ programmingLangs.isEmpty());
        programmingLangs.add("Java");
        programmingLangs.add("PHP");
        programmingLangs.add("C#");
        programmingLangs.add("C++");
        System.out.println("SIZE: "+ programmingLangs.size());

        System.out.println("GET INDEX: "+ programmingLangs.get(1));
        programmingLangs.set(3, "Spring Boot");
        programmingLangs.forEach((e)-> System.out.println(e));

//        List<Integer> primeNumbers= new ArrayList<>();
//        primeNumbers.add(2);
//        primeNumbers.add(3);
//        primeNumbers.add(5);
//        primeNumbers.add(7);
//        primeNumbers.add(11);
//
//        List<Integer> tenPrimenumbers= new ArrayList<>(primeNumbers);
//        List<Integer> fivePrimeNumbers = new ArrayList<>();
//        fivePrimeNumbers.add(13);
//        fivePrimeNumbers.add(17);
//        fivePrimeNumbers.add(19);
//        fivePrimeNumbers.add(23);
//        fivePrimeNumbers.add(29);
//        tenPrimenumbers.addAll(fivePrimeNumbers);
//        tenPrimenumbers.forEach((e)-> System.out.println(e));


//        List<String> list = new ArrayList<>();
//        list.add("Ahmed");
//        list.add("Ahmed");
//        list.add("Mohame");
//        list.add("Ali");
//        System.out.println(list);
//        list.forEach((e)->{
//            System.out.println(e);
//        });
//        list.add(null);
//        list.add(null);
//        System.out.println(list);
//        System.out.println("=============");
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(4);
//        list1.add(3);
//        System.out.println(list1);
//        System.out.println(list1.get(2));
//        System.out.println(list1.get(0));
    }
}
