package com.masha.myFirstTestProject.enumExample;

public enum Status {
    ACTIVE, IN_ACTIVE, VACATION, FIRED, UNKNOWN, PENDING;

    public String getWrapped(){
        return "@{" + this.name() + "}";
    }
}
