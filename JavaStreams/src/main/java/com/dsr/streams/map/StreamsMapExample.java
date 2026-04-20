package com.dsr.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsMapExample {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");
        Stream<String> stream = fruits.stream();
        List<String> list = stream.map(String::toUpperCase).toList();
        System.out.println(list);
    }
}
