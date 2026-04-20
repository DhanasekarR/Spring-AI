package com.dsr.streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamsMapExample2 {
    public static void main(String[] args) {
        // Convert List of string into Integers

        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> list1 = list.stream().map(Integer::valueOf).toList();
        System.out.println(list1);
    }
}
