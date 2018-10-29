package com.masha.myFirstTestProject.collectionsExample;

import com.masha.myFirstTestProject.genericsExample.types.Dog;

import java.util.*;

public class CollectionsApp {


    public static void main(String[] args) {

        String[] strArr = {"Masha","loves","Yura","very mach!"};
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        List<String> list = new ArrayList<>();
        list.add("Masha");
        list.add("loves");
        list.add("Yura");
        list.add("0very mach!");
        list.add("1very mach!");
        list.add("2very mach!");
        list.add("3very mach!");

        //list.add(new Dog());
        //list.add(new Date());
        list.remove("Masha");
        list.remove(0);
        boolean isEmpty = list.isEmpty();
        boolean con = list.contains("Yura");
        String s = list.get(0);
        int size = list.size();
        Object[] arr =  list.toArray();
        List<String> stringList = list.subList(1,3);
        ((ArrayList<String>) list).trimToSize();

        for (int i = 0; i < list.size(); i++){
            list.get(i);
        }

        for (String str: list) {
            System.out.println(str);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next(); // must be called before you can call i.remove()
            // Do something
            if ("Yura".equals(str)) {
                iterator.remove();
            }
        }

        System.out.println("----------------------------------------------");
        Set<String> set = new HashSet<>();
        String s1 = new String("qqq");
        String s2 = new String("qqq");
        String s3 = new String("qqq");
        set.add("Masha");
        set.add("loves");
        set.add("Yura");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add("very mach!");
        set.add("very mach!");
        set.add("very mach!");
        set.add("very mach!");

        System.out.println("----------------------------------------------");
        Set<Character> characterSet = new TreeSet<>();
        characterSet.add('C');
        characterSet.add('A');
        characterSet.add('R');
        characterSet.add('B');
        characterSet.add('2');
        characterSet.add('D');

        //1
        //Comparator<Dog> dogComparator = new DogComparator();

        //2
//        Comparator<Dog> dogComparator = new Comparator<Dog>() {
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o1.getName().compareToIgnoreCase(o2.getName());
//            }
//        };

        //3
//        Set<Dog> dogSet = new TreeSet<>(new Comparator<Dog>() {
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o1.getName().compareToIgnoreCase(o2.getName());
//            }
//        });

        //4
        Set<Dog> dogSet = new TreeSet<>((o1,o2) -> o1.getName().compareToIgnoreCase(o2.getName()));

        Dog d1 = new Dog("Fisha",4);
        Dog d2 = new Dog("aaa", 4);
        Dog d3 = new Dog("eee", 5);
        Dog d4 = new Dog("fff", 2);
        Dog d6 = new Dog("fff", 1);
        Dog d7 = new Dog("fff", 2);

        dogSet.add(d1);
        dogSet.add(d2);
        dogSet.add(d3);
        dogSet.add(d4);
        dogSet.add(d6);
        dogSet.add(d7);

        System.out.println("/----------------------------------------------");
        Queue<String> queue = new LinkedList<>();
        queue.add("asd1");
        queue.add("asd2");
        queue.add("as3");
        queue.add("asd4");
        queue.peek();

        String ssss = queue.poll();
        ssss = queue.peek();
        ssss = queue.poll();
        ssss = queue.poll();
        ssss = queue.poll();

        Deque<String> deque = new LinkedList<>();
        deque.add("asd1");
        deque.add("asd2");
        deque.add("as3");
        deque.add("asd4");

        deque.peek();
        deque.peekFirst();
        deque.peekLast();

        deque.poll();
        deque.pollFirst();
        deque.pollLast();

        System.out.println("/------------------Map--------------------");
        Map<String, Dog> dogMap = new HashMap<>();
        Dog dddF = new Dog("Fisha", 4);
        dogMap.put("aaa", dddF);
        dogMap.put("bbb", new Dog("aaa", 44));
        dogMap.put("ccc", new Dog("ss", 45));
        dogMap.put("aad", new Dog("bbb", 47));
        dogMap.put("aaa", new Dog("Fisha", 33333));

        Collection<Dog> values = dogMap.values();
        dogMap.containsKey("aaa");
        boolean isContainsDddF  = dogMap.containsValue(new Dog("Fisha", 4));

        for (Map.Entry<String,Dog> entry: dogMap.entrySet()){
            String key = entry.getKey();
            Dog value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        Dog dog = dogMap.get("aaa");

        Map<String, Dog> m = new TreeMap<>();
        m.put("aaa", dddF);
        m.put("eee", new Dog("aaa", 44));
        m.put("bbb", new Dog("ss", 45));
        m.put("ccc", new Dog("bbb", 47));
        m.put("aaa", new Dog("Fisha", 33333));

        System.out.println();

    }
}
