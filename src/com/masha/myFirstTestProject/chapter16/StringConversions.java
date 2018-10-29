package com.masha.myFirstTestProject.chapter16;

// Преобразует целое в бинарный, шестнадцатеричный и восьмеричный формат

public class StringConversions {
    public static void main(String args[]) {
        int num = 19648;

        System.out.println(num + " in binary: " +
                Integer.toBinaryString(num));

        System.out.println(num + " in octal: " +
                Integer.toOctalString(num));

        System.out.println(num + " in hexadecimal: " +
                Integer.toHexString(num));
    }
}
