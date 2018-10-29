package com.masha.myFirstTestProject.example3;

public class ArrayUtils {

    public static int getMaxArrayIndexValue(int[] ints) {
        if (ints == null || ints.length == 0) {
            return -1;
        }
        int indexOfMax = 0;
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > ints[indexOfMax]) {
                indexOfMax = i;
            }
        }

        return indexOfMax;
    }

    public static boolean contains(int[] ints, int value) {
        if (ints == null || ints.length == 0) {
            return false;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void sort(int[] arr, boolean direction) {
        if (arr == null || arr.length == 0) {
            return;
        }
        boolean isSorted = false;
        int intBuf;
        while (!isSorted) {
            isSorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                if (direction
                        && (arr[i] > arr[i + 1])) {
                     {
                        isSorted = false;

                        intBuf = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = intBuf;
                    }

                } else if (arr[i] < arr[i + 1]){

                        isSorted = false;

                        intBuf = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = intBuf;

                }
            }
        }
    }

    public static int binarySearch(int[] arr, int element) {
        if (arr == null || arr.length ==0){
            return -1;
        }
        int last = arr.length - 1;
        int first = 0;
        int mid = (last + 1) / 2;
        while (arr[mid] != element && last != mid && first != mid) {
            if (arr[mid] < element) {
                first = mid;
                mid = (last + first) / 2;
            } else {
                last = mid;
                mid = (last + first) / 2;
            }
        }
        if (arr[last] == element)
            mid = last;
        if (arr[first] == element)
            mid = first;
        return arr[mid] == element ? mid : -1;
    }
}
