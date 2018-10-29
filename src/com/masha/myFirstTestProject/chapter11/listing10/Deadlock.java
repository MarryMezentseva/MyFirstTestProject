package com.masha.myFirstTestProject.chapter11.listing10;
//An example of deadlock (Пример взаимной блокировки)
public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "Racing/Соперничающй/Thread");
        t.start();

        a.foo(b); // get lock on A in this thread.
        System.out.println("Back in main thread");
    }

    public void run() {
        b.bar(a); // get lock on B in other thread.
        System.out.println("Back in other thread");
    }

    public static void main(String args[]) {
        new Deadlock();
    }
}
