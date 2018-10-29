package com.masha.myFirstTestProject.chapter9listing17;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
