package com.masha.myFirstTestProject.chapter14.listing20;

// Can't create an instance of T.
class Gen<T> {
    T ob;
    Gen() {
  //    ob = new T(); // Illegal!!!
    }
}

class Wrong<T> {
    // Wrong, no static variables of type T.
    //static T ob;

    // Wrong, no static method can use T.
   // static T getob() {
     //   return ob;
    }

// Generics and arrays.
class Gen1<T extends Number> {
    T ob;

    T vals[]; // OK

    Gen1(T o, T[] nums) {
        ob = o;

        // This statement is illegal.
        // vals = new T[10]; // can't create an array of T

        // But, this statement is OK.
        vals = nums; // OK to assign reference to existent array/ этот оператор верен.можно присвоить ссылку существующему массиву
    }
}

class GenArrays {
    public static void main(String args[]) {
        Integer n[] = { 1, 2, 3, 4, 5 };

      //  Gen<Integer> iOb = new Gen<Integer>(50, n);

        // Can't create an array of type-specific generic references./ Нельзя создать массив специфичных для типа обобщенных ссылок.
        // Gen<Integer> gens[] = new Gen<Integer>[10]; // Wrong!

        // This is OK.
        Gen<?> gens[] = new Gen<?>[10]; // OK
    }
}


