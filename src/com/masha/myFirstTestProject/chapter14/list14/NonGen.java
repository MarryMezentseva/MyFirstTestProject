package com.masha.myFirstTestProject.chapter14.list14;

// A nongeneric class can be the superclass
// of a generic subclass.

// A nongeneric class.
class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}