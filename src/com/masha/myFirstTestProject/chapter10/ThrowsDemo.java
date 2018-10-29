package com.masha.myFirstTestProject.chapter10;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne/B теле метода throwOne().");
        throw new IllegalAccessException("demo/дeмoнcтpaция");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught/Перехвачено исключние:" + e);
        }
    }
}
