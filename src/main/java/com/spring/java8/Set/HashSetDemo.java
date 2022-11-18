package com.spring.java8.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> programmingLangs = new HashSet<>();
        programmingLangs.add("Java");
        programmingLangs.add("Java2");
        programmingLangs.add("Java4");
        programmingLangs.add("Java3");
        programmingLangs.stream().forEach(programmingLang-> System.out.println(programmingLang));
    }
}
