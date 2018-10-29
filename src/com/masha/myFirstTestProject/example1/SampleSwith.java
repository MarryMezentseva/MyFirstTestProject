package com.masha.myFirstTestProject.example1;

public class SampleSwith {
    public static void main(String[] args) {
        for (int i = 0; i<=8; i++)
            switch (i){
                case 0:
                    System.out.println("i равно нулю.");
                    break;
                case 1:
                    System.out.println("i равно единице.");
                    break;
                case 2:
                    System.out.println("i равно двум.");
                    break;
                case 3:
                    System.out.println("i равно трём.");
                    break;
                default:
                    System.out.println("i больше трёх.");
    }
  }
}
