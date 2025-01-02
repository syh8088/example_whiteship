package me.whiteship.chapter07.item44.custom_functional_interfaces;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        System.out.println("Before conversion: " + words);

        // Using UnaryOperator to convert the list to uppercase
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        List<String> upperCaseWords = words.stream()
                .map(toUpperCase)
                .collect(Collectors.toList());

        System.out.println("After conversion: " + upperCaseWords);
    }
}