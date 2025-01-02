package me.whiteship.chapter07.item42.funcational_interface;

import java.util.*;

import static java.util.Comparator.comparingInt;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("aaa", "bbbbb", "c"));
        System.out.println(words);

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

//        Collections.sort(words, comparingInt(String::length));
//
//        words.sort(comparingInt(String::length));

        System.out.println(words);
    }
}
