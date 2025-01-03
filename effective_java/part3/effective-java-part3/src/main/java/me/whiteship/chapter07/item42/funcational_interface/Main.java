package me.whiteship.chapter07.item42.funcational_interface;

import java.util.*;

import static java.util.Comparator.comparingInt;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("aaa", "bbbbb", "c"));
        System.out.println(words);

        /**
         * 자바 8부터는 조금 더 간결하게 정의해서 쓸 수 있는 이제 함수형 인터페이스와
         * 함수형 인터페이스의 구현체인 람다를 사용할 수 있게 됩니다.
         *
         * 여기서 이제 람다는 함수형 인터페이스의 인스턴스를 말합니다
         */
        Collections.sort(words,

                /**
                 * 블럭 지정한 이 코드 자체는 함수형 인터페이스가 아니라 함수형 인터페이스의 인스턴스에요 즉 람다인 거죠.
                 *
                 * 이거의 함수형 인터페이스는 얘가 구현한 함수형 인터페이스라고 한다면 Comparator 라고 볼수 있다.
                 *
                 * 함수형 인터페이스: 구현해야 할 메서드가 하나만 있으면 있으면 된다. @functionalInterface
                 *
                 */
                (s1, s2) -> Integer.compare(s1.length(), s2.length())
        );

        /**
         * 익명 클래스 VS 람다
         *
         * 익명 클래스의 인스턴스는 이전에도 언급했다시피 이제 익명 클래스에 몇 개의 메서드가 들어 있든 상관이 없어요.
         * 그런데 람다는 무조건 딱 하나만 있어야 됩니다
         */


//        Collections.sort(words, comparingInt(String::length));
//
//        words.sort(comparingInt(String::length));

        System.out.println(words);
    }
}
