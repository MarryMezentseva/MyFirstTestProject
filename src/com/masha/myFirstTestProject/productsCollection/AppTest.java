package com.masha.myFirstTestProject.productsCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppTest {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("apple", 20.5));
        productsList.add(new Product("tomato", 20.0));
        productsList.add(new Product("apricot", 10.5));

        productsList.add(0, new Product("jhdf",777));

        //productsList.add(15, new Product("jhdf",777));

        productsList.remove(2);

        for(Product pr : productsList){
            System.out.println(pr.getTitle());
        }

        for(int i = 0; i < productsList.size(); i++){
            System.out.println(productsList.get(i).getTitle());
        }
        System.out.println("----------------------------------------------");

        Map<Integer,Product> productMap = new HashMap<>();
        productMap.put(1,new Product("apple", 20.5));
        productMap.put(22,new Product("tomato", 20.0));
        productMap.put(107,new Product("apricot", 10.5));

        Product p1 = productMap.get(22);
        Product p2 = productMap.get(107);
        Product p3 = productMap.get(300);




        printMap(productMap);
        productMap.put(107, new Product("fotocamera", 100.0));
        System.out.println("----------------------------------------------");
        printMap(productMap);

        boolean isPresent = productMap.containsKey(107);

        System.out.println();
    }

    public static void printMap(Map<Integer, Product> productMap){
        for (Map.Entry<Integer, Product> entry : productMap.entrySet() ){
            Integer key = entry.getKey();
            Product value = entry.getValue();
            System.out.println("key: " + key + " value: " + value.getTitle() + ": " + value.getPrice());
        }

    }
}
