package me.whiteship.chapter06.item34.enumeration_method;

public enum Apple implements Fruit {

    FUJI(100), PIPPIN(120), GRANNY_SMITH(140);

    private int price;

    Apple(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
