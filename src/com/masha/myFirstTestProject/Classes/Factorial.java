package com.masha.myFirstTestProject.Classes;

public class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
        class Recursion {
            public static void main ( String args []) {
                Factorial f = new Factorial();
                System.out.println("Фaктopиaл 3 равен " + f.fact(3));
                System.out.println("Фaктopиaл 4 равен "  + f.fact(4));
                System.out.println("Фaктopиaл 5 равен "  + f.fact(5));
            }
}
