package com.spring.java8.javabrains;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExpression {

    public static void print(int[] nums, int key, BiConsumer<Integer, Integer> consumer){
        for (int num: nums){
            consumer.accept(num, key);
        }
    }
    private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer){
        return (n, k)->{
             consumer.accept(n, k);
        };
    }

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5};
        int key=2;
        print(numbers, key, wrapper((n, k)-> System.out.println(n/k)));
        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person("Ahmed", "Mohamed", 80),
                        new Person("Samy", "Gamal", 10),
                        new Person("Kamal", "Ayman", 70)
                )
        );
        long count = persons.stream().filter(p -> p.getLastName().startsWith("G"))
                .count();
        System.out.println(count);

//        Collections.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });
//        printAll(persons, p->true, p-> System.out.println(p));
//        persons.stream().forEach(person -> System.out.println(person));
//        persons.stream().sorted((p1, p2)->p2.getAge() - p1.getAge())
//                .collect(Collectors.toList()).forEach(person -> System.out.println(person));

    }
//    private static void printAll(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
//        for (Person person : persons) {
//            if (predicate.test(person)) {
//                consumer.accept(person);
//            }
//        }
//    }
}
interface Condition{
    boolean test(Person p);
}
