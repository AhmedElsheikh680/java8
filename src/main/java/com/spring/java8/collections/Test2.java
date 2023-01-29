package com.spring.java8.collections;

public class Test2 {

    public static void main(String[] args) {
//        String[] arr = {"Ahmed", "Mohamed", "Elsheikh"};
//        Arrays.stream(arr).forEach(System.out::println);
//        List<String> courses = Arrays.asList("Java", "Angular", "Devops", "Spring Boot");
//        Set<String> coursesSet = new HashSet<>(courses);
//        coursesSet.stream().forEach(System.out::println);


//        String name="  Ahmed  ";
//        Optional<String> nameOpt = Optional.of(name);
//        nameOpt.filter(s ->s.contains("Ahmed"))
//                .map(String::trim)
//                .ifPresent(res-> System.out.println(res));

//        Optional<String> gender = Optional.of("MALE");
//        gender.ifPresent((s)-> System.out.println("value Is Present"));
//        Optional<String> emptyOptional = Optional.empty();
//        emptyOptional.ifPresent((s)-> System.out.println("No Value Present"));
//        String email = null;
//        Optional<String> emailOptional = Optional.ofNullable(email);
//        String defaultOpt = emailOptional.orElseThrow(()-> new IllegalArgumentException("Email Not Exist!!"));
//        System.out.println(defaultOpt);
//        Optional<String> emailOptional  = Optional.ofNullable(email);
//        String defOpt = emailOptional.orElseGet(()->"a@a.com");
//        System.out.println(defOpt);
//        Optional<String> emailOptional = Optional.ofNullable(email);
//        String defaultOptional = emailOptional.orElse("a@a.com");
//        System.out.println(defaultOptional);
//        String email= "a@a.com";
//        Optional<String> emailOptional = Optional.ofNullable(email);
//        if (emailOptional.isPresent()){
//            System.out.println(emailOptional.get());
//        } else {
//            System.out.println("No Value Present");
//        }
//       Optional<Object> emptyOptional =  Optional.empty();
//        System.out.println(emptyOptional);
//
//        String email = "a@a.com";
////        Optional<String> emailOptional = Optional.of(email);
////        System.out.println(emailOptional);
//
//        Optional<String> stringOptional = Optional.ofNullable(email);
//        System.out.println(stringOptional.get());


//        Map<Integer, Studnet> studnetMap = new HashMap<>();
//        studnetMap.put(1, new Studnet("Ahmed", "Mohamed"));
//        studnetMap.put(2, new Studnet("Hany", "Kamal"));
//        studnetMap.put(3, new Studnet("Mohamed", "Ayman"));
//        studnetMap.forEach((k,v)->{
//            System.out.println(k+ "=> "+ v);
//        });

//        Map<String, Integer> nums = new HashMap<>();
//        if (nums.isEmpty()) {
//            nums.put("one", 1);
//            nums.put("two", 2);
//            nums.put("three", 3);
//            nums.put("four", 4);
//            nums.put("five", 5);
//            nums.put("six", 5);
//            nums.put(null, 6);
//            nums.put(null, 7);
//
//            nums.forEach((k,v)->{
//                System.out.println(k+ " ->  "+v );
//            });
//            Set<Map.Entry<String, Integer>> entrySet = nums.entrySet();
//            Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
//            while (iterator.hasNext()){
//                Map.Entry<String, Integer> next = iterator.next();
//                System.out.println(next.getKey() + " "+ next.getValue());
//            }

//            for (Map.Entry<String, Integer> entry: nums.entrySet()){
//                System.out.println("Key: "+ entry.getKey()+ " Value: "+ entry.getValue());
//            }


//            Set<String> keys = nums.keySet();
//            keys.stream().forEach(System.out::println);
//            System.out.println("========================");
//            Collection<Integer> values = nums.values();
//            values.stream().forEach(System.out::println);
//            System.out.println(nums.size());
//            System.out.println(nums.containsKey("one"));
//            System.out.println(nums.containsValue(7));
//            System.out.println(nums.get("one"));
//            System.out.println(nums.remove("five"));
    }


//        Set<String> courses = new HashSet<>();
//        courses.add("Java");
//        courses.add("JQuery");
//        courses.add("Angular");
//        courses.add("Spring Boot");
//        courses.add("NodeJS");
//        courses.stream().filter(course-> "Angular".equals(course)).forEach(System.out::println);
//       evenNumbers.clear();
//       Set<Integer> copyEvenNumbers = new HashSet<>(evenNumbers);
//       copyEvenNumbers.add(12);
//       copyEvenNumbers.add(14);
//       List<Integer> printAll = new ArrayList<>();
//       printAll.addAll(copyEvenNumbers);
//       printAll.stream().forEach(System.out::println);

}
