package me.whiteship.chapter06.item34.operation;

import me.whiteship.chapter06.item34.enumeration.Orange;

import java.util.HashMap;
import java.util.Map;

public enum OperationOrigin {

    PLUS, MINUS, TIMES, DIVIDE, NEW_OPERATION;

    // enum에서는 생성자가 호출되는 시점에는 정적인 필드들이 초기화 되지 않은 상태이다.
    // 따라서 enum 상수에도 접근할 수 없다.
//    private static final Map<String, OperationOrigin> stringToEnum = new HashMap<>();
//
//    OperationOrigin() {
//        stringToEnum.put(toString(), this);
//    }

    public double apply(double x, double y) {
        switch(this) {
            case PLUS:   return x + y;
            case MINUS:  return x - y;
            case TIMES:  return x * y;
            case DIVIDE: return x / y;
        }

        throw new IllegalArgumentException("not supported operation");
    }
}
