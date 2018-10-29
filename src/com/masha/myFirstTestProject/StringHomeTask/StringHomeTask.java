package com.masha.myFirstTestProject.StringHomeTask;

import java.util.Arrays;

public class StringHomeTask {
    public static void main(String[] args) {
        String s = "Fisha is my #dog and he likes #walking and #sleeping and #eating very #much";
        String[] strArr = s.split(" ");
        String[] strArrHash = new String[0];

        for (int i = 0; i < strArr.length; i++) {
            String word = strArr[i];

            if (isHashWord(word)){
                strArrHash = Arrays.copyOf(strArrHash, strArrHash.length + 1);
                strArrHash[strArrHash.length - 1] = word;
            }
        }

        //System.out.println(Arrays.toString(strArr));

        for (int k = 0; k < strArrHash.length; k++){
            System.out.println(strArrHash[k]);
        }

    }

    public static boolean isHashWord(String word) {
        if (word == null){
            return false;
        }
        return word.charAt(0) == '#';
    }



}
