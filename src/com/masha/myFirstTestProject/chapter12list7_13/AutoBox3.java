package com.masha.myFirstTestProject.chapter12list7_13;

public class AutoBox3 {
    public static void main(String args[]) {

        Integer iOb, iOb2;
        int i;

        iOb = 100;
        System.out.println("Original value of iOb: " + iOb);

        // Следующее автоматически распаковывает iOb,
        // выполняет его приращение, затем повторно
        // упаковывает результат обратно в iOb.
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        // Здесь iOb распаковано, выражение вычисляется,
        // а результат снова упаковывается и
        // присваивается Ю Ь 2 .
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after expression: " + iOb2);

        // Вычисляется то же самое выражение,
        // но результат не упаковывается.
        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);

    }
}
