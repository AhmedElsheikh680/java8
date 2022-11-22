package com.spring.java8.lambda;

import com.spring.java8.javabrains.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerDemo {

    public static void main(String[] args) {
//        List<Department> list = new ArrayList<>();
//        list.add(new Department("Ahmed", 10));
//        list.add(new Department("Mohamed", 50));
//        list.add(new Department("Dawi", 40));
//        list.add(new Department("Ramy", 100));

//        Set<Department> set = new HashSet<>();
//        set.add(new Department("Ahmed", 10));
//        set.add(new Department("Mohamed", 50));
//        set.add(new Department("Dawi", 40));
//        set.add(new Department("Ramy", 100));
//        set.stream().forEach(System.out::println);

        Map<Integer, Department> map = new HashMap<>();
        map.put(1, new Department("Ahmed", 10000));
        map.put(2, new Department("Zeyad", 3000));
        map.put(3, new Department("Wael", 4000));
        map.put(4, new Department("AhRamymed", 8000));

        map.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

//        map.forEach((key, value)->{
//            System.out.print(key+"      ");
//            System.out.println(value);
//        });

//        for(Map.Entry<Integer, Department> entry : map.entrySet()){
//            System.out.print(entry.getKey()+ " ");
//            System.out.println(entry.getValue());
//        }
//        Iterator<Integer> iterator = map.keySet().iterator();
//        while (iterator.hasNext()){
//            Integer key = iterator.next();
//            System.out.println(key);
//            System.out.println(map.get(key));
//        }
//        Iterator<Map.Entry<Integer, Department>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer, Department> next = iterator.next();
//            System.out.println(next.getKey());
//            System.out.println(next.getValue());
//        }


//        Consumer<Department> consumer = (cons)->{
//            System.out.println(cons.getName());
//            System.out.println(cons.getAge());
//        };
//        consumer.accept(new Department("AAAAAAAAAAAA", 111111));
    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Department {

    private String name;
    private int age;

}
