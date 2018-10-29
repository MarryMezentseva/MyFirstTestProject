package com.masha.myFirstTestProject.chapter14;
// This class holds an array of coordinate objects.
// Этот класс хранит массив координатных объектов,
public class Coords <T extends TwoD>{
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}
