package com.masha.myFirstTestProject.Classes;

public class VarArga2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Coдержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("1 пар-р перем.длинны: ", 10);
        vaTest("13 пар-р перем.длинны: ", 1, 2, 3);
        vaTest("0 пар-р перем.длинны: ");
    }
}
