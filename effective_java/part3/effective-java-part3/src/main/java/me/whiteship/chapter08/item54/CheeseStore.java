package me.whiteship.chapter08.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheeseStore {

    private final List<Cheese> cheesesInStock = new ArrayList<>();

    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public CheeseStore(Cheese... initialCheeses) {
        for (Cheese cheese : initialCheeses) {
            addCheese(cheese);
        }
    }

    private void addCheese(Cheese cheese) {
        cheesesInStock.add(cheese);
    }

    public List<Cheese> getCheese() {
        return cheesesInStock.isEmpty() ? null : new ArrayList<>(cheesesInStock);
    }

//    public Cheese[] getCheeseArray() {
//        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
//    }
}