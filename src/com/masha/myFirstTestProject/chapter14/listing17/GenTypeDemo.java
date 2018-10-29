package com.masha.myFirstTestProject.chapter14.listing17;

    public class GenTypeDemo {
        public static void main(String args[]) {
            Gen<Integer> iOb = new Gen<Integer>(99);
            Gen<Float> fOb = new Gen<Float>(102.2F);

            System.out.println(iOb.getClass().getName());
            System.out.println(fOb.getClass().getName());
        }
    }


