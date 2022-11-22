package com.spring.java8.optional;

import java.util.Optional;

public class optionalDemo {

    public static void main(String[] args) {
        String email = null;
        Optional<String> email1 = Optional.ofNullable(email);
        String s = email1.orElse("m@m.com");
        System.out.println(s);
       String defaultOptional =  email1.orElseGet(()-> "k@k.com");
        System.out.println(defaultOptional);

//       String defaultOptional2 =  email1.orElseThrow(() -> new IllegalArgumentException("Email Not Exist"));
//        System.out.println(defaultOptional2);

        Optional<String> gender= Optional.of("MALE");
        Optional<Object> empty = Optional.empty();
        gender.ifPresent((sd)-> System.out.println("VALUE IS PRESENT!!!!"));
        empty.ifPresent((dd)-> System.out.println("EMAIL NOT PRESENT"));

//        Optional<Object> empty = Optional.empty();
//        System.out.println(empty);

//        Optional<String> email1 = Optional.of(email);
//        System.out.println(email);
//        Optional<String> email1 = Optional.ofNullable(email);
//        if (email1.isPresent()){
//            System.out.println(email1.get());
//        } else {
//            System.out.println("No Value Present!!!!!!!!!!!");
//        }
    }

}
