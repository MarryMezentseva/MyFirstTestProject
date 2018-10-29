package com.masha.myFirstTestProject.example1;

public class While {
    public static void main(String[] args) {
        int n = 10;
//        while (n>11){
//            System.out.println("Такт" + n);
//            n--;
//        }
        do {
            System.out.println("Такт" + n);
        }
        while (--n>0);
    }
}
