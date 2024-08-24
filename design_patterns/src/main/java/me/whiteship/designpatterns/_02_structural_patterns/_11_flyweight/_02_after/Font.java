package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

/**
 * intrinsit (잘 변하지 않는 속성)
 *
 * immutable 해야 한다.
 *
 * 변하지 않는 객체 이기 때문에 해당 객체는 모든 스레드가 모두 공유 하는 객체 이기 때문에 변질 되어서는 안된다.
 */
public final class Font {

    final String family;

    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
