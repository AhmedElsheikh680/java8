package com.spring.java8.review;

@FunctionalInterface
interface Printable{
    void print(String message);
}
public class FunctionDemo {

   public  void display(String message){
       message = message.toUpperCase();
       System.out.println(message);
       System.out.println("Ahmed Mohamed Elsheikh");
   }

    public static void main(String[] args) {
       FunctionDemo functionDemo = new FunctionDemo();
       Printable printable = functionDemo::display;
       printable.print("Ahmed Mohamed Elsheikh");

//        BiFunction<Integer, Integer, Integer> biFunctionLambda = FunctionDemo::addition;
//        System.out.println(biFunctionLambda.apply(20,20));

//        Function<Integer, Double> functionMethodReference = Math::sqrt;
//        System.out.println(functionMethodReference.apply(4));

//      Thread thread = new Thread(()-> System.out.println("sssssssssssss"));
//      thread.start();

//        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
//        System.out.println(supplier.get());

//        Consumer<String> consumer = (s)-> System.out.println(s);
//        consumer.accept("Ahmed Mohamed Elsheikh");

//        Function<String, Integer> fun = (String s)->s.length();
//        System.out.println(fun.apply("AHmed"));
    }
}
