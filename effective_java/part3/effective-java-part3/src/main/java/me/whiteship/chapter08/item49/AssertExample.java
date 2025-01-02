package me.whiteship.chapter08.item49;

public class AssertExample {
    public static void main(String[] args) {
        doPrivate(5);
        doPrivate(-5);
    }

    private static void doPrivate(int value) {
        assert value > 0 : "Value should be greater than 0";
    }
}
