package com.spring.java8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args) {
//    List<Product> products = new ArrayList<>();
//    for (Product product: products){
//        if (product.getPrice() > 2500f){
//            products.add(product);
//        }
//    }
//    getProducts().stream().forEach(System.out::println);
//        for (Product product: getProducts()){
//            System.out.println(product);
//        }
//        getProducts().stream().filter((product)->product.getPrice()> 2500f)
//                .collect(Collectors.toList()).forEach(System.out::println);

//        getProducts().stream().
//                sorted((o1, o2) ->o2.getName().compareTo(o1.getName()))
//                .collect(Collectors.toList()).forEach(System.out::println);

//        getProducts().stream().sorted(new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return (int) (o2.getPrice() - o1.getPrice());
//            }
//        }).collect(Collectors.toList()).forEach(System.out::println);

//        getProducts().stream().sorted((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))
//                .collect(Collectors.toList()).forEach(System.out::println);

//        getProducts().stream().sorted(Comparator.comparingDouble(Product::getPrice))
//                .collect(Collectors.toList()).forEach(System.out::println);

        getProducts().stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    public static List<Product> getProducts(){
        List<Product> products =  new ArrayList<>();
        products.add(new Product(1, "Ahmed", 2500.0));
        products.add(new Product(2, "Zeyad", 3000.0));
        products.add(new Product(3, "Kamal", 28000.0));
        products.add(new Product(4, "Gamal", 9000.0));
        return products;
    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Product {
    private int id;
    private String name;
    private double price;
}
