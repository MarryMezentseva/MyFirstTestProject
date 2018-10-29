package com.masha.myFirstTestProject.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo/демонстрация");
        } catch(NullPointerException e) {
            System.out.println("Caught inside demoproc/Исключение перехвачено в теле метода demoproc.");
            throw e; // re-throw the exception (повторно сгенерировать исключение)
        }
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Recaught/Пoвтopный перехват : " + e);
        }
    }
}
