package com.masha.myFirstTestProject.genericsExample.types;

public class Cat extends Pet {
    @Override
    public void voice() {
        System.out.println("May");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
