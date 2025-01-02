package me.whiteship.chapter08.item49;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class RequireNonNullExample {
    public static void main(String[] args) {
        doWork("keesun");
    }

    public static void doWork(String name) {
        requireNonNull(name, "The name cannot be null");

        String value = null;
        try {
            // This will throw a NullPointerException with the specified message
            requireNonNull(value, "The value cannot be null");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        value = "Hello, World!";

        // This will not throw an exception
        String result = requireNonNull(value, "The value cannot be null");
        System.out.println(result);
    }
}
