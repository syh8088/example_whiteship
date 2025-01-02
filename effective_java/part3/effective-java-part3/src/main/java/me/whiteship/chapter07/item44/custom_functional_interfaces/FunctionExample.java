package me.whiteship.chapter07.item44.custom_functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry");
        System.out.println("Original list: " + words);

        // Using Function to convert the list of strings to their lengths
        Function<String, Integer> stringLength = String::length;
        List<Integer> lengths = words.stream()
                .map(stringLength)
                .toList();

        System.out.println("Lengths: " + lengths);
    }
}
