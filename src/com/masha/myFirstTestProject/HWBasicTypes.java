package com.masha.myFirstTestProject;

public class HWBasicTypes {
    static int anInt = 7;
    static long l = 3L;
    static short sh = 2;
    static float f = 0.4f;
    static double d = 0.7d;
    static boolean b = false;
    static byte bb = 8;
    static char c = 'A';

    static String s = "Hello";
    static Integer iOb = 5;
    static Long lOb = 6L;
    static Short shOb = 4;
    static Float fOb = 0.2f;
    static Double dOb = 0.3d;
    static Boolean bOb = false;
    static Byte bbOb = 16;
    static Character cOb = 'B';


    static long lArr = 3L;
    static short shArr = 2;
    static float fArr = 0.4f;
    static double dArr = 0.7d;
    static boolean bArr = false;
    static byte bbArr = 8;
    static char cArr = 'A';

    static int[] iArr = {1, 4, 5, 7};
    static int iArr2[] = {1, 4, 5, 7, 3};
    static int[] iArr3 = new int[4];
    static int[][] iArr4 = new int[3][3];
    static int[][] i2dArray = {{1, 2, 3}, {5, 6, 8}};
    static double[] dArray = {0.1, 0.2, 0.3, 0.4};
    static char[] cArray = {'a', '2', 'g', 'j'};
    static char[][] c2dArray = {{'Y', 'U'}, {'R', 'I'}};
    static String[] sArray = {"Masha like", "Fisha", "woof-woof)"};

    //home task_overloading
    public static void print(int i) {
        System.out.println(i);
    }

    public static void print(double d) {
        System.out.println(d);
    }

    public static void print(short sh) {
        System.out.println(sh);
    }

    public static void print(byte b) {
        System.out.println(b);
    }

    public static void print(char c) {
        System.out.println(c);
    }

    public static void print(boolean b) {
        System.out.println(b);
    }

    public static void print() {
        System.out.println();
    }

    public static void print(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + " ");
        }
    }

    public static void print(long l) {
        System.out.println(l);
    }

    public static void print(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void print(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int k = 0; k < ints[i].length; k++) {
                System.out.print(ints[i][k]);
            }
            System.out.println();
        }
    }

    public static void print(double[] doubles) {
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
    }

    public static void print(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    public static void print(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int k = 0; k < chars[i].length; k++) {
                System.out.print(chars[i][k]);
            }
            System.out.println();
        }
    }

    public static void doubleArrayExpl() {
        double[] dArr = new double[4];
        dArr[0] = 0.1;
        dArr[1] = 0.3;
        dArr[2] = 0.5;
        dArr[3] = 0.7;
        print(dArr[0]);
        print(dArr[1]);
        print(dArr[2]);
        print(dArr[3]);

        print(dArr);
    }


    public static void charArrayExmpl() {

        char[] cArr2 = new char[5];

    }


    public static void main(String[] args) {
        print(iArr);
        print(dArray);
        print(cArray);
        print(i2dArray);
        print(c2dArray);
        print("hhhhh", "oooooooooo", "dddddddd");
        print(sArray);

        bb = (byte) (125 + 6);
        print(bb);


        double res1 = (double) (anInt) / 3;
        print(res1);

        Double res2 = (double) (anInt) / 3;
        print(res2);

        print(c);
        c = 65;
        print(c);
        char c2 = '\u0041';
        print(c2);

        int i2 = 0b101; //5
        int i3 = 0xA; //10
        print(i2 == 5);
        print(i3 == 10);

        s = "erfe";
        s = s + "dfvsdfv";

        s = "111" + " adress";

        //arrays
        print("///////////////////////////////////////////////////////////////");
        print(iArr);

        print("///////////////////////////////////////////////////////////////");
        print(i2dArray);

        print("///////////////////arr3////////////////////////////////////////////");
        for (int i = 0; i < iArr3.length; i++) {
            iArr3[i] = 666;
        }

        print(iArr3);
        //add double, char, string examples
        doubleArrayExpl();
        charArrayExmpl();


        //this is a comment

        /*this is a comment*/

        /*
         * this is a comment too
         */
        char[] cArr1 = {'A', 'B', 'C', 'D'};
        print(cArr1);

        char[][] cArr4 = {{'y', 'U'}, {'R', 'I'}};
        print(cArr4);

        char[][] cArr3 = new char[2][2];
        cArr3[0][0] = 'M';
        cArr3[0][1] = 'N';
        cArr3[1][0] = 'T';
        cArr3[1][1] = 'P';

        print(cArr3);

        //overloading one more time
        print(12);
        print("ffgdgd");
        print();
        print("1asdfasf", "dfbsdfvb", "adfbadbb");
        print("sdbv", "sdb");
        print(4);

        print("////////////////////hometask2/////////");
        int[] ints = {70,15,4,388,20,67};
        int indexOfMax = 0;
        for (int i = 1; i < ints.length; i++){
            if(ints[i] > ints[indexOfMax]){
                indexOfMax = i;
            }
        }
        print(indexOfMax + " ");




        int index = 0;
        for (int i = 0; i < ints.length - 1; i++){
            if(ints[i+1] > ints[index]){
                index = i+1;
            }
        }
        print(index);


    }




}



