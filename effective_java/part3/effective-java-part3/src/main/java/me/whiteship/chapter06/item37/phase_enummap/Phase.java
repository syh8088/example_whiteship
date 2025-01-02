package me.whiteship.chapter06.item37.phase_enummap;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

// 코드 37-6 중첩 EnumMap으로 데이터와 열거 타입 쌍을 연결했다. (229-231쪽)
public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

//        // 코드 37-7 EnumMap 버전에 새로운 상태 추가하기 (231쪽)
//        SOLID, LIQUID, GAS, PLASMA;
//        public enum Transition {
//            MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
//            BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
//            SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID),
//            IONIZE(GAS, PLASMA), DEIONIZE(PLASMA, GAS);

        private final Phase from;
        private final Phase to;

        Transition(Phase from, Phase to) {
            this.from = from;
            this.to = to;
        }

//        private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<>(Phase.class);
//        static {
//            for (Transition t : Transition.values()) {
//                m.computeIfAbsent(t.from, k -> new EnumMap<>(Phase.class)).put(t.to, t);
//            }
//        }

//        static {
//            for (Transition t : Transition.values()) {
//                Map<Phase, Transition> innerMap = m.get(t.from);
//                if (innerMap == null) {
//                    innerMap = new EnumMap<>(Phase.class);
//                    m.put(t.from, innerMap);
//                }
//                innerMap.put(t.to, t);
//            }
//        }

        // @formatter:off
        // 상전이 맵을 초기화한다.
        private static final Map<Phase, Map<Phase, Transition>>
            m = Stream.of(values()).collect(groupingBy(
                t -> t.from,
                () -> new EnumMap<>(Phase.class),
                toMap(t -> t.to, t -> t, (x, y) -> y, () -> new EnumMap<>(Phase.class)))
        );
        // @formatter:on

        public static Transition from(Phase from, Phase to) {
            return m.get(from).get(to);
        }
    }

    // 간단한 데모 프로그램 - 깔끔하지 못한 표를 출력한다.
    public static void main(String[] args) {
        for (Phase src : Phase.values()) {
            for (Phase dst : Phase.values()) {
                Transition transition = Transition.from(src, dst);
                if (transition != null)
                    System.out.printf("%s에서 %s로 : %s %n", src, dst, transition);
            }
        }
    }
}
