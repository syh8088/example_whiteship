package me.whiteship.chapter04.item15.class_and_interfaces.member;

import java.util.Arrays;

class DefaultMemberService implements MemberService {

    private String name;

    /**
     * 한 클래스에서만 사용하는 package-private 클래스나 인터페이스는 해당 클래
     * 스에 private static으로 중첩 시키자. (아이템 24)
     */
    private static class PrivateStaticClass {
        void doPrint() {
            //System.out.println("name = " + name);
        }
    }

    private class PrivateClass {
        void doPrint() {
            System.out.println("name = " + name);
        }
    }

    public static void main(String[] args) {
        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
    }

}
