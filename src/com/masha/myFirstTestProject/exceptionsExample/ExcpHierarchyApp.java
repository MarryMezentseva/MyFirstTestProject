package com.masha.myFirstTestProject.exceptionsExample;

import com.masha.myFirstTestProject.enumExample.Status;
import com.masha.myFirstTestProject.example5.Program;
import sun.tools.jar.JarException;

import javax.security.sasl.SaslException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExcpHierarchyApp {

    public static void main(String[] args) {
        ExcpHierarchyApp app = new ExcpHierarchyApp();
       try {
           app.throwExc2();
           app.throwExc1();
       }catch (RuntimeException e){
           System.out.println("catch");
           e.printStackTrace();
       }finally {
           System.out.println("finaly");
       }



        System.out.println("----------------------------------------");
        try {
            app.throwExc2();
            app.throwExc1();
        }catch (ArithmeticException e){
            System.out.println("catch1");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("catch2");
            e.printStackTrace();
        }finally {
            System.out.println("finaly");
        }
        System.out.println("----------------------------------------");

        try {
            app.throwExc5();
            app.throwExc4();
            app.throwExc3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------");

        try {
            app.throwExc6();
            app.throwExc7();
            app.throwExc4();
        } catch (SaslException | JarException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------try block with resources----------------------------------");
        //before java 7
        OutputStream stream = null;
        try {
            stream = new FileOutputStream("adfvasv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //after java 7
        try ( FileOutputStream stream2 = new FileOutputStream("adfvasv")){
            stream2.getFD();
            //.....
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }

    public void throwExc1(){
        throw new RuntimeException();
    }

    public void throwExc2(){
        throw new ArithmeticException();
    }

    //--------------------------------------------------

    public void throwExc3() throws Exception {
        throw new Exception();
    }

    public void throwExc4() throws IOException {
        throw new IOException();
    }

    public void throwExc5() throws FileAlreadyExistsException {
        throw new FileAlreadyExistsException("dfdfd");
    }

    //--------------------------------------------------------

    public void throwExc6() throws SaslException {
        throw new SaslException();
    }

    public void throwExc7() throws JarException {
        throw new JarException();
    }


}
