package com.masha.myFirstTestProject.genericsExample;

public class PrintSomeGeneric <T> {

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public void printDog(T o){
        System.out.println("val: " + o);
    }

    public  void getSome(){
        System.out.println(t);
    }

}
