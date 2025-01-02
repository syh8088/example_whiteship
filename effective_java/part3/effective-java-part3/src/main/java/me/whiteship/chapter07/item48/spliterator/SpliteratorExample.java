package me.whiteship.chapter07.item48.spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

        Spliterator<String> spliterator = list.spliterator();

        System.out.println("spliterator.tryAdvance:");
        spliterator.tryAdvance(System.out::println);

        System.out.println("spliterator.forEachRemaining:");
        spliterator.forEachRemaining(System.out::println);
    }
}
