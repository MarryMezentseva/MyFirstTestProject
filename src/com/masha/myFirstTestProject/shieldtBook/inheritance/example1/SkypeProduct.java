package com.masha.myFirstTestProject.shieldtBook.inheritance.example1;

public class SkypeProduct extends Product{
    @Override
    public void install(){
        System.out.println("Installing started: SkypeProduct...");
        System.out.println("Copy files: SkypeProduct...");
        super.install();
        System.out.println("Installing finished: SkypeProduct...");
    }

    @Override
    public void upgrade(){
        super.install();
    }
}
