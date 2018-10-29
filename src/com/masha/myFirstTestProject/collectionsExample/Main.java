package com.masha.myFirstTestProject.collectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

        public static void main(String[] args) {

            List<MyClass> list = new ArrayList<MyClass>();

            list.add(new MyClass("Василий"));
            list.add(new MyClass("Павел"));
            list.add(new MyClass("Андрей"));
            list.add(new MyClass("Андрей"));
            list.add(new MyClass("Петр"));
            list.add(new MyClass("Анжелика"));

            printCollection("Оригинал", list);

            // Смешивание
            Collections.shuffle(list);
            printCollection("Смешивание", list);

            // Обратный порядок
            Collections.reverse(list);
            printCollection("Обратный порядок", list);

            // "Проворачивание" на определенное количество
            Collections.rotate(list, 2); // Число может быть отрицательным - тогда порядок будет обратный
            printCollection("Проворачивание", list);

            // Обмен элементов
            Collections.swap(list, 0, list.size()-1);
            printCollection("Обмен элементов", list);

            // Замена
            Collections.replaceAll(list, new MyClass("Андрей"), new MyClass("Алексей"));
            printCollection("Замена", list);

            // Копирование - здесь обязательно надо иметь нужные размеры
            List<MyClass> list2 = new ArrayList<MyClass>(list.size());
            // Поэтому заполняем список. Хоть чем-нибудь.
            for(MyClass mc : list) {
                list2.add(null);
            }
            // Компируем из правого аргумента в левый
            Collections.copy(list2, list);
            printCollection("Копирование", list2);

            // Полная замена
            Collections.fill(list2, new MyClass("Антон"));
            printCollection("Полная замена", list2);

        }

        private static void printCollection(String title, List<MyClass> list) {
            System.out.println(title);
            for(MyClass mc : list) {
                System.out.println("Item:" + mc);
            }
            System.out.println();
        }

    }

