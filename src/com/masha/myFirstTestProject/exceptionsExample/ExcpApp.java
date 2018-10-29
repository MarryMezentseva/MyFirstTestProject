package com.masha.myFirstTestProject.exceptionsExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExcpApp {

    public static void main(String[] args) {
        ExcpApp app = new ExcpApp();
        System.out.println("A---------------------------------------");
        try {
            app.divisionByZero();
            System.out.println("after app.divisionByZero();");
        }catch (ArithmeticException e){
            System.out.println("EEEE");
        }finally {
            System.out.println("after app.divisionByZero(); finaly");
        }
        System.out.println("B---------------------------------------");
        //app.divisionByZero(); //this will throw an ArithmeticException
        System.out.println("C---------------------------------------");
        app.readFile();
        System.out.println("D---------------------------------------");
        try {
            app.readFile2();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("E---------------------------------------");
        //app.expectingExcp();
        System.out.println("F---------------------------------------");
        app.validateString("rrrrr");
        System.out.println("G---------------------------------------");
        app.validateString("qqq");
        System.out.println("I---------------------------------------");
        try {
            app.validateStringChecked("rrr");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readFile(){
        //checked exception expecting
        try {
            String s = new String(Files.readAllBytes(Paths.get("c:/eee.txt")));
        } catch (IOException e) {
            System.out.println("readFile() EEEE");
            e.printStackTrace();
        }

    }

    public void expectingExcp() throws IOException {
        readFile2();
    }

    public void readFile2() throws IOException{
        //checked exception expecting
            String s = new String(Files.readAllBytes(Paths.get("c:/eee.txt")));
    }

    public void divisionByZero(){
        int i = 2/0;
    }

    //unchecked
    public void validateString(String string){
        if ("qqq".equals(string)){
            RuntimeException exception = new RuntimeException();
            throw exception;
        }
    }

    //checked
    public void validateStringChecked(String string) throws Exception {
        if ("qqq".equals(string)){
            Exception exception = new Exception();
            throw exception;
        }
    }

}
