package com.masha.myFirstTestProject.example3;

public class ArrayUtilsTest {

    public static void main(String... args) {
        int[] intsPos = {70, 15, 4, 388, 20, 67};
        int[] intsNeg = {-70, 15, 4, -388, 20, 67};
        int[] emptyArray = new int[0];
        int[] singleElementArray = {17};

        System.out.println("-------------------getMaxArrayIndexValue() tests-------------------");
        int result = ArrayUtils.getMaxArrayIndexValue(intsPos);
        System.out.println("Positive array test: " + (result == 3));

        result = ArrayUtils.getMaxArrayIndexValue(intsNeg);
        System.out.println("Negative array test: " + (result == 5));

        result = ArrayUtils.getMaxArrayIndexValue(emptyArray);
        System.out.println("Empty array test: " + (result == -1));

        result = ArrayUtils.getMaxArrayIndexValue(null);
        System.out.println("Null argument test: " + (result == -1));

        System.out.println("-------------------contains() tests-------------------");

        boolean boolResult = ArrayUtils.contains(intsPos, 4);
        System.out.println("Positive array test: " + boolResult);

        boolResult = ArrayUtils.contains(intsPos, 500);
        System.out.println("Positive array with unknown element test: " + !boolResult);

        boolResult = ArrayUtils.contains(intsNeg, -388);
        System.out.println("Negative array test: " + boolResult);

        boolResult = ArrayUtils.contains(emptyArray, 1);
        System.out.println("Empty array test: " + !boolResult);

        boolResult = ArrayUtils.contains(null, 10);
        System.out.println("Null array test, valid value: " + !boolResult);

        System.out.println("----------------------binarySearch() tests----------------");

        int[] arr = {12, 13, 16, 23, 24, 52, 100, 122};
        int binarySearchRes = ArrayUtils.binarySearch(arr, 24);
        System.out.println("binarySearch test1: " + (binarySearchRes == 4));

        int[] negativArr = {-13, -12, -4, 23, 24, 52, 100, 122};
        binarySearchRes = ArrayUtils.binarySearch(negativArr, -4);
        System.out.println("binarySearch with negative element: " + (binarySearchRes == 2));

        binarySearchRes = ArrayUtils.binarySearch(arr, 200);
        System.out.println("binarySearch with non-existent element: " + (binarySearchRes == -1));

        binarySearchRes = ArrayUtils.binarySearch(new int[0], 100);
        System.out.println("binarySearch with empty array: " + (binarySearchRes == -1));

        binarySearchRes = ArrayUtils.binarySearch(singleElementArray, 17);
        System.out.println("binarySearch with single element array: " + (binarySearchRes == 0));

        binarySearchRes = ArrayUtils.binarySearch(null, 12);
        System.out.println("binarySearch with null array: " + (binarySearchRes == -1));

        System.out.println("--------------------sort() test-----------------");
        int arr1[] = getNonSortedIntArray();
        ArrayUtils.sort(arr1, true);
        System.out.println("Sort up: " + isIntArrEquals(arr1, getSortedUpIntArray()));

        int arr2[] = getNonSortedIntArray();
        ArrayUtils.sort(arr2, false);
        System.out.println("Sort down: " + isIntArrEquals(arr2, getSortedDownIntArray()));

        int[] arrNeg = {-8, 0, -11, -5, 5};
        int[] arrNegSorted = {-11, -8, -5, 0, 5};
        int[] arrNegSortedDown = {5, 0, -5, -8, -11};

        ArrayUtils.sort(arrNeg, true);
        System.out.println("Sort up with negative element:" + isIntArrEquals(arrNeg, arrNegSorted));

        ArrayUtils.sort(arrNeg,false);
        System.out.println("Sort down with negative element:" + isIntArrEquals(arrNeg, arrNegSortedDown));

        int[] array = null;
        ArrayUtils.sort(null, true);
        System.out.println("Sort with null array:" + isIntArrEquals(array, null));

        ArrayUtils.sort(emptyArray, true);
        System.out.println("Sort with empty array:" + isIntArrEquals(emptyArray, emptyArray));

        ArrayUtils.sort(singleElementArray, true);
        System.out.println("Sort with single element array:" + isIntArrEquals(singleElementArray, singleElementArray));
    }

    private static int[] getNonSortedIntArray(){
        return new int[]{8, 1, 0, 7, 5, 2};
    }

    private static int[] getSortedUpIntArray(){
        return new int[]{0, 1, 2, 5, 7, 8};
    }
    private static int[] getSortedDownIntArray() {
        return new int[]{8, 7, 5, 2, 1, 0};
    }

    private static boolean isIntArrEquals(int[]a,int[]b){
        if (a == b){
            return true;
        }

        if (a.length != b.length){
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

}

