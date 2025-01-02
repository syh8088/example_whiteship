package me.whiteship.chapter07.item43.method_references;

import java.util.Arrays;
import java.util.List;

public class ConstructorMethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("Names: " + names);

        // 생성자 참조
        List<Person> people = names.stream()
                .map(Person::new)
//                .map(name -> new Person(name))
                .toList();

        System.out.println("People: " + people);
    }
}
