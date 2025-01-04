package me.whiteship.chapter07.item48;

import java.math.BigInteger;
import java.util.stream.LongStream;

/**
 * 스트림 병렬화를 사용해야 할 경우
 * 대체로 스트림의 소스가 ArrayList, HashMap, HashSet, ConcurrentHashMap의 인스턴스거나 배열,
 * int 범위, long 범위일 때 병렬화의 효과가 가장 좋다.
 *
 * 해당 자료구조들은 아래와 같은 두 가지 공통점을 지닌다.
 *
 * 1. 정확성
 * 이러한 자료 구조들은 데이터를 정확하고 쉽게 분할할 수 있다.
 * 이는 스트림의 병렬 처리에서 매우 중요한 속성이다.
 * 나누는 작업은 Spliterator를 통해 이루어지며, Iterable과 Stream에서 얻을 수 있다.
 *
 * 2. 참조 지역성
 * 참조 지역성은 프로그램이 데이터를 참조하는 패턴이다. 지역성이 높을 경우 캐시 히트율이 높아져 성능이 향상된다.
 *
 * - 시간 지역성 : 최근에 참조된 주소는 빠른 시간 내에 다시 참조되는 특성
 * - 공간 지역성 : 참조된 주소와 인접한 주소의 내용이 다시 참조되는 특성
 * - 순차 지역성 : 데이터가 순차적으로 엑세스 되는 특성(공간 지역성)
 */
public class ParallelPrimeCounting {
    // 코드 48-3 소수 계산 스트림 파이프라인 - 병렬화 버전 (295쪽)
    static long pi(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(pi(10_000_000));
        System.out.println(System.currentTimeMillis() - start);
    }
}
