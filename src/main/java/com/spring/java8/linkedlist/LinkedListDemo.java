package com.spring.java8.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> programmingLangs = new LinkedList<>();
        programmingLangs.add("HtmL");
        programmingLangs.add("Java");
        programmingLangs.add("PHP");
        programmingLangs.add("Laravel");
        programmingLangs.add("JS");
        programmingLangs.add("NodeJs");
        programmingLangs.add("Ruby");
        programmingLangs.add("CSS");
//        boolean result = programmingLangs.contains("Java");
//        System.out.println(result);
//        int indes = programmingLangs.indexOf("Java");
//        System.out.println("Index: "+ indes);
//        int last = programmingLangs.lastIndexOf("Ruby");
//        System.out.println("LAst: "+ last);
//        for (Iterator<String>iterator=programmingLangs.iterator(); iterator.hasNext();){
//            String next = iterator.next();
//            System.out.println(next);
//        }
//        Iterator<String>iterator=programmingLangs.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next);
//        }
        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));

//        programmingLangs.removeFirst();
//        System.out.println(programmingLangs.removeLast());
//        System.out.println(programmingLangs.remove(4));
//        System.out.println(programmingLangs.remove("Ruby"));
//        System.out.println("==================");
//        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));

//        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));
//        System.out.println("FIrst Element: "+ programmingLangs.getFirst());
//        System.out.println("Last Element: "+ programmingLangs.getLast());
//        System.out.println("Get Index: "+ programmingLangs.get(3));



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
