package com.masha.myFirstTestProject.chapter16;

// Демонстрация ехес().
class ExecDemo {
    public static void main(String args[]) {
        Runtime r = Runtime.getRuntime();
                Process p = null;
        try {
            p = r.exec("notepad");
        } catch (Exception e) {
            System.out.println("Ошибка запуска notepad.");
        }
    }
}