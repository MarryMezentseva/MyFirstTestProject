package com.masha.myFirstTestProject.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d,a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено");
            }
        catch (ArithmeticException e){ //перехват ошибки деления на нуль
            System.out.println("Деление на нуль");
        }
        System.out.println("После оператора cath.");
    }
}
