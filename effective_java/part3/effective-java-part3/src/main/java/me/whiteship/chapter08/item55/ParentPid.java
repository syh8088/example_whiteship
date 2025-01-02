package me.whiteship.chapter08.item55;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

// 불필요하게 사용한 Optional의 isPresent 메서드를 제거하자. (329쪽)
public class ParentPid {
    public static void main(String[] args) {
        ProcessHandle ph = ProcessHandle.current();

        // isPresent를 적절치 못하게 사용했다.
        Optional<ProcessHandle> parentProcess = ph.parent();
        System.out.println("부모 PID: " + (parentProcess.isPresent() ?
                String.valueOf(parentProcess.get().pid()) : "N/A"));

        // 같은 기능을 Optional의 map를 이용해 개선한 코드
        System.out.println("부모 PID: " +
            ph.parent().map(h -> String.valueOf(h.pid())).orElse("N/A"));

        // p329 Optional의 스트림
        Stream<Optional<String>> streamOfOptionals = Stream.of(
                Optional.of("Apple"),
                Optional.empty(),
                Optional.of("Banana"),
                Optional.of("Cherry"),
                Optional.empty()
        );

        // isPresent를 적절치 못하게 사용했다.
//        streamOfOptionals.filter(Optional::isPresent)
//                .map(Optional::get)
//                .forEach(System.out::println);

        // 같은 기능을 Optional의 스트림을 이용해 개선한 코드
        streamOfOptionals.flatMap(Optional::stream)
                .forEach(System.out::println);
    }
}
