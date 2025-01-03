package me.whiteship.chapter07.item43;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

/**
 * 아이템 43. 람다보다는 메서드 참조를 사용하라.
 * 핵심정리 1: 람다 vs 메서드 참조 (Reference)
 *
 * • 메서드 이름이 보다 읽기 쉽다면 -> 메서드 레퍼런스
 *
 * • 매개변수 이름이 보다 읽기 쉽고 의미를 잘 표현한다면 -> 람다
 * • 메서드와 람다가 같은 클래스에 있을 때는 -> 람다
 *
 * •
 */
// map.merge를 이용해 구현한 빈도표 - 람다 방식과 메서드 참조 방식을 비교해보자. (259쪽)
public class Freq {
    public static void main(String[] args) {
        args = new String[] {"hello", "keesun"};
        Map<String, Integer> frequencyTable = new TreeMap<>();
        
        for (String s : args)
            frequencyTable.merge(s, 1, Freq::sum); // 람다
        System.out.println(frequencyTable);

        frequencyTable.clear();
        for (String s : args)
            frequencyTable.merge(s, 1, Integer::sum); // 메서드 참조
        System.out.println(frequencyTable);


        for (String s : args)
            frequencyTable.merge(s, 1, Freq::sum); // 람다
        System.out.println(frequencyTable);
    }

    /**
     * 람다로 작성할 코드를 새로운 메서드로 담은 다음, 람다 대신 메서드 참조를 사용하기
     */
    private static Integer sum(Integer count, Integer incr) {
        return count + incr;
    }
}
