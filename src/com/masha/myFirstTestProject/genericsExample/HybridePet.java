package com.masha.myFirstTestProject.genericsExample;

import com.masha.myFirstTestProject.genericsExample.types.Flyable;
import com.masha.myFirstTestProject.genericsExample.types.Pet;

public class HybridePet <T extends Pet & Flyable,V extends Pet> {
    private T t;
    private V v;

    public void doHybride(){
        System.out.println(v.toString() + t.toString());
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
