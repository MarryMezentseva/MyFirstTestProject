package com.masha.myFirstTestProject.genericsExample.types;

public class Owl extends Pet implements Flyable{
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void voice() {
        System.out.println("ufff");
    }

    @Override
    public String toString() {
        return "Owl{}";
    }
}
