package com.masha.myFirstTestProject.exceptionsExample;

import java.io.IOException;

public class ChainedExcpApp {
    public static void main(String[] args) {
        ChainedExcpApp app = new ChainedExcpApp();
        app.myMethod();
        app.throwExc1Wrapper();
    }

    public void myMethod(){
        throwExc1Wrapper();
    }

    private void throwExc1Wrapper(){
        try {
            throwExc1();
        } catch (IOException e) {
            throw new RuntimeException("Error", e);
        }
    }



    public void throwExc1() throws IOException {
        ////,,,,
        throw new IOException();
    }


}
