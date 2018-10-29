package com.masha.myFirstTestProject.example1;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private String colour;

    public Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public Dog() {

    }

    public Dog(String name){
        this.name = name;
    }


    public void walk(){
        System.out.println(name + " is walking");
    }

    public void voice(){
        System.out.println(name + " is screaming");
    }
    public void info(){
        System.out.println("name=" + name + "; " + "age=" + age + "; " + "colour=" + colour + "; " );
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getColour(){
        return this.colour;
    }

}
