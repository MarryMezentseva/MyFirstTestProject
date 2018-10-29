package com.masha.myFirstTestProject.Classes;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    //инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Cтeк заполнен. ");
        else
            stck[++tos] = item;
    }

    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println(" Cтeк не загружен. ");
            return 0;
        } else
            return stck[tos--];
    }

    public static void main(String[] args) {
        Stack mystackl = new Stack();
        Stack mystack2 = new Stack();
        //разместить числа в стеке
        for (int i = 0; i < 10; i++) mystackl.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
        // извлечь эти числа из стека
        System.out.println(" Cтeк в mystackl : ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystackl.pop());
        System.out.println("Cтeк в mystack2 : ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

        //эти операторы недопустим

        mystackl.tos = -2;
        mystack2.stck[3] = 100;
    }
}