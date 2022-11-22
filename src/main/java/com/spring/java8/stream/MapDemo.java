package com.spring.java8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {

        Stream<Integer> nums = Stream.of(10,20,30,40,100);
        System.out.println(nums.count());
        Integer minNumber = Stream.of(10,20,30,40,100).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min: "+ minNumber);
        Integer max= Stream.of(10,20,30,40,100).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max: "+max);

//        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
//        Optional<Integer> optional = list.stream().findAny();
//        if (optional.isPresent()){
//            System.out.println(optional.get());
//        } else {
//            System.out.println("Stream Is Empty");
//        }
//        Optional<Integer> optional = list.stream().findFirst();
//        if (optional.isPresent()){
//            System.out.println(optional.get());
//        } else {
//            System.out.println("element not Found");
//        }
    }
//        List<User> users = new ArrayList<>();
//        users.add(new User(1, "Ahmed", "123", "a@a.com"));
//        users.add(new User(2, "Gamal", "123", "g@g.com"));
//        users.add(new User(3, "Mohamed", "123", "m@m.com"));
//        users.add(new User(4, "Ramy", "123", "r@r.com"));
//        List<UserDTO> userDTOS = new ArrayList<>();
//        for (User user: users){
//            userDTOS.add(new UserDTO(user.getId(), user.getName(), user.getEmail()));
//        }
//        userDTOS.stream().forEach(System.out::println);
//        users.stream().map((User user)-> new UserDTO(user.getId(), user.getName(), user.getEmail()))
//                .collect(Collectors.toList()).forEach(System.out::println);

//        users.stream().map((User user)-> new UserDTO(user.getId(), user.getName(), user.getEmail()))
//                .collect(Collectors.toList()).forEach((userDTO -> System.out.println(userDTO)));
//
//    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class UserDTO {
    private int id;
    private String name;
    private String email;
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class User{
    private int id;
    private String name;
    private String password;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}