package com.spring.java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Player> predicate = (player)->player.getAge() >40;
        System.out.println(predicate.test(new Player("Ahmed", 100)));
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Player {

    private String name;
    private int age;

}

