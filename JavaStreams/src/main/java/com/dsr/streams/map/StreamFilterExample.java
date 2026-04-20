package com.dsr.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Traditional way of finding even numbers
        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer number : numbers) {
           if(number % 2 == 0) {
               evenNumbers.add(number);
           }
        }
        System.out.println(evenNumbers);

        // Using Filter method from Stream API
        List<Integer> evenNumberFilterList = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(evenNumberFilterList);
    }
}
