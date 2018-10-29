package com.masha.myFirstTestProject.example4;

import com.masha.myFirstTestProject.example4.entities.*;


public class ZooAppExample {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setAge(3);
        lion.setName("King");
        lion.action();
        lion.rrrr();
        lion.eat();

        Wolf wolf = new Wolf();
        wolf.setAge(5);
        wolf.setName("Slavic");
        wolf.action();
        wolf.run();
        wolf.eat();

        System.out.println("////////////////polymorphysm/////////////////////");

        Animal animal1 = new Wolf();
        animal1.action();
        animal1.eat();
        ((Wolf)animal1).run();

        System.out.println("/////////////////////////////////////");

        animal1 = new Lion();
        animal1.action();
        animal1.eat();
        ((Lion) animal1).rrrr();

        Animal anima3 = getAnimal("");
        //anima3.action();

        //constant using
        long i = anima3.SOME_ID;
        i = Lion.SOME_ID;

        System.out.println("//////////////////abstract class////////////////////");
        Cat cat = new Cat();
        cat.eat();
        cat.action();

        System.out.println("//////////////////interface////////////////////");
        Wolf wolf1 = new Wolf();
        wolf.fight();

        Predator wolfPredator = new Wolf();
        wolfPredator.fight();
        wolfPredator.kill();

        doPredator(new Cat());
        doPredator(new Wolf());
        System.out.println("/////////////////");
        doPredator(new Lion());
        System.out.println("/////////////////");
        doPlay(new Cat());


    }

    public static void doPlay(Playable playable){
        playable.play();
    }

    public static void doPredator(Predator predator){
        predator.kill();
        predator.fight();
    }

    //for example only
    public static Animal getAnimal(String animalType){
        switch (animalType){
            case "lion":
                return new Lion();
            case "wolf":
                return new Wolf();
             default:
                return null;
        }
    }


}
