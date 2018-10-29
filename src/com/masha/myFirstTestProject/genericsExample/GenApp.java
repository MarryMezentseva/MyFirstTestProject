package com.masha.myFirstTestProject.genericsExample;

import com.masha.myFirstTestProject.genericsExample.types.Cat;
import com.masha.myFirstTestProject.genericsExample.types.Dog;
import com.masha.myFirstTestProject.genericsExample.types.Owl;
import com.masha.myFirstTestProject.genericsExample.types.Pet;


import java.time.Instant;
import java.util.Date;
import java.util.List;

public class GenApp {
    public static void main(String[] args) {
       //inheritanceExmpl();
        Dog dog = new Dog();
        Date date = new Date();

        PrintSome printSome = new PrintSome();
        printSome.printDog(dog);
        printSome.printDog(date);

        PrintSomeGeneric<Dog> printSomeGeneric = new PrintSomeGeneric<>();
        printSomeGeneric.printDog(new Dog());
        // printSomeGeneric.printDog(new Date()); //comp error
        printSomeGeneric.setT(new Dog());
        //printSomeGeneric.setT(new Date());  //comp error

        print(new Dog());
        print(new Date());
        print(new Object());

        System.out.println(" //----------------------------------------------");
        Dog d = new Dog();
        Cat c = new Cat();

        UsePet<Dog> usePet = new UsePet<>();
        usePet.use(d);
        //usePet.use(c);
        usePet.getVoice(d);
        //usePet.getVoice(c);

        //BEFORE JAVA5
        UsePet usePet2 = new UsePet();
        usePet2.use(d);
        usePet2.use(c);
        usePet2.getVoice(d);
        usePet2.getVoice(c);

        System.out.println("/------------------------------------------------");
        HybridePet<Owl, Cat> hybridePet = new HybridePet<>();
        hybridePet.setT(new Owl());
        hybridePet.setV(new Cat());
        hybridePet.doHybride();


    }

    static <T> void print(T t){
        System.out.println(t);
    }

    static <T> int printWithResult(T t){
        System.out.println(t);
        return -1;
    }

    static <T extends Pet> void printExtendsPet(T t){
        System.out.println(t);
    }

    private static void inheritanceExmpl(){
        //inheritance
        A a = new A();
        a.call();

        A ab= new B();
        B bc = new C();
        A ac = new C();

        ab.call();
        bc.call();
        ac.call();

        ab = new C();
        ab.call();

        //B b = new A(); //compile error

    }
}
