package me.whiteship.chapter04.item24.memberclass;

public class OutterClass {

    private int number = 10;

    /**
     * 인스턴스 메소드
     */
    void printNumber() {
        InnerClass innerClass = new InnerClass();
    }

    /**
     * 비 static 맴버 클래스 (InnerClass 활용하기 위해서는 OutterClass 인트턴스를 생성 해야 한다.)
     */
    private class InnerClass {
        void doSomething() {
            System.out.println(number);
            OutterClass.this.printNumber();
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new OutterClass().new InnerClass();
        innerClass.doSomething();
    }

}
