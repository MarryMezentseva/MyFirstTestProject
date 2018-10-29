package com.masha.myFirstTestProject.chapter16;

public class ThreadGroupDemo {
    public static void main(String args[]) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("One", groupA);
        NewThread ob2 = new NewThread("Two", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Four", groupB);

        System.out.println("\nHere is output from list():");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается группа A");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga); // get threads in group / получить потоки группы
        for(int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).mysuspend(); // suspend each thread / приостановить каждый поток
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Возобновление Group A");
        for(int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).myresume(); // resume all threads in group
        }

        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Exception in Main thread");
        }

        System.out.println("Main thread exiting.");
    }
}
