package com.masha.myFirstTestProject.chapter14.listing17;
// Here, T is bound by Object by default / Здесь Т ограничен типом Object по умолчанию
class Gen<T> {
    T ob; // here, T will be replaced by Object /Здесь Т будет заменен Object

    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}