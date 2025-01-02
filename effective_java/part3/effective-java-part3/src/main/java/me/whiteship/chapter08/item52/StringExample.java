package me.whiteship.chapter08.item52;

public class StringExample {

    public static void main(String[] args) {
        String name = "keesun";
        name.contentEquals("keesun");
        name.contentEquals(new StringBuffer(name));

        char[] data = {'e', 'd', 'd'};
        System.out.println(String.valueOf((Object) data));
        System.out.println(String.valueOf(data));
    }
}
