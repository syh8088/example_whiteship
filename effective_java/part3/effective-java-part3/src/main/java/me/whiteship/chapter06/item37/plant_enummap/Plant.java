package me.whiteship.chapter06.item37.plant_enummap;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

// EnumMap을 사용해 열거 타입에 데이터를 연관시키기 (226-228쪽)

// 식물을 아주 단순하게 표현한 클래스 (226쪽)
class Plant {
    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Plant[] garden = {
            new Plant("바질",    LifeCycle.ANNUAL),
            new Plant("캐러웨이", LifeCycle.BIENNIAL),
            new Plant("딜",      LifeCycle.ANNUAL),
            new Plant("라벤더",   LifeCycle.PERENNIAL),
            new Plant("파슬리",   LifeCycle.BIENNIAL),
            new Plant("로즈마리", LifeCycle.PERENNIAL)
        };

        // 코드 37-2 EnumMap을 사용해 데이터와 열거 타입을 매핑한다. (227쪽)
        Map<LifeCycle, Set<Plant>> plantsByLifeCycle =
                new EnumMap<>(LifeCycle.class);

        for (LifeCycle lc : LifeCycle.values())
            plantsByLifeCycle.put(lc, new HashSet<>());

        for (Plant p : garden)
            plantsByLifeCycle.get(p.lifeCycle).add(p);

        System.out.println(plantsByLifeCycle);

        // 코드 37-3 스트림을 사용한 코드 1 - EnumMap을 사용하지 않는다! (228쪽)
        Map<LifeCycle, List<Plant>> collect = Arrays.stream(garden)
                .collect(groupingBy(p -> p.lifeCycle));
        System.out.println(collect);

        // 코드 37-4 스트림을 사용한 코드 2 - EnumMap을 이용해 데이터와 열거 타입을 매핑했다. (228쪽)
        EnumMap<LifeCycle, Set<Plant>> collect1 = Arrays.stream(garden)
                .collect(groupingBy(p -> p.lifeCycle,
                        () -> new EnumMap<>(LifeCycle.class), toSet()));
        System.out.println(collect1);
    }
}
