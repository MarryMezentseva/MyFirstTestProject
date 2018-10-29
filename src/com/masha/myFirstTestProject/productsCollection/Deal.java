package com.masha.myFirstTestProject.productsCollection;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Deal {
    private Date date = new Date();
    private Party seller;
    private Party buyer;
    private Map<Product, Integer> productsMap = new HashMap<>();

    public Deal(Party partySeller, Party partyBuyer, Map productsMap) {
        this.seller = seller;
        this.buyer = buyer;
        this.productsMap = productsMap;
    }

    public Deal(Party seller, Party buyer) {
        this.seller = seller;
        this.buyer = buyer;
    }

    public void addProduct(Product product, Integer quantity){
        productsMap.put(product, quantity);
    }

    public double getSum() {
        double rez = 0;
        for (Map.Entry<Product, Integer> entry : productsMap.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            double price = product.getPrice() * quantity;
            rez = rez + price;
        }
        return rez;
    }


    public Date getDate() {
        return date;
    }

    public Party getSeller() {
        return seller;
    }

    public void setSeller(Party seller) {
        this.seller = seller;
    }

    public Party getBuyer() {
        return buyer;
    }

    public void setBuyer(Party buyer) {
        this.buyer = buyer;
    }

    public Map<Product, Integer> getProductsMap() {
        return productsMap;
    }

    public void setProductsMap(Map<Product, Integer> productsMap) {
        this.productsMap = productsMap;
    }
}
