package com.spring.java8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
    for (Product product: products){
        if (product.getPrice() > 2500f){
            products.add(product);
        }
    }
//    getProducts().stream().forEach(System.out::println);
//        for (Product product: getProducts()){
//            System.out.println(product);
//        }
        getProducts().stream().filter((product)->product.getPrice()> 2500f).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static List<Product> getProducts(){
        List<Product> products =  new ArrayList<>();
        products.add(new Product(1, "Ahmed", 2500f));
        products.add(new Product(2, "Mohamed", 3000f));
        products.add(new Product(3, "Ali", 28000f));
        products.add(new Product(4, "Hany", 9000f));
        return products;
    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Product {
    private int id;
    private String name;
    private float price;
}
