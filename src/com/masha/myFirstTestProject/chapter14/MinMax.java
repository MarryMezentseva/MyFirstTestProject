package com.masha.myFirstTestProject.chapter14;

public interface MinMax <T extends Comparable<T>> {
    T min();
    T max();
}
