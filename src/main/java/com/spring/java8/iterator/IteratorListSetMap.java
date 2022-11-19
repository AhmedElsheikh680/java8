package com.spring.java8.iterator;

import java.util.*;

public class IteratorListSetMap {

    public static void main(String[] args) {
//        List<String> courses = new ArrayList<>(Arrays.asList("Java", "Ruby", "C++"));
//        Iterator<String> iterator = courses.iterator();
//        while (iterator.hasNext()){
//            String course = iterator.next();
//            if ("C++".equals(course)){
//                iterator.remove();
//            }
//        }
//        System.out.println(courses);


//        Set<String> courses = new HashSet<>();
//        courses.add("Java");
//        courses.add("PHP");
//        courses.add("JS");
//        Iterator<String> iterator = courses.iterator();
//        while (iterator.hasNext()){
//            String course = iterator.next();
//            System.out.println(course);
//            if ("JS".equals(course)){
//                iterator.remove();
//            }
//        }
//        System.out.println(courses);


        Map<String, String> courses = new HashMap<>();
        courses.put("1", "Java");
        courses.put("2", "PHP");
        courses.put("3", "NodeJs");
        Iterator<String> iterator = courses.values().iterator();
        while (iterator.hasNext()){
            String course = iterator.next();
            System.out.println(course);
        }


//        Iterator<Map.Entry<String, String>> iterator = courses.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> course = iterator.next();
//            System.out.print(course.getKey()+ " ");
//            System.out.println(course.getValue());
//        }
//        courses.entrySet().stream().forEach(entry->{
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        });
    }
}
