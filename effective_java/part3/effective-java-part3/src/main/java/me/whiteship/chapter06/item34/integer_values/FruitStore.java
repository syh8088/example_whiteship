package me.whiteship.chapter06.item34.integer_values;

public class FruitStore {

    public int getPrice(int fruit) {
        return switch (fruit) {
            case Fruits.APPLE_FUJI -> 100;
            case Fruits.APPLE_PIPPIN -> 200;
            case Fruits.APPLE_GRANNY_SMITH -> 300;
            case Fruits.ORANGE_NAVEL -> 150;
            case Fruits.ORANGE_TEMPLE -> 250;
            case Fruits.ORANGE_BLOOD -> 350;
            default -> throw new IllegalArgumentException("No such fruit");
        };
    }

    public String getNameOfFruit(int fruit) {
        return switch (fruit) {
            case Fruits.APPLE_FUJI -> "Fuji Apple";
            case Fruits.APPLE_PIPPIN -> "Pippin Apple";
            case Fruits.APPLE_GRANNY_SMITH -> "Granny Smith Apple";
            case Fruits.ORANGE_NAVEL -> "Navel Orange";
            case Fruits.ORANGE_TEMPLE -> "Temple Orange";
            case Fruits.ORANGE_BLOOD -> "Blood Orange";
            default -> throw new IllegalArgumentException("No such fruit");
        };
    }

    public static void main(String[] args) {
        FruitStore fruitStore = new FruitStore();
        System.out.println(fruitStore.getPrice(Fruits.APPLE_FUJI));
    }
}
