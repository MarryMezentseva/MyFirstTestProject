package com.masha.myFirstTestProject.chapter8listing13;

// Methods with differing type signatures are overloaded -- not overridden.
public class A {
        int i, j;

        A(int a, int b) {
            i = a;
            j = b;
        }

        // display i and j
        void show() {
            System.out.println("i and j: " + i + " " + j);
        }
    }

