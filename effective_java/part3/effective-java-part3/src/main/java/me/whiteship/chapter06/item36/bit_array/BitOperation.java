package me.whiteship.chapter06.item36.bit_array;

public class BitOperation {

    private final int one = 1;
    private final int two = 1 << 1;
    private final int four = 1 << 2;
    private final int eight = 1 << 3;

    public static void main(String[] args) {
        BitOperation bitOperation = new BitOperation();
        printBits(bitOperation.one);
        printBits(bitOperation.two);
        printBits(bitOperation.four);
        printBits(bitOperation.eight);

        int three = bitOperation.one | bitOperation.two;
        printBits(three);
        printBits(bitOperation.one);
//        printBits(three & bitOperation.one);
//        printBits(three & bitOperation.two);
//        printBits(three & bitOperation.four);
        printBits(three ^ bitOperation.one);

        printBits(~three);
    }

    private static void printBits(int i) {
        for (int j = 31; j >= 0; j--) {
            System.out.print((i & (1 << j)) == 0 ? 0 : 1);
        }
        System.out.println();
    }
}
