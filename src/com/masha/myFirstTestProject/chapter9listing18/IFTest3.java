package com.masha.myFirstTestProject.chapter9listing18;

public class IFTest3 {
    public static void main(String args[]) {
        IntStack mystack; // create an interface reference variable (создание ссылочной переменной интерфейса)
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; // загрузка динамического стека
        // push some numbers onto the stack
        for(int i=0; i<12; i++) mystack.push(i);

        mystack = fs; // load fixed stack(загрузка динамического стека)
        for(int i=0; i<8; i++) mystack.push(i);


        mystack = ds;
        System.out.println("Values in dynamic stack:");
        for(int i=0; i<12; i++)
            System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Values in fixed stack:");
        for(int i=0; i<8; i++)
            System.out.println(mystack.pop());
    }
}
