package com.masha.myFirstTestProject.chapter14;

public class Gen3 <T,V> extends Gen2<T> {
    V ob2;

    Gen3(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getob2(){
        return ob2;
    }
}
