package me.whiteship.chapter07.item42.anonymous_class;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("aaa", "bbbbb", "c"));
        System.out.println(words);

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println(words);
    }
}
