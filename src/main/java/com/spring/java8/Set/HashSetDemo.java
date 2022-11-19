package com.spring.java8.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("python");
        courses.add("Html");
        courses.add("JS");
//        for (String course: courses){
//            System.out.println(course);
//        }
//        for (Iterator<String>iterator=courses.iterator(); iterator.hasNext();){
//            System.out.println(iterator.next());
//        }
//        Iterator<String> iterator = courses.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        courses.forEach(course-> System.out.println(course));

        courses.stream().forEach(course-> System.out.println(course));

//        Set<String> programmingLangs = new HashSet<>();
//        programmingLangs.add("Java");
//        programmingLangs.add("Java2");
//        programmingLangs.add("Java4");
//        programmingLangs.add("Java3");
//        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));
    }
}
