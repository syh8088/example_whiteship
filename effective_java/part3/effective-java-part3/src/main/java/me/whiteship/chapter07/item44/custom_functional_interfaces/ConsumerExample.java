package me.whiteship.chapter07.item44.custom_functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry");
        System.out.println("Original list: " + words);

        // Using Consumer to print each element of the list
        Consumer<String> printWord = System.out::println;
        words.forEach(printWord);
    }
}
