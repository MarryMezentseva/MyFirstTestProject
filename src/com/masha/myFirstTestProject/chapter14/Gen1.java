package com.masha.myFirstTestProject.chapter14;

public class Gen1<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen1(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}
