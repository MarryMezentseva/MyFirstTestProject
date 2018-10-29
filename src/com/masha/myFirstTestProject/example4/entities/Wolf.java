package com.masha.myFirstTestProject.example4.entities;

public class Wolf extends Animal implements Predator{

    @Override
    public void action(){
        System.out.println(name + " " + age + " Ayyyyyyyy!!!!!");
    }

    public void run(){
        System.out.println(name + " " + age + " running!!!!!");
    }

    @Override
    public void doOtherThings() {
        System.out.println("Wolf: doOtherThings()");
    }

    @Override
    public void kill() {
        System.out.println("Wolf kill() ");
    }

    @Override
    public void fight() {
        System.out.println("Wolf  fight()");
    }
}
