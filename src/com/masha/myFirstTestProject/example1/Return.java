package com.masha.myFirstTestProject.example1;

public class Return {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Дo возврата");
        if (t){
            return; // возврат в вызывающий код
        }
        System.out.println("Этoт оператор выполняться не будет");
    }
}
