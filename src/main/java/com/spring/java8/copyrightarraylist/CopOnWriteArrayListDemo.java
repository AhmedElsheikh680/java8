package com.spring.java8.copyrightarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopOnWriteArrayListDemo {

    public static void main(String[] args) {
        List<String> programmingLangs = new CopyOnWriteArrayList<>(Arrays.asList("Spring Boot", "Laravel", "NodeJS"));
        Iterator<String> iterator = programmingLangs.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("Laravel")){
                programmingLangs.remove("Laravel");
            }
            if (element.equals("Spring Boot")){
                programmingLangs.add("Angular");
            }
        }
        System.out.println(">>"+programmingLangs);
    }
}
