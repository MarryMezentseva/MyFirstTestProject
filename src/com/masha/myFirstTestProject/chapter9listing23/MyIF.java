package com.masha.myFirstTestProject.chapter9listing23;

public interface MyIF {
    /*Это объявление обыного метода в интерфейсе .
      Он НЕ предоставляет реализацию по умолчанию*/
    int getNumber();

    //А это объявление метода по умолчанию . Обратите вниание на его реализацию по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
