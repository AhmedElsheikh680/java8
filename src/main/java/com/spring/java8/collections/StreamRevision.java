package com.spring.java8.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

public class StreamRevision {
    public static void main(String[] args) {

        int [] arr1 = {10,20,30};
        int [] arr2 = {10,20,30};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr2));

//        int[] marks = {5,8,2,11,7,20,3};
//        int [] marks = new int[7];
//        marks[0]=4;
//        marks[1]=15;
//        marks[2]=8;
//        marks[3]=3;
//        marks[4]=17;
//        marks[5]=6;
//        marks[6]=12;
//        System.out.println("Length: "+ marks.length);
//        Arrays.fill(marks, 100);
//        System.out.println(Arrays.toString(marks));
//        for (int mark: marks){
//            System.out.println(mark);
//        }

//        for (int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }
//        Arrays.stream(marks).forEach(System.out::println);
//        System.out.println("Find FIrst: "+Arrays.stream(marks).findFirst());
//        System.out.println("Find Any: "+ Arrays.stream(marks).findAny());
//        OptionalInt opt = Arrays.stream(marks).max();
//        if (opt.isPresent()){
//            System.out.println("Max: "+ opt.getAsInt());
//        }
//        OptionalInt optMin = Arrays.stream(marks).min();
//        if (opt.isPresent()){
//            System.out.println("Min: "+ optMin.getAsInt());
//        }
//        System.out.println("Count: "+ Arrays.stream(marks).count());
//        Arrays.stream(marks).sorted().forEach(System.out::println);
//        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
//        System.out.println(nums.stream().count());
//        System.out.println("Min: "+ nums.stream().min(Comparator.comparing(Integer::valueOf)).get());
//        System.out.println("Max: "+ nums.stream().max(Comparator.comparing(Integer::valueOf)).get());


//        Optional<Integer> element = nums.stream().findAny();
//        if (element.isPresent()){
//            System.out.println(element.get());
//        } else {
//            System.out.println("Stream Is Empty");
//        }

//        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
//        Optional<Integer> element = nums.stream().findFirst();
//        if (element.isPresent()){
//            System.out.println(element.get());
//        } else {
//            System.out.println("Stream Is Empty!!!!!!!");

//        List<User> users = new ArrayList<>();
//        users.add(new User(1, "Ahmed", "123", "a@a.com"));
//        users.add(new User(2, "Mohamed", "147", "m@m.com"));
//        users.add(new User(3, "Hany", "852", "h@h.com"));
//        users.stream().map((User user)-> new UserDTO(user.getId(), user.getUserName(), user.getEmail())).collect(Collectors.toList()).forEach(System.out::println);
//        List<UserDTO> userDTOS = new ArrayList<>();
//        for(User user: users){
//            userDTOS.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
//        }
//        for (UserDTO userDTO: userDTOS){
//            System.out.println(userDTO);
//        }

//        List<Integer> nums= Arrays.asList(1, 2, 3, 4, 5);
//        nums.stream().map(num->num *2).collect(Collectors.toList()).forEach(System.out::println);

//        List<String> courses = Arrays.asList("Ahmed", "Mohamed", "Ali", "Elsheikh", "Sameh", "Gamal");
//        courses.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
//        List<String> allCourses   = new ArrayList<>();
//        for (String s: courses){
//            allCourses.add(s.toUpperCase());
//        }

//        List<Employee> employees =new ArrayList<>();
//        employees.add(new Employee(1, "Ahmed", 80, 80000));
//        employees.add(new Employee(2, "Mohamed", 50, 55000));
//        employees.add(new Employee(3, "Hany", 60, 300000));
//        employees.add(new Employee(4, "Samy", 40, 60000));
//        employees.add(new Employee(5, "Zeyad", 10, 852147));


//        employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(System.out::println);
//        employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()).forEach(System.out::println);
//        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::println);
//        employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList()).forEach(System.out::println);
//        employees.stream().sorted(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o2.getSalary() - o1.getSalary());
//            }
//        }).collect(Collectors.toList()).forEach(System.out::println);
//        employees.stream().sorted((o1,o2)->(int)(o2.getSalary() - o1.getSalary())).collect(Collectors.toList()).forEach(System.out::println);

//        List<String> courses = new ArrayList<>();
//        courses.add("Java");
//        courses.add("Mysql");
//        courses.add("Spring Boot");
//        courses.add("Angular");
//        courses.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
//        courses.stream().sorted((o1, o2)-> o2.compareTo(o1)).collect(Collectors.toList()).forEach(System.out::println);
//        courses.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
//        courses.stream().sorted((o1, o2)-> o1.compareTo(o2)).collect(Collectors.toList()).forEach(System.out::println);
//        courses.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);

//        List<Product> allProducts = new ArrayList<>();
//        products().stream().filter((prod-> prod.getPrice()>0)).collect(Collectors.toList()).forEach(System.out::println);
//        products().stream().filter((product -> product.getPrice() >7000f)).collect(Collectors.toList()).forEach(System.out::println);

//        for (Product product: products()){
//            allProducts.add(product);
//        }
//        allProducts.stream().forEach(System.out::println);
    }
//    public static List<Product> products(){
//        List<Product> products = new ArrayList<>();
//        products.add(new Product(1,"HP Loptop", 5000f));
//        products.add(new Product(2, "DELL Laptop", 7000f));
//        products.add(new Product(3,"LENOVO Laptop", 5000f));
//        products.add(new Product(4, "SONY Laptop", 17000f));
//        return products;
//
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Product {
    private int id;
    private String name;
    private float price;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class User {
    private int id;
    private String userName;
    private String password;
    private String email;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class UserDTO {
    private int id;
    private String userName;
    private String email;
}
