package com.whiteship.java8to11;

public class Foo {

    public static void main(String[] args) {
        RunSomething runsomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };
    }
}
