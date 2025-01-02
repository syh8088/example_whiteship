package me.whiteship.chapter06.item36.anti_pattern;

public class Text {

    public static final int STYLE_BOLD = 1 << 0; // 00000001 1 굵게
    public static final int STYLE_ITALIC = 1 << 1; // 00000010 2 이탤릭체
    public static final int STYLE_UNDERLINE = 1 << 2; // 00000100 4 밑줄
    public static final int STYLE_STRIKETHROUGH = 1 << 3; // 00001000 8 취소선

    private int currentStyle;

    public void applyStyles(int styles) {
        System.out.printf("Applying styles %s to text%n", styles);
        this.currentStyle = styles;
    }

    public boolean isBold() {
        // TODO   00000011
        // TODO & 00000001
        // TODO   00000001
        return (currentStyle & STYLE_BOLD) == STYLE_BOLD;
    }

    public boolean isItalic() {
        return (currentStyle & STYLE_ITALIC) == STYLE_ITALIC;
    }

    public static void main(String[] args) {
        Text text = new Text();
        // TODO   00000001
        // TODO | 00000010
        // TODO   00000011
        text.applyStyles(STYLE_BOLD | STYLE_ITALIC);
        System.out.println(text.isBold());
    }
}
