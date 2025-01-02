package me.whiteship.chapter07.item43;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

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
    }

    private static Integer sum(Integer count, Integer incr) {
        return count + incr;
    }
}
