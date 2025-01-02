package me.whiteship.chapter07.item43.method_references;

import java.util.Arrays;
import java.util.List;

public class ArrayConstructorMethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("Names: " + names);

        // 배열 생성자 참조
        String[] namesArray = names.toArray(String[]::new);

        System.out.println("Names array: " + Arrays.toString(namesArray));
    }
}