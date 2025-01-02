package me.whiteship.chapter06.item34.operation;

import java.util.HashMap;
import java.util.Map;

public class OperationClass {

    private final static OperationClass PLUS = new OperationClass();

    private final static Map<String, OperationClass> stringToEnum = new HashMap<>();

    private OperationClass() {
        System.out.println(PLUS.toString());
        stringToEnum.put("+", PLUS);
    }

}
