package com.masha.myFirstTestProject.example1;

public class DogHouse {
    private String adress;
    private Dog[] dogs;

    public Dog[] getDogs() {
        return dogs;
    }
    public void setDog( Dog[] dogs){
        this.dogs = dogs;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

