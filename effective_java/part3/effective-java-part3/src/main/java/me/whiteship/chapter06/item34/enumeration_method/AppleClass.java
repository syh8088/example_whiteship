package me.whiteship.chapter06.item34.enumeration_method;

public class AppleClass {

    public static final AppleClass appleInstance = new AppleClass("Apple");

    AppleClass(String name) {
        System.out.println(appleInstance);
    }

    public static void main(String[] args) {

    }
}
