package me.whiteship.chapter08.item52;

public class StringExample {

    public static void main(String[] args) {
        String name = "keesun";
        name.contentEquals("keesun");
        name.contentEquals(new StringBuffer(name));

        /**
         * 다중정의한 메서드 기능을 똑같이 만든다. (잘못된 사례, String의 valueOf(char[]), valueOf(Object)
         */
        char[] data = {'e', 'd', 'd'};
        System.out.println(String.valueOf((Object) data));
        System.out.println(String.valueOf(data));
    }
}
