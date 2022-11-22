package com.spring.java8.lambda;

interface EvenOdd{
    void check(int num);
}
public class EvenOddNumber {

    public static void main(String[] args) {

        EvenOdd evenOdd = (a)->{
            if (a %2 ==0){
                System.out.println("Number: "+ a + " Is Even");
            } else {
                System.out.println("Number: "+ a + " Is Odd");
            }
        };
        evenOdd.check(11);

    }
}
