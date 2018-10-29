package com.masha.myFirstTestProject.chapter12list7_13;
// Demonstrate a type wrapper.
public class Wrap{
    public static void main(String args[]) {

        Integer iOb = new Integer(100);

        int i = iOb.intValue();

        System.out.println(i + " " + iOb); // displays 100 100
    }
}