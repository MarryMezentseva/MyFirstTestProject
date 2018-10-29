package com.masha.myFirstTestProject.chapter12list7_13;

public class AutoBox2 {
    // Take an Integer parameter and return an int value;
    static int m(Integer v) {
        return v ; // auto-unbox to int
    }

    public static void main(String args[]) {
        // Передача int методу m() и присвоение возвращаемого значения
        // объекту Integer. Здесь аргумент 100 автоматически
        // упаковывается в Integer. Возвращаемое значение также
        // упаковывается в Integer.
        Integer iOb = m(100);

        System.out.println(iOb);
    }
}
