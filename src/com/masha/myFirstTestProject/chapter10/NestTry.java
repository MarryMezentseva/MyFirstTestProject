package com.masha.myFirstTestProject.chapter10;
// An example nested try statements.
class NestTry {
    public static void main(String args[]) {
        try {
            int a = args.length;

 // Если не указаны параметры командной строки,следующий оператор создаст исключение деления на нуль.
            int b = 42 / a;

            System.out.println("a = " + a);

            try { // nested try block
//Если используется один аргумент командной строки, то исключение деления на 0 будет создано следующим кодом.
                if(a==1) a = a/(a-a); // division by zero

// Если используется два аргумента командной строки, то создается исключение выхода за пределы массива.
                if(a==2) {
                    int c[] = { 1 };
                    c[42] = 99; // generate an out-of-bounds exception
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds: " + e);
            }

        } catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}