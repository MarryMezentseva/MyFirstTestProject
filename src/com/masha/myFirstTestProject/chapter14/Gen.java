package com.masha.myFirstTestProject.chapter14;
// Простой обобщенный класс.
// Здесь Т — это параметр типа,
// который будет заменен реальным типом
// при создании объекта класса Gen.
public class Gen<T>{
    T ob; // declare an object of type T
          // объявление объекта типа Т

    // Pass the constructor a reference to an object of type T
    // Передать конструктору ссылку на объект типа Т.
    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of T is " +
                ob.getClass().getName());
    }
}
