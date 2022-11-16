package com.spring.java8.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ahmed");
        list.add("Ahmed");
        list.add("Mohame");
        list.add("Ali");
        System.out.println(list);
        list.forEach((e)->{
            System.out.println(e);
        });
        list.add(null);
        list.add(null);
        System.out.println(list);
        System.out.println("=============");
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(3);
        System.out.println(list1);
        System.out.println(list1.get(2));
        System.out.println(list1.get(0));
    }
}
