package com.spring.java8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ahmed", "123", "a@a.com"));
        users.add(new User(2, "Gamal", "123", "g@g.com"));
        users.add(new User(3, "Mohamed", "123", "m@m.com"));
        users.add(new User(4, "Ramy", "123", "r@r.com"));
        List<UserDTO> userDTOS = new ArrayList<>();
        for (User user: users){
            userDTOS.add(new UserDTO(user.getId(), user.getName(), user.getEmail()));
        }
        userDTOS.stream().forEach(System.out::println);

    }
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