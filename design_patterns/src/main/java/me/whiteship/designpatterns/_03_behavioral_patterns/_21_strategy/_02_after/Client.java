package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._02_after;

import java.util.Collections;
import java.util.Comparator;

/**
 * 어떤 일을 수행하는 방법이 여러가지 일때 그 여러 알고리듬을 각각 개별적인 클래스로 캡슐화 하고
 * 캡슐화 되어 있는 공통 인터페이스로 추상화 해서 그 어떤 로직을 수행하는 곳에서는
 * 추상화된 인터페이스에서만 사용하므로써 코드는 바뀌지 않지만 우리가 사용하는 알고리듬을 빠꿔낄수 있게 하는 패턴
 */
public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue light");
            }

            @Override
            public void redLight() {
                System.out.println("red light");
            }
        });
    }
}
