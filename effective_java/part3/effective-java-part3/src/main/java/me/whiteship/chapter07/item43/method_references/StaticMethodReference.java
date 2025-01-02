package me.whiteship.chapter07.item43.method_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticMethodReference {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("aaa", "bbbbb", "c"));
        System.out.println("Before sorting: " + words);

        // 정적 메서드 참조
        Collections.sort(words, StaticMethodReference::compareByLength);

        System.out.println("After sorting: " + words);
    }

    public static int compareByLength(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}
