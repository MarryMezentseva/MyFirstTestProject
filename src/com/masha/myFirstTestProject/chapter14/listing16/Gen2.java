package com.masha.myFirstTestProject.chapter14.listing16;

public class Gen2 <T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    // Override getob().
    T getob() {
        System.out.print("Gen2's getob(): ");
        return ob;
    }
}
