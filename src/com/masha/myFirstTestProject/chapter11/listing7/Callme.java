package com.masha.myFirstTestProject.chapter11.listing7;

//В этой програме используется синхронизированны блок
public class Callme {
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
