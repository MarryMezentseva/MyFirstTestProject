package com.masha.myFirstTestProject.chapter14;
// Демонстрация обобщенного класса.
public class GenDemo {
    public static void main(String args[]) {
        // Create a Gen reference for Integers.
        // Создать Gen-ссылку для Integers.
        Gen<Integer> iOb;

        // Create a Gen<Integer> object and assign its
        // reference to iOb.  Notice the use of autoboxing
        // to encapsulate the value 88 within an Integer object.
       //Создать объект Gen<Integer> и присвоить ссылку на iOb.
        // Отметьте применение автоупаковки для инкапсуляции значения 88 в объект Integer.
        iOb = new Gen<Integer>(88);


        // Show the type of data used by iOb.
        // Показать тип данных, используемый iOb.
        iOb.showType();

        // Get the value in iOb. Notice that no cast is needed.
        // Получить значение iOb. Обратите внимание,что никакого приведения не нужно
        int v = iOb.getob();
        System.out.println("value: " + v);

        System.out.println();

        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");

        // Show the type of data used by strOb.
        strOb.showType();

        // Get the value of strOb. Again, notice
        // that no cast is needed.
        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}

