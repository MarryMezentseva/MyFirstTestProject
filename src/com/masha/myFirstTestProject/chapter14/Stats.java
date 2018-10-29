package com.masha.myFirstTestProject.chapter14;

//аргумент типа Т должен быть либо Number, либо классом, унаследованным от него.
public class Stats <T extends Number> {
    T[] nums; // nums is an array of type T

    // Передать конструктору ссылку на массив значений типа Т.
    Stats(T[] o) {
        nums = o;
    }

    // Return type double in all cases.
    double average() {
        double sum = 0.0;

        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }
}
