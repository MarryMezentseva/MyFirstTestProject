package com.masha.myFirstTestProject.chapter9listing10;

public class TestIface {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
    }


}
