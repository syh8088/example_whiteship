package me.whiteship.chapter07.item42.operation_before;

import java.util.function.DoubleBinaryOperator;

// 코드 42-4 함수 객체(람다)를 인스턴스 필드에 저장해 상수별 동작을 구현한 열거 타입 (256-257쪽)
public enum Operation {
    PLUS  ("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS ("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES ("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override public String toString() { return symbol; }

    public abstract double apply(double x, double y);

    // 아이템 34의 메인 메서드 (215쪽)
    public static void main(String[] args) {
        double x = 10;
        double y = 5;
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
}
