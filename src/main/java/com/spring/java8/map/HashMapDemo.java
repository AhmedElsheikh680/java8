package com.spring.java8.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> courses = new HashMap<>();
        courses.put(1, "C");
        courses.put(2, "C++");
        courses.put(3, "Java");
        courses.put(4, "PHP");

//        Iterator<Map.Entry<Integer, String>> iterator = courses.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer, String> entry = iterator.next();
//            System.out.print(entry.getKey()+ " - ");
//            System.out.println(entry.getValue());
//        }

//        Iterator<Integer> iterator = courses.keySet().iterator();
//        while (iterator.hasNext()){
//            Integer key = iterator.next();
//            System.out.println(key);
//            System.out.println(courses.get(key));
//        }

//        for (Map.Entry<Integer, String> entry: courses.entrySet()){
//            System.out.print(entry.getKey()+" ");
//            System.out.println(entry.getValue());
//        }


//        courses.forEach((key, value)->{
//            System.out.print(key+ "=> ");
//            System.out.println(value);
//        });

//        courses.entrySet().stream().forEach((entry)-> {
//            System.out.print(entry.getKey()+" ");
//            System.out.println(entry.getValue());
//        });


    }
}
