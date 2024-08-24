package me.whiteship.chapter04.item24.staticmemberclass;

public class OutterClass {

    private static int number = 10;

    /**
     * static 맴버 클래스 (InnerClass 활용하기 위해서는 OutterClass 인트턴스를 생성 할 필요가 없다. - 메모리 절약)
     */
    static private class InnerClass {
        void doSomething() {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.doSomething();

    }
}
