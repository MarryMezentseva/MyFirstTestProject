package com.masha.myFirstTestProject.chapter12listing3;

public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    //constructor
    Apple(int p){
        price = p;
    }

    int getPrice(){
        return price;
    }

}
