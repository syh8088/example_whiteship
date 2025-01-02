package me.whiteship.chapter07.item47;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

// 스트림 <-> 반복자 어댑터 (285-286쪽)
public class Adapters {
    // 코드 47-3 Stream<E>를 Iterable<E>로 중개해주는 어댑터 (285쪽)
    public static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }

    // 코드 47-4 Iterable<E>를 Stream<E>로 중개해주는 어댑터 (286쪽)
    public static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    public static void main(String[] args) {
        // Example list
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        // Convert List to Stream
        Stream<String> stream = list.stream();

        // Convert Stream to Iterable using Adapters
        Iterable<String> iterable = Adapters.iterableOf(stream);
        System.out.println("Iterable from Stream:");
        for (String s : iterable) {
            System.out.println(s);
        }

        // Convert Iterable back to Stream using Adapters
        Stream<String> streamFromIterable = Adapters.streamOf(iterable);
        System.out.println("Stream from Iterable:");
        streamFromIterable.forEach(System.out::println);
    }
}
