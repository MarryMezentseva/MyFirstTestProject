package com.masha.myFirstTestProject.shieldtBook.inheritance.example1;

public class Product {
    public void install(){
        System.out.println("Installing started: Product...");
        System.out.println("Copy files: Product...");
        System.out.println("Installing finished: Product...");
    }

    public void upgrade(){
        System.out.println("Upgrade started: Product...");
        System.out.println("Upgrading files: Product...");
        System.out.println("Upgrade finished: Product...");
    }

    public void unInstall(){
        System.out.println("Unistalling started: Product...");
        System.out.println("Deleting files: Product...");
        System.out.println("Unistalling finished: Product...");
    }
}
