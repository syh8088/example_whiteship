package me.whiteship.chapter08.item54;

import java.util.List;

public class CheeseExample {

    public static void main(String[] args) {
        CheeseStore cheeseStore = new CheeseStore();
        List<Cheese> cheese = cheeseStore.getCheese();
        if (cheese != null && !cheese.isEmpty()) {
            System.out.println("We have cheese: " + cheese);
        } else {
            System.out.println("We have no cheese");
        }
    }
}
