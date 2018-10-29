package com.masha.myFirstTestProject.customExceptions;

import com.masha.myFirstTestProject.customExceptions.exceptions.MyException;
import com.masha.myFirstTestProject.customExceptions.exceptions.MyRuntimeException;
import com.sun.javaws.exceptions.ErrorCodeResponseException;

public class CustomExcApp {
    public static void main(String[] args) {
        CustomExcApp app = new CustomExcApp();
        //app.doSomeUnchecked();

        try {
            app.doSomeChecked();
        } catch (MyException e) {
            String s = e.getMessage();
            Throwable throwable = e.getCause();
            StackTraceElement[] elements = e.getStackTrace();

            //e.printStackTrace();

            //app.call(); Stack overflow
        }



    }

    public void call(){
        call();
    }

    public void doSomeChecked() throws MyException {
        throw new MyException("Masha!!!");
    }

    public void doSomeUnchecked(){
        throw new MyRuntimeException("asdfgdgd");
    }

    public void throwError(){
        throw new Error();
    }
}
