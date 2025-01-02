package me.whiteship.chapter07.item48.random;

import java.util.Random;
import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class RandomExample {
    public static void main(String[] args) {
        // Using Random
        Random random = new Random();
        System.out.println("Random: "  + random.nextInt(100));

        // Using ThreadLocalRandom
        int randomValue = ThreadLocalRandom.current().nextInt(100);
        System.out.println("ThreadLocalRandom: " + randomValue);

        // Using SplittableRandom
        SplittableRandom splittableRandom = new SplittableRandom();
        IntStream randomIntStream = splittableRandom.ints(10, 0, 100);
        long count = randomIntStream
                .parallel()
                .filter(number -> number > 50)
                .count();
        System.out.println(count);
    }
}
