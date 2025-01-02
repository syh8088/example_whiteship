package me.whiteship.chapter07.item44.custom_functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "blueberry"));
        System.out.println("Original list: " + words);

        // Using Predicate to filter the list for words that start with 'b'
        Predicate<String> startsWithB = s -> s.startsWith("b");
        List<String> filteredWords = words.stream()
                .filter(startsWithB)
                .collect(Collectors.toList());

        System.out.println("Filtered list: " + filteredWords);
    }
}
