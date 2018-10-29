package com.masha.myFirstTestProject.enumExample;

public enum Descriptor {
    /*
    * ${firstName}
    * ${lastName}
    * ${dbConnectionMode}
    *
    * */

    FIRST_NAME("${firstName}", 1){
        @Override
        public void doSome() {
            System.out.println("FIRST_NAME doSome");
        }

        @Override
        public void myAbstract() {

        }
    },
    LAST_NAME("${lastName}") {
        @Override
        public void myAbstract() {

        }
    },
    DB_CONNECTION_MODE("${dbConnectionMode}", 2) {
        @Override
        public void myAbstract() {

        }
    };

    private String descriptorString;
    private int anInt;

    Descriptor(String descriptorString, int anInt) {
        this.descriptorString = descriptorString;
        this.anInt = anInt;
    }

    Descriptor(String descriptorString) {
        this.descriptorString = descriptorString;
    }

    public String getDescriptorString(){
        return descriptorString;
    }

    public int getAnInt() {
        return anInt;
    }

    public void doSome(){
        System.out.println("sdfsbbs");
    }

    public abstract void myAbstract();
}
