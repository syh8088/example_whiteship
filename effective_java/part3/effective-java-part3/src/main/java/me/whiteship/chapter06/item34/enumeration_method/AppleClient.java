package me.whiteship.chapter06.item34.enumeration_method;

public class AppleClient {

    public static void main(String[] args) {
        FruitStore fruitStore = new FruitStore();
        System.out.println(fruitStore.getPrice(Apple.PIPPIN));
//        System.out.println(Apple.PIPPIN);

        for (Apple apple : Apple.values()) {
            System.out.println(apple);
        }

//        System.out.println(Apple.PIPPIN);
        Apple pippin = Apple.valueOf("PIPPIN");
        System.out.println(pippin);

    }
}
