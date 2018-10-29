package com.masha.myFirstTestProject.example4.entities;

public class Lion extends  Animal implements Predator{

    public Lion() {
//        super("name", 4);
//        System.out.println("Lion() constructor");
        //super();
        System.out.println("Lion constructor");
    }

    @Override
    public void action(){
        System.out.println(name + " " + age + " Lion is hunting!!");
    }

    public void rrrr(){
        System.out.println(name + " " + age + " RRRR!!!!!");
    }

    @Override
    public void doOtherThings() {
        System.out.println("Lion: doOtherThings()");
    }

    @Override
    public void kill() {

    }

    @Override
    public void fight() {

    }
}
