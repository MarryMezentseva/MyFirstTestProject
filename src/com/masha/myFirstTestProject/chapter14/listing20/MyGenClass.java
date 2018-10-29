package com.masha.myFirstTestProject.chapter14.listing20;

// Ambiguity caused by erasure on
// overloaded methods. /Неоднозначность порождается очисткой перегруженных методов
class MyGenClass<T, V> {
    T ob1;
    V ob2;

    // ...

    // These two overloaded methods are ambiguous and will not compile./Эти два перегруженных метода неоднозначны и не компилируются.

   //void set(T o) {
   //     ob1 = o;
    //}

    void set(V o) {
        ob2 = o;
    }
}