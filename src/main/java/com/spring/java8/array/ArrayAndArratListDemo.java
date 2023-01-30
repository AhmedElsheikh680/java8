package com.spring.java8.array;

public class ArrayAndArratListDemo {

    public static void main(String[] args) {

        int[] marks = {10, 20, 30};
        int [] newMarks = new int[marks.length +1];
        for (int s: newMarks){
            System.out.println(newMarks);
        }

//        String[] days = {"saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday"};
//        String dayOfMaxCharacters = "";
//        for (String day: days){
//            if (day.length() > dayOfMaxCharacters.length()){
//                dayOfMaxCharacters = day;
//            }
//        }
//        System.out.println("Day Of Max Characters: " + dayOfMaxCharacters);
//        for (int i=days.length-1; i>=0; i--){
//            System.out.println(days[i]);
//        }


//        int[] marks = {99,97,95, 100};
//        Student student = new Student("Ahmed", 99,97,95,100);
//        System.out.println("Number Of Marks: "+ student.getNumberOfMarks());
//        System.out.println("Sum: "+ student.getTotalSumOFMarks());
//        System.out.println("Max: "+ student.getMaximumMark());
//        System.out.println("Min: "+ student.getMinimumMark());
//        System.out.println("Average: "+ student.getAverageMarks());

//        print(1,2,3,4,5);
//        System.out.println(sum(1,2,3,4));
    }
//
//    public static void print(int... values){
//        System.out.println(Arrays.toString(values));
//    }
//    public static int sum(int... values){ //accept multiple args
//        int sum=0;
//        for (int value: values) {
//            sum +=value;
//        }
//        return sum;
//    }


}
