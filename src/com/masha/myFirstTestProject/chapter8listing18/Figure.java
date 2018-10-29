package com.masha.myFirstTestProject.chapter8listing18;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();  // area is now an an abstract method
}
