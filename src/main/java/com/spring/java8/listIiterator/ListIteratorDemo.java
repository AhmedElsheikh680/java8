package com.spring.java8.listIiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {
        List<String> programmingLangs = new ArrayList<>(Arrays.asList("Java", "PHP", "C++", "C#"));
        ListIterator<String> listIterator =  programmingLangs.listIterator();
        while (listIterator.hasNext()){
            String element = listIterator.next();
            System.out.println(element);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
//        ListIterator<String> iterator = programmingLangs.listIterator();
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
