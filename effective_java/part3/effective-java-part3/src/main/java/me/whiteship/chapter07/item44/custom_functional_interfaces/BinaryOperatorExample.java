package me.whiteship.chapter07.item44.custom_functional_interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Using BinaryOperator to concatenate two strings
        BinaryOperator<String> concatenate = (s1, s2) -> s1 + s2;

        String result = concatenate.apply("Hello, ", "world!");
        System.out.println(result); // Output: Hello, world!
    }
}