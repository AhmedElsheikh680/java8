package com.spring.java8.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String  name;

    private List<Integer> marks = new ArrayList<Integer>();

    public Student(String name, int... marks) {
        this.name = name;
        for (int mark: marks){
            this.marks.add(mark);
        }

    }

    public int getNumberOfMarks(){
        return marks.size();
    }

    public int getTotalSumOFMarks(){
        int sum=0;
        for(int mark: marks){
            sum +=mark;
        }
        return sum;
    }

    public int getMaximumMark(){
        return Collections.max(marks);
//        int max = Integer.MIN_VALUE;
//        for (int mark: marks){
//            if (mark > max){
//                max = mark;
//            }
//        }
//        return max;
    }

    public int getMinimumMark(){
//        int min = Integer.MAX_VALUE;
//        for (int mark: marks){
//            if (mark < min){
//                min = mark;
//            }
//        }
//        return min;

        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks(){
       int sum =  getTotalSumOFMarks();
       int length = getNumberOfMarks();
       return new BigDecimal(sum).divide(new BigDecimal(length), 3, RoundingMode.UP);
    }
















}
