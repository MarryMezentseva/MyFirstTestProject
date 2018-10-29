package com.masha.myFirstTestProject.chapter14.listing15;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}
