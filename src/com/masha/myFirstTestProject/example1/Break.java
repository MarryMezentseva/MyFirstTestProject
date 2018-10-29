package com.masha.myFirstTestProject.example1;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Пpeдшecтвyeт оператору break . ");
                    if (t) break second; // выхд из блока second
                    System.out.println(" Этoт оператор не будет выплняться ");
                }
                System.out.println("Этoт оператор не будет выполняться ");
            }
            System.out.println(" Этoт оператор следует за блоком second . ");
        }
    }
}
