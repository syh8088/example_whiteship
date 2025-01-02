package me.whiteship.chapter06.item39.naming_pattern;

public class Sample {

    public static void testM1() {
    }        // 성공해야 한다.

    public static void testM2() {
    }        // 성공해야 한다.

    public static void testM3() {    // 실패해야 한다.
        throw new RuntimeException("실패");
    }

    public static void m4() {
    }  // 테스트가 아니다.

    public void testM5() {
    }   // 잘못 사용한 예: 정적 메서드가 아니다.

    public static void testM6() {
    }

    public static void testM7() {    // 실패해야 한다.
        throw new RuntimeException("실패");
    }

    public static void m8() {
    }
}
