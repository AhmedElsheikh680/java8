package com.spring.java8.array;

public class ArrayAndArratListDemo {

    public static void main(String[] args) {
        int[] marks = {99,97,95, 100};
        Student student = new Student("Ahmed", marks);
        System.out.println("Number Of Marks: "+ student.getNumberOfMarks());
        System.out.println("Sum: "+ student.getTotalSumOFMarks());
        System.out.println("Max: "+ student.getMaximumMark());
        System.out.println("Min: "+ student.getMinimumMark());
        System.out.println("Average: "+ student.getAverageMarks());
    }


}
