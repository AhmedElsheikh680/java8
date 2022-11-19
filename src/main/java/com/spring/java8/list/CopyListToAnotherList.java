package com.spring.java8.list;

import java.util.*;
import java.util.stream.Collectors;

public class CopyListToAnotherList {

    public static void main(String[] args) {
        List<String> courses = new ArrayList<>(Arrays.asList("Java", "Js", "C#", "Ruby"));
        courses.stream().forEach(course-> System.out.println(course));
//        List<String> copyCourses = new ArrayList<>(courses);
//        System.out.println("==========");
//        copyCourses.forEach(copyCourse-> System.out.println(copyCourse));
        System.out.println("-------------------------");
//        List<String> copyCourses = new ArrayList<>();
//        copyCourses.addAll(courses);
//        copyCourses.stream().forEach(copyCourse-> System.out.println(copyCourse));

//        List<String> copyCourses = new ArrayList<>();
//        Collections.copy(copyCourses, copyCourses);
//        courses.stream().forEach(copyCourse-> System.out.println(copyCourse));

//        List<String> copyCourses = courses.stream().collect(Collectors.toList());
//        System.out.println(copyCourses);

//        List<String> copyCourses =List.copyOf(courses);
//        copyCourses.stream().forEach(copyCourse-> System.out.println(copyCourse));


    }
}
