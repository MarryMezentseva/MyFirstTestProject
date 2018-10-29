package com.masha.myFirstTestProject.enumExample;

public class User {
    private int age;
    private String name;
    private String LastName;
    //active, inactive, onVacation, fired
    private Status status;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", status=" + status +
                '}';
    }
}
