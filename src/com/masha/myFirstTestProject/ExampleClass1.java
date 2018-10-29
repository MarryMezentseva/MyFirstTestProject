package com.masha.myFirstTestProject;

public class ExampleClass1 {

    public static void main(String[] args) {

        String s;
        Integer integer;

        for (int i = 0; i < 9; i=i+2) {
            print(i);
        }

        int res = 0;
        int res2 = 0;
        int aa1 = 3;
        int bb1 = 5;

        int aa2 = 4;
        int bb2 = 7;

        res = doSomething(aa1, bb1);
        res2 = doSomething(aa2, bb2);

        int res3 = doSomething(
                3 + 6 ,
                doSomething(aa2, bb2));

        print("");
        print("111hkjhkjh");
        print(res3);

    }

    public static int doSomething(int a, int b){
        int result = 0;
        result = a + b;
        return result;
    }

    public static  void print(Object object){
        System.out.println(object);
    }



}
