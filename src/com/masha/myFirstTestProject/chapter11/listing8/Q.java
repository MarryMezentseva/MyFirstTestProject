package com.masha.myFirstTestProject.chapter11.listing8;

//Неправильная реализация поставщка и потребителя

public class Q {
    int n;

    synchronized int get() {
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put: " + n);
    }
}
