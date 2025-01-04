package me.whiteship.chapter07.item48;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

// 병렬 스트림을 사용해 처음 20개의 "메르센 소수"를 생성하는 프로그램 (291쪽 코드 48-1의 병렬화 버전)
// 주의: 병렬화의 영향으로 프로그램이 종료하지 않는다.

/**
 * 파이프라인 병렬화로 성능 개선을 할 수 없는 경우
 *
 * - 데이터 소스가 "Stream.iterate" 인 경우
 * Stream.iterate 는 요소들을 하나씩 생성한다. 이는 병렬 처리에 적합하지 않다.
 * 왜냐하면 각 요소는 이전 요소를 기반으로 생성되므로 데이터가 병렬로 생성될 수 없기 때문이다.
 * 이러한 순차적인 특성은 병렬 처리가 불가능하게 한다.
 *
 *
 * - "중간 연산"으로 limit 를 사용하는 경우
 * 병렬화는 일반적으로 데이터의 모든 부분에 작업을 독립적으로 수행하고 결과를 합치는 데 효과적이다.
 * 그러나 limit 연산은 전체 데이터 집합을 검토해야하므로 병렬화의 이점을 얻을 수 없다.
 * limit 는 처리할 데이터의 양을 줄이지만, 이 연산 이후의 모든 연산은 병렬로 수행할 수 없게 한다.
 *
 * 병렬 처리에 적합하지 않은 연산이나 데이터 소스를 사용하면, 병렬화가 오히려 성능을 저하시킬 수 있다.
 * 이러한 경우에는 순차 스트림을 사용하는 것이 더 효율적일 수 있다.
 */
public class ParallelMersennePrimes {
    public static void main(String[] args) {
        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .parallel() // 스트림 병렬화
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);
    }

    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }
}
