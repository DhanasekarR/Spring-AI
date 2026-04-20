package com.dsr.streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamExample {
    public static void main(String[] args) {

        // Create a stream from List
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        // Create a stream from List
        Stream<String> stream = list.stream();
        stream.forEach( e -> System.out.println(e));

        /*
        Create a fixed-size list with Arrays.asList, convert it to a stream, and print each element.
         Use method reference for printing the element.
         */
        List<String> list1 = Arrays.asList("A", "B", "C", "D");
        // Create a stream from List1
        Stream<String> stream1 = list1.stream();
        stream1.forEach(System.out::println);

        // Create a stream from Set
        Set<String>  set = new HashSet<>(list1);
        Stream stream2 = set.stream();
        stream2.forEach(System.out::println);

        // Create a stream from Map
        Map<String, Integer> map = new HashMap<>();
        map.put("A",4);
        map.put("B",3);
        map.put("C",2);
        map.put("D",1);

        // Create a stream from Map's entrySet
        Stream<Map.Entry<String, Integer>> stream3 = map.entrySet().stream();
        stream3.forEach(System.out::println);

        // Create a stream from Map's keySet
        Stream<String> stream4 = map.keySet().stream();
        stream4.forEach(System.out::println);

        // Create a stream from Map's values
        Stream<Integer> stream5 = map.values().stream();
        stream5.forEach(System.out::println);

        // Create a stream from an Array
        String[] strArray = {"E","F","G","H"};
        Stream<String> stream6 = Arrays.stream(strArray);
        stream6.forEach(System.out::println);

        // Create a stream using Stream.of() method
        Stream<String> i = Stream.of("I", "J", "K", "L");
        i.forEach(System.out::println);
    }
}
