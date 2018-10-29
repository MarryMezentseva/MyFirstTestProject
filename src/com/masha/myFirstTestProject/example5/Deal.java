package com.masha.myFirstTestProject.example5;

import java.util.Date;

public class Deal {
    private Date date = new Date();
    private Party seller;
    private Party buyer;
    private Product[] products;

    public Deal(Party seller, Party buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public Deal() {
    }

    public double getSum(){
        double rez= 0;
        for (Product pr: products){
            rez += pr.getCost();
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

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


}

