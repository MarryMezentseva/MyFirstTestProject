package com.masha.myFirstTestProject.stringExample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {
        String s1 = "123ertyu";
        String s2 = "qwe" + "fghfg";
        String s3 = new String(); // String s3 = "";
        String s4 = new String("sghsgb");

        String s5 = "Masha";
        String s6 = "Masha";
        System.out.println(s5 == s6);

        String s7 = new String("Masha");
        String s8 = new String("Masha");
        System.out.println(s7 == s8);
        System.out.println(s7.equals(s8));

        char[] chars = {'q','w','e'};
        String s9 = new String(chars);

        System.out.println("------------methods---------------");
        String s10 = "Yura and3 Masha are 3going to 5Maldivy";
        boolean isContains = s10.contains("Masha");
        System.out.println(isContains);
        System.out.println(s10.length());
        System.out.println(s10.charAt(12));
        System.out.println(s10.codePointBefore(4));

        String s11 = "Yura";
        String s12 = "yuRa";
        System.out.println("compareTo " +  s11.compareTo(s12));
        System.out.println("compareToIgnoreCase " +  s11.compareToIgnoreCase(s12));
        System.out.println("equalsIgnoreCase " +  s11.equalsIgnoreCase(s12));
        System.out.println("equals " +  s11.equals(s12));
        System.out.println("---------------------------");

        String s13 = "Yura" + " and Masha " + "are going " + " to Maldivy";
        String s14 = "Yura"
                .concat(" and Masha ")
                .concat("are going ")
                .concat(" to Maldivy");

        boolean isEndWith = s10.endsWith("divy");
        System.out.println("isEndWith " + isEndWith);

        boolean startWith = s10.startsWith("Yura");
        System.out.println("startWith " + startWith);

        int i = s10.indexOf('M');
        System.out.println(i);

        String s15 = "    111222 fhnhn     ".trim();
        System.out.println("    111222 fhnhn     ");
        System.out.println(s15);

        boolean isEmpty = "".isEmpty();
        System.out.println("isEmpty " +isEmpty);

        boolean isMatches = s10.matches("^\\D+");
        System.out.println("isMatches " + isMatches);

        String[] strArr = s10.split(" ");
        Arrays.stream(strArr).forEach(System.out::println);

        char[] chars1 = s10.toCharArray();

        String s17 = s10.substring(3);
        String s18 = s10.substring(3,20);

        System.out.println(s10.toUpperCase());
        System.out.println(s10.toLowerCase());

        System.out.println(s10.replace("a","#"));
        System.out.println(s10.replaceAll("\\d","#"));

        String.valueOf(1);
        String.valueOf(5.4f);

        String s19 = "There is some digit %s, and here is another one %d";
        String result = String.format(s19, 12, 44);
        System.out.println(result);

        System.out.println(String.join("@", "yura", "masha", "fisha"));

        s10.lastIndexOf('M');
        s10.lastIndexOf("Masha");
        byte[] bytes = s10.getBytes();
        String ss = s10.intern();

    }
}
