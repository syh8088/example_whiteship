package me.whiteship.chapter07.item44.custom_functional_interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Using Supplier to generate a random number
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        // Getting a random number
        Integer randomNumber = randomSupplier.get();
        System.out.println("Random number: " + randomNumber);
    }
}
