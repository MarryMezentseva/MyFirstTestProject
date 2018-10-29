package com.masha.myFirstTestProject.example1;

public class IfElse {
    public static void main(String[] args) {
        int month = 5;
        String seasons;
        if (month == 12 || month == 1 || month == 2)
            seasons = "winter";
        else if (month == 3 || month == 4 || month == 5)
            seasons = "spring";
        else if (month == 6 || month == 7 || month == 8)
            seasons = "summer";
        else if (month == 9 || month == 10 || month == 11)
            seasons = "autumn";
        else
            seasons = "fantastic";
        System.out.println("April is a month of " + seasons + ".");
        System.out.println("--------------------------------------------------------");
    }
}
