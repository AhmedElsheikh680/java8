package com.spring.java8.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> programmingLangs = new LinkedList<>();
        programmingLangs.add("Java");
        programmingLangs.add("PHP");
        programmingLangs.add("Laravel");
        programmingLangs.add("JS");
        programmingLangs.add("CSS");
        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));
        System.out.println("FIrst Element: "+ programmingLangs.getFirst());
        System.out.println("Last Element: "+ programmingLangs.getLast());
        System.out.println("Get Index: "+ programmingLangs.get(3));


//        LinkedList<String> programmingLangs = new LinkedList<>();
//        programmingLangs.add("Java");
//        programmingLangs.add("PHP");
//        programmingLangs.add("JS");
//        programmingLangs.add("HTML");
//        programmingLangs.add("CSS");
//        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));
//        System.out.println("================");
//        programmingLangs.add("Ruby");
//        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));
//        System.out.println("===============");
//        programmingLangs.add(2, "Angular");
//        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));
//        System.out.println("=================");
//        programmingLangs.addFirst("Microservice");
//        programmingLangs.addLast("Design Pattern");
//        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));
    }
}