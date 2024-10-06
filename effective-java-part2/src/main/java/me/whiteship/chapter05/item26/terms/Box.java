package me.whiteship.chapter05.item26.terms;

// public class Box<E> {
// public class Box<E extends Entity> { // E extends Entity <-- 한정된 타입 메개변수
// public class Box<?> { // ? <-- 비 한정적 와이드 카드 타입

public class Box<E> {  // E <-- 타입 매게변수

    private E item;

    private void add(E e) {
        this.item = e;
    }

    private E get() {
        return this.item;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.add(10);
        System.out.println(box.get() * 100);

        printBox(box);
    }

    private static void printBox(Box<?> box) {
        System.out.println(box.get());
    }

}
