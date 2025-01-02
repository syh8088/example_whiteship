package me.whiteship.chapter07.item48.spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorCharacteristicsExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

        Spliterator<String> spliterator = list.spliterator();

        // Check and print characteristics
        int characteristics = spliterator.characteristics();
        System.out.println("Characteristics: " + characteristics);
//        System.out.println("Characteristics: " + Integer.toBinaryString(characteristics));

        // Check if the Spliterator is ORDERED
        if ((characteristics & Spliterator.ORDERED) != 0) {
            System.out.println("Spliterator is ORDERED");
        }

//        if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
//            System.out.println("Spliterator is ORDERED");
//        }

        // Check if the Spliterator is DISTINCT
        if ((characteristics & Spliterator.DISTINCT) != 0) {
            System.out.println("Spliterator is DISTINCT");
        }

        // Check if the Spliterator is SORTED
        if ((characteristics & Spliterator.SORTED) != 0) {
            System.out.println("Spliterator is SORTED");
        }

        // Check if the Spliterator is SIZED
        if ((characteristics & Spliterator.SIZED) != 0) {
            System.out.println("Spliterator is SIZED");
        }

        // Check if the Spliterator is NONNULL
        if ((characteristics & Spliterator.NONNULL) != 0) {
            System.out.println("Spliterator is NONNULL");
        }

        // Check if the Spliterator is IMMUTABLE
        if ((characteristics & Spliterator.IMMUTABLE) != 0) {
            System.out.println("Spliterator is IMMUTABLE");
        }

        // Check if the Spliterator is CONCURRENT
        if ((characteristics & Spliterator.CONCURRENT) != 0) {
            System.out.println("Spliterator is CONCURRENT");
        }

        // Check if the Spliterator is SUBSIZED
        if ((characteristics & Spliterator.SUBSIZED) != 0) {
            System.out.println("Spliterator is SUBSIZED");
        }
    }
}