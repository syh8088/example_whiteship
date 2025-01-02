package me.whiteship.chapter08.item51;

public class SplitMethodsExample {

    // 원래 긴 매개변수 목록을 가진 메서드
    public void processOrder(String customerName, String customerAddress, String productName, int quantity, double price, String paymentMethod) {
        // 주문 처리 로직
    }

    // 매개변수 목록을 짧게 유지하기 위해 메서드를 쪼갠 예제
    public void processOrder(Order order) {
        validateOrder(order);
        processPayment(order);
        shipOrder(order);
    }

    private void validateOrder(Order order) {
        // 주문 유효성 검사 로직
    }

    private void processPayment(Order order) {
        // 결제 처리 로직
    }

    private void shipOrder(Order order) {
        // 배송 처리 로직
    }

    public static void main(String[] args) {
        Order order = new Order("John Doe", "123 Main St", "Laptop", 1, 999.99, "Credit Card");
        SplitMethodsExample example = new SplitMethodsExample();
        example.processOrder(order);
    }
}

class Order {
    private String customerName;
    private String customerAddress;
    private String productName;
    private int quantity;
    private double price;
    private String paymentMethod;

    public Order(String customerName, String customerAddress, String productName, int quantity, double price, String paymentMethod) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    // Getter methods
    public String getCustomerName() { return customerName; }
    public String getCustomerAddress() { return customerAddress; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public String getPaymentMethod() { return paymentMethod; }
}