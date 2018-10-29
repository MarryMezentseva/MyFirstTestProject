package com.masha.myFirstTestProject.chapter9listing23;

//реализовать интерфейс MyIF

public class MyIFImp implements MyIF{
    //В этом классе должен быть реализован только метод qetNumber(), определенны в интерфейсе МyIF .
    // А вызов метода getString() разрешается по умолчанию

   public int getNumber(){
       return 100;
    }
}


