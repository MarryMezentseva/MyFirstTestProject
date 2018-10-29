package com.masha.myFirstTestProject.collectionsExample;

import com.masha.myFirstTestProject.genericsExample.types.Dog;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
