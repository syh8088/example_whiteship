package me.whiteship.chapter08.item51;

public class EnumExample {

    public enum Status {
        SUCCESS,
        FAILURE
    }

    public static void main(String[] args) {
        Status status = performOperation(Status.SUCCESS);
        System.out.println("Operation status: " + status);

        status = performOperation(Status.FAILURE);
        System.out.println("Operation status: " + status);
    }

    public static Status performOperation(Status status) {
        if (status == Status.SUCCESS) {
            System.out.println("Operation was successful");
            return Status.SUCCESS;
        } else {
            System.out.println("Operation failed");
            return Status.FAILURE;
        }
    }
}