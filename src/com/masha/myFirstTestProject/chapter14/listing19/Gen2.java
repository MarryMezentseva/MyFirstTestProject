package com.masha.myFirstTestProject.chapter14.listing19;

public class Gen2 extends Gen<String> {
    Gen2(String o) {
        super(o);
    }

    // A String-specific override of getob().
    String getob() {
        System.out.print("You called String getob(): ");
        return ob;
    }
}
