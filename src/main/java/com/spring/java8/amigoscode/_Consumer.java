package com.spring.java8.amigoscode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
//
//import static com.spring.java8.amigoscode.CustomerValidator.ValidationResult.*;
//import static com.spring.java8.amigoscode._Consumer.Gender.FEMALE;
//import static com.spring.java8.amigoscode._Consumer.Gender.MALE;

public class _Consumer {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));

//        Customer customer = new Customer(
//                "aa",
//                "zz"
//        )

//        Object obj = Optional.ofNullable("Ahmed").orElseGet(() -> "Default Value");
//        System.out.println(obj);
//        Object o = Optional.ofNullable(null).orElseThrow(() -> new IllegalArgumentException("Invalid!!"));
//        System.out.println(o);
//        Optional.ofNullable("aaaaaaaaaaaa").ifPresent(System.out::println);
//        Optional.ofNullable(null ).ifPresentOrElse(System.out::println, ()-> System.out.println("dddddddddddddd"));
//            greetCustomer(new Customer("Ahmed", "1111111111111"));
//        Customer customer = new Customer("Ahmed", "111111111111111");
//        consumer.accept(customer);
//        Customer customer = new Customer("Ahmed", "");
//        cons.accept(customer, false);
//        System.out.println(predicate.test("012712658978"));
//        System.out.println(predicate.and(predicate2).test("01278485269"));
//        System.out.println(supplier.get());

//        List<Customer> customers= List.of(
//                new Customer("Ahmed", MALE),
//                new Customer("Mohamed", MALE),
//                new Customer("Mohamed", MALE),
//                new Customer("Mohamed", FEMALE)
//        );
//        boolean res = customers.stream().noneMatch(customer -> FEMALE.equals(customer.gender));
//        System.out.println(res);
//        customers.stream()
//                .map(customer-> customer.name)
//                .mapToInt(String::length)
//
//                .forEach(System.out::println);

    }

//    static Supplier<List<String>> supplier = ()-> List.of("http://localhost:5432/users");

//    static Predicate<String> predicate = phone-> phone.startsWith("012")&& phone.length()==11;

//    static Predicate<String> predicate2 = phone-> phone.contains("8");

//    static BiConsumer<Customer, Boolean> cons = ((customer, showphoneNO) ->{
//        System.out.println(showphoneNO? customer.getName() : "**********************");
//    } );

//    static void greetCustomer(Customer customer){
//        System.out.println("Name: "+ customer.getName()+ " Phone: "+ customer.getName());
//    }
    //Consumer
//    static Consumer<Customer> consumer = customer -> System.out.println("Name: "+ customer.getName()+ " Phone: "+ customer.getPhone());

//    @Data
//    @AllArgsConstructor
//    @NoArgsConstructor
//    static class Customer{
//
//        private String name;
//        private String mail;
//        private String phone;
//        private LocalDate dob;
//
//    }

//    enum Gender{
//        MALE, FEMALE
//    }
}

//interface CustomerValidator extends Function<_Consumer.Customer, CustomerValidator.ValidationResult>{
//    static CustomerValidator isEmailValid(){
//        return customer -> customer.getMail().contains("@")? SUCCESS : PHONE_NO_NOT_VALID;
//    }
//    static CustomerValidator isPhoneValid(){
//        return customer -> customer.getPhone().startsWith("+20") ? SUCCESS: PHONE_NO_NOT_VALID;
//    }
//    static CustomerValidator isDateValid(){
//        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()> 16  ? SUCCESS: DOB_NOT_FOUND;
//    }
//    enum ValidationResult {
//        SUCCESS, PHONE_NO_NOT_VALID, DOB_NOT_FOUND
//    }
}
