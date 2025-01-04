package me.whiteship.chapter08.item53;

import me.whiteship.chapter06.item36.best_practice.Text;

import java.util.EnumSet;

public class EnumSetExample {

    /**
     * 성능에 민감하다면, 매개변수를 여러 개 받는 메서드를 다중정의 하자 (EnumSet)
     */
    public static void main(String[] args) {
        EnumSet.of(Text.Style.BOLD, Text.Style.ITALIC);
    }
}
