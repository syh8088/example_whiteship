package me.whiteship.chapter08.item52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {

    public static void main(String[] args) {
        new Thread(System.out::println).start();

        /**
         * 서로 다른 함수형 인터페이스라도 같은 위치의 인수로 받아서는 안 된다. (-Xlint:overloads)
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.submit(System.out::println);
    }
}
