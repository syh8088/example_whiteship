package me.whiteship.chapter06.item34.enumeration;

public class FruitStore {

    public int getPrice(Apple apple) {
        return switch (apple) {
            case FUJI -> 100;
            case PIPPIN -> 200;
            case GRANNY_SMITH -> 300;
        };
    }

    public int getPrice(Orange orange) {
        return switch (orange) {
            case NAVEL -> 150;
            case TEMPLE -> 250;
            case BLOOD -> 350;
        };
    }
}
