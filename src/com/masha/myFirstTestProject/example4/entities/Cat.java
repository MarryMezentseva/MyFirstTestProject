package com.masha.myFirstTestProject.example4.entities;

public class Cat extends Animal implements Predator,Playable {

    public Cat() {
        System.out.println("Cat() constructor");
    }

    @Override
    public void action() {
        System.out.println("Miy-miy!!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Big fish");
    }

    @Override
    public void doOtherThings() {
        System.out.println("Cat: doOtherThings()");
    }

    @Override
    public void kill() {

    }

    @Override
    public void fight() {

    }

    @Override
    public void play() {
        System.out.println("Cat  play()");
    }
}
