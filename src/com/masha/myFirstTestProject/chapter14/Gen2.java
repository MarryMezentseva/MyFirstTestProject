package com.masha.myFirstTestProject.chapter14;

public class Gen2 <T> {
    T ob;

    Gen2(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}