package com.spring.java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {


        Map<Integer, User> map = new HashMap<>();
        map.put(1, new User("Ahmed", 10000));
        map.put(2, new User("Zeyad", 3000));
        map.put(3, new User("Wael", 4000));
        map.put(4, new User("Ramy", 8000));

        map.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

//        map.forEach((key, value)->{
//            System.out.print(key+"      ");
//            System.out.println(value);
//        });

//        for(Map.Entry<Integer, User> entry : map.entrySet()){
//            System.out.print(entry.getKey()+ " ");
//            System.out.println(entry.getValue());
//        }
//        Iterator<Integer> iterator = map.keySet().iterator();
//        while (iterator.hasNext()){
//            Integer key = iterator.next();
//            System.out.println(key);
//            System.out.println(map.get(key));
//        }
//        Iterator<Map.Entry<Integer, User>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer, Department> next = iterator.next();
//            System.out.println(next.getKey());
//            System.out.println(next.getValue());
//        }

    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class User {

    private String name;
    private int age;

}