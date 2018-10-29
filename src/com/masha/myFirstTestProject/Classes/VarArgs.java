package com.masha.myFirstTestProject.Classes;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Koличecтвo аргументов :" + v.length + " Содержиmое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        // Обратите внимание на возможные способы вызова метода VaTest() с аргументам переменной длины
        vaTest(10); // 1 аргумнт
        vaTest(1, 2, 3); // 3 аргумента
        vaTest();//без аргументов
    }
}
