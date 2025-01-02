package me.whiteship.chapter08.item51;

import java.util.List;

public class ConvenienceMethodsExample {

    // 편의 메서드가 너무 많은 클래스
    public class TooManyConvenienceMethods {
        private List<String> elements;

        public TooManyConvenienceMethods(List<String> elements) {
            this.elements = elements;
        }

        public void addElement(String element) {
            elements.add(element);
        }

        public void removeElement(String element) {
            elements.remove(element);
        }

        public boolean containsElement(String element) {
            return elements.contains(element);
        }

        public int getElementCount() {
            return elements.size();
        }

        public String getElementAt(int index) {
            return elements.get(index);
        }

        // ... 기타 편의 메서드들
    }

    // 적절한 메서드만 포함한 클래스
    public class AppropriateMethods {
        private List<String> elements;

        public AppropriateMethods(List<String> elements) {
            this.elements = elements;
        }

        public void addElement(String element) {
            elements.add(element);
        }

        public void removeElement(String element) {
            elements.remove(element);
        }

        public boolean containsElement(String element) {
            return elements.contains(element);
        }

        // 필요한 메서드만 포함
    }

    public static void main(String[] args) {
        List<String> elements = List.of("Apple", "Banana", "Cherry");

        TooManyConvenienceMethods tooMany = new ConvenienceMethodsExample().new TooManyConvenienceMethods(elements);
        AppropriateMethods appropriate = new ConvenienceMethodsExample().new AppropriateMethods(elements);

        // 사용 예제
        tooMany.addElement("Date");
        appropriate.addElement("Date");
    }
}