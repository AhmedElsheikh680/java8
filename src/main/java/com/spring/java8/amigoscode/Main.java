package com.spring.java8.amigoscode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.spring.java8.amigoscode.Main.Gender.FEMALE;
import static com.spring.java8.amigoscode.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ahmed", MALE),
                new Person("Mohamed", MALE),
                new Person("Basma", FEMALE),
                new Person("Amira", FEMALE),
                new Person("Sara", FEMALE)
        );
        Predicate<Person> predicate = p->FEMALE.equals(p.gender);
        persons
                .stream().filter(predicate)
                .collect(Collectors.toList()).forEach(System.out::println);
//        List<Person> females = new ArrayList<>();
//        persons.stream().forEach((e)->{
//            if (FEMALE.equals(e.gender)){
//                females.add(e);
//            }
//        });
//        females.stream().forEach(System.out::println);

    }
    @Data
    @AllArgsConstructor

    static class Person{
        private final String name;
        private final Gender gender;
    }
    enum Gender{
        MALE, FEMALE
    }
}
