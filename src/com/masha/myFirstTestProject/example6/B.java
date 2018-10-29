package com.masha.myFirstTestProject.example6;

public class B {
    public void doSmth(){
        System.out.println("do something");
        call();
    }

    public void call(){
        System.out.println("call");
    }

    public static void myStaticMethod(){
        System.out.println("myStaticMethod");
        B bbbb = new B();
        bbbb.doSmth();
    }

}
