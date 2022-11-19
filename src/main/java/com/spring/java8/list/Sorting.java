package com.spring.java8.list;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Sorting {

    public static void main(String[] args) {
//        List<Integer> courses = new ArrayList<>(Arrays.asList(20, 10, 70,30,90));
//        Collections.sort(courses);
//        courses.stream().forEach(course-> System.out.println(course));
//        Collections.reverse(courses);
//        System.out.println("==============");
//        courses.stream().forEach(course-> System.out.println(course));

        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(1, "Ahmed", 25, 50000));
        emps.add(new Employee(2, "Sameh", 50, 20000));
        emps.add(new Employee(3, "Nasr", 40, 200000));

        Collections.sort(emps, (emp1, emp2)-> (int) (emp2.getSalary() - emp1.getSalary()));
        emps.stream().forEach(emp-> System.out.println(emp));
//        Collections.sort(emps, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o2.getSalary() - o1.getSalary());
//            }
//        });
//        emps.stream().forEach(emp-> System.out.println(emp));

//        Collections.sort( emps, new MySort());
//        emps.stream().forEach(emp-> System.out.println(emp));
//    }
}}
//class MySort implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        return (int) (emp2.getSalary() - emp1.getSalary());
//    }
//}
