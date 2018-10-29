package com.masha.myFirstTestProject.chapter14;

public class RawDemo {
    public static void main(String args[]) {

        // Create a Gen1 object for Integers.
        Gen1<Integer> iOb = new Gen1<Integer>(88);

        // Create a Gen1 object for Strings.
        Gen1<String> strOb = new Gen1<String>("Generics Test");

        // Create a raw-type Gen1 object and give it
        // a Double value.
        Gen1 raw = new Gen1(new Double(98.6));

        // Cast here is necessary because type is unknown.
        double d = (Double) raw.getob();
        System.out.println("value: " + d);
 //Использование базовых типов может вызвать исключения
// времени выполнения. Ниже представлены некоторые примеры.
// Следующее приведение вызовет ошибку времени выполнения!
//    int i = (Integer) raw.getob(); // run-time error

        // This assigment overrides type safety.
        strOb = raw; // OK, but potentially wrong
//    String str = strOb.getob(); // run-time error

        // This assingment also overrides type safety.
        raw = iOb; // OK, but potentially wrong
//    d = (Double) raw.getob(); // run-time error
    }
}
