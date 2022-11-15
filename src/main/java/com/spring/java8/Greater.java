package com.spring.java8;

public class Greater {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        printLmabda(s->s.length());

    }
    public static void printLmabda(StringLengthLambda s){
        System.out.println(s.getLength("AHmed"));
    }
    interface StringLengthLambda{
        int getLength(String s);
    }
}

