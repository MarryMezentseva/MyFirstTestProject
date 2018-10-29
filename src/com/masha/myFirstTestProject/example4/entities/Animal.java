package com.masha.myFirstTestProject.example4.entities;

import com.masha.myFirstTestProject.example1.Dog;

public abstract class Animal {

    public static final long SOME_ID = 2342345L;

    protected String name;
    protected int age;

    public Animal() {
        System.out.println("Animal() constructor.");
    }

    public Animal(String name, int age) {
        System.out.println("Animal(String name, int age) constructor.");
        this.name = name;
        this.age = age;
    }

    public void action(){

        System.out.println("Do animal action.");
    }

    public  void eat(){
        System.out.println("Eating right now!");
    }

    public abstract void doOtherThings();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
