package me.whiteship.chapter07.item44.standard_functional_interfaces;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
