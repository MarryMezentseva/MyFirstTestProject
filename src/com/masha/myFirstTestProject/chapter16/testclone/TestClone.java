package com.masha.myFirstTestProject.chapter16.testclone;

// Override the clone() method.

class TestClone implements Cloneable {
    int a;
    double b;

    // clone() is now overridden and is public. /  clone() переопределен как public.
    public Object clone() {
        try {
            // call clone in Object.
            return super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
            return this;
        }
    }
}
