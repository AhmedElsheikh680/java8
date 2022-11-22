package com.spring.java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        List<Department> list = new ArrayList<>();
        list.add(new Department("Ahmed", 10));
        list.add(new Department("Mohamed", 50));
        list.add(new Department("Dawi", 40));
        list.add(new Department("Ramy", 100));

        Consumer<Department> consumer = (cons)->{
            System.out.println(cons.getName());
            System.out.println(cons.getAge());
        };
        consumer.accept(new Department("AAAAAAAAAAAA", 111111));
    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Department {

    private String name;
    private int age;

}
