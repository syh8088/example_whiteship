package me.whiteship.chapter06.item34.enumeration;

public class AppleClient {

    public static void main(String[] args) {
        FruitStore fruitStore = new FruitStore();
        System.out.println(fruitStore.getPrice(Apple.PIPPIN));
        System.out.println(Apple.PIPPIN);
    }
}
