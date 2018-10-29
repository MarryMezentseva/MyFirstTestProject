package com.masha.myFirstTestProject.genericsExample.types;

import java.util.Objects;

public abstract class Pet {
    protected int age;
    protected String name;

    public abstract void voice();

    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pet pet = (Pet) o;
//        return age == pet.age &&
//                Objects.equals(name, pet.name);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(age, name);
//    }
}
