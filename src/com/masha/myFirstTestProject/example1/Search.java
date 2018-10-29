package com.masha.myFirstTestProject.example1;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6,8,3,7,5,6,1,4};
        int val = 111;
        boolean found = false;

        for(int x : nums){
            if (x==val){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("Found!");
        }
    }
}
