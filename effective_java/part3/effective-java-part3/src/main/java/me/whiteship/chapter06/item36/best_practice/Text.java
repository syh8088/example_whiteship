package me.whiteship.chapter06.item36.best_practice;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// 코드 36-2 EnumSet - 비트 필드를 대체하는 현대적 기법 (224쪽)
public class Text {
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    private Set<Style> styles;

    // 어떤 Set을 넘겨도 되나, EnumSet이 가장 좋다.
    public void applyStyles(Set<Style> styles) {
        System.out.printf("Applying styles %s to text%n",
                Objects.requireNonNull(styles));
        this.styles = EnumSet.copyOf(styles);
    }

    public boolean isBold() {
        return styles.contains(Style.BOLD);
    }

    public boolean isItalic() {
        return styles.contains(Style.ITALIC);
    }

    // 사용 예
    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
        System.out.println(text.isBold());
    }
}
