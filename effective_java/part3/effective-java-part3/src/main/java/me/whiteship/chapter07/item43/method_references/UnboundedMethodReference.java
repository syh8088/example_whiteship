package me.whiteship.chapter07.item43.method_references;

import java.util.*;
import java.util.stream.Collectors;

public class UnboundedMethodReference {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
        System.out.println("Before conversion: " + words);

        // 비한정적 메서드 참조 1
        List<String> lowerCaseWords = words.stream()
                .map(String::toLowerCase)
//                .map(s -> s.toLowerCase())
                .toList();

        System.out.println("After conversion: " + lowerCaseWords);


        words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        System.out.println("Before sorting: " + words);

        // 비한정적 메서드 참조 2
        Collections.sort(words, String::compareTo);
//        Collections.sort(words, (s1, s2) -> s1.compareTo(s2));

        System.out.println("After sorting: " + words);

    }
}
