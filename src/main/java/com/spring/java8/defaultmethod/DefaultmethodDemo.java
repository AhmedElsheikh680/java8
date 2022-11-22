package com.spring.java8.defaultmethod;

public class DefaultmethodDemo {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.print();
    }
}
interface Shape{
    void draw();
    default void print(){
        System.out.println("THis Is Default Method!!");
    }
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle Draw Method");
    }
    @Override
    public void print(){
        System.out.println("print From Rectangle");
//        Shape.super.print();
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle Draw Method");
    }
}
