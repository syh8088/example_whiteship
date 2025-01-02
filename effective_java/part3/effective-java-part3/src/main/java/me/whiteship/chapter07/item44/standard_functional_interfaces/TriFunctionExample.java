package me.whiteship.chapter07.item44.standard_functional_interfaces;

public class TriFunctionExample {
    public static void main(String[] args) {
        // Using TriFunction to concatenate three strings
        TriFunction<String, String, String, String> concatenate = (s1, s2, s3) -> s1 + s2 + s3;

        String result = concatenate.apply("Hello, ", "world", "!");
        System.out.println(result); // Output: Hello, world!

        // Using TriFunction to sum three integers
        TriFunction<Integer, Integer, Integer, Integer> sum = (a, b, c) -> a + b + c;

        Integer sumResult = sum.apply(1, 2, 3);
        System.out.println(sumResult); // Output: 6
    }
}
