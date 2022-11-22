package com.spring.java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Employee> supplier = ()-> new Employee("Ahmed", 40);
        Employee employee = supplier.get();
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {

    private String name;
    private int age;

}
