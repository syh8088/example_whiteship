package me.whiteship.chapter08.item53;

import me.whiteship.chapter06.item36.best_practice.Text;

import java.util.EnumSet;

public class EnumSetExample {

    public static void main(String[] args) {
        EnumSet.of(Text.Style.BOLD, Text.Style.ITALIC);
    }
}
