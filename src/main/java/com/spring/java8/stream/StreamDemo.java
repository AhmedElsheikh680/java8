package com.spring.java8.stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        // create Stream
//        Stream<String> stream = Stream.of("Asssssssssss", "B", "c");
//        stream.forEach(System.out::println);

        // create stream from collection
//        Collection<String> collection = Arrays.asList("Java", "PHP", "Js", "CSS");
//        Stream<String> stream = collection.stream();
//        stream.forEach(System.out::println);

        // create stream from List
//        List<String> list = Arrays.asList("Java", "Js", "C++");
//        Stream<String> stream = list.stream();
//        stream.forEach(System.out::println);

        //create stream from set
//        Set<String> set = new HashSet<>(list);
//        Stream<String> stream1 = set.stream();
//        stream1.forEach(System.out::println);

        // create stream from array
        String [] arr = {"AHmed", "Mohamed", "Ali"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
    }
}
