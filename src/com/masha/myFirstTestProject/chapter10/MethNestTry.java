package com.masha.myFirstTestProject.chapter10;

//Операторы try могут быть неявно вложены в вызовах методов.

public class MethNestTry {
    static void nesttry(int a) {
        try { // nested try block
//If one command line arg is used, then an divide-by-zero exception
// will be generated by the following code (Если используется один аргумент командной строки,
//то исключение деления на нуль будет создано следующим кодом)
            if(a==1) a = a/(a-a); // division by zero

// If two command line args are used then generate an out-of-bounds exception.(Если используется два аргумента командной строки,
//то создается исключение выхода за пределы массива)
            if(a==2) {
                int c[] = { 1 };
                c[42] = 99; // generate an out-of-bounds exception
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out-of-bounds: " + e);
        }
    }

    public static void main(String args[]) {
        try {
            int a = args.length;

/*If no command line args are present,the following statement will generate a divide-by-zero exception.
(Если не указаны параметры командной строки, следующий оператор создаст
исключение деления на нуль)*/
            int b = 42 / a;

            System.out.println("a = " + a);

            nesttry(a);
        } catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}