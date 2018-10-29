package com.masha.myFirstTestProject.genericsExample.types;

public class Dog extends Pet {
//public class Dog extends Pet implements Comparable<Dog>{

    public Dog() {
    }

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }


//    @Override
//    public int compareTo(Dog o) {
//        //int res =  o.getAge() - age;
//        int res = o.getName().compareTo(name);
//        return res;
//    }


    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
