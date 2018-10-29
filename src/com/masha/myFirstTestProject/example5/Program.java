package com.masha.myFirstTestProject.example5;

import java.util.Scanner;

public class Program {

    private static final int PRODUCTS_SIZE = 2;
    private static final int DEALS_SIZE = 1;

    private Scanner scan = new Scanner(System.in);

    private String keyboard() {
        String rez = scan.next();
        scan.reset();
        return rez;
    }

    private String keyboard(String msg) {
        System.out.println(msg + ": ");
        return keyboard();
    }

    public static void main(String[] args) {
        Program program = new Program();
        Deal[] deals = new Deal[DEALS_SIZE];
        for (int i = 0; i < deals.length; i++) {
            System.out.println("deal number " + (i+1));
            System.out.println("input buyer -> ");
            Party partyBuyer = program.initParty();

            System.out.println("input seller -> ");
            Party partySeller = program.initParty();

            Deal deal = new Deal(partySeller, partyBuyer, program.initProducts());
            deals[i] = deal;
        }

        program.printDeal(deals);

        // Arrays.stream(deals).forEach(deal -> System.out.println("check for deal " + deal.getSum()));
        program.closeScaner();
    }

    private void printDeal(Deal[] deals) {

        for (int i = 0; i < deals.length; i++) {
            System.out.println("Deal " + (i+1) + " " + deals[i].getDate());
            System.out.println("    " + deals[i].getBuyer().getName()
                    + " buys from " + deals[i].getSeller().getName());

            printProducts(deals[i].getProducts());
            System.out.println("check for deal: " + deals[i].getSum());
            System.out.println("----------------------------");
        }
    }

    private void printProducts(Product[] products){
        for (Product product : products) {
            System.out.println("        " + product.getTitle() + " "
                    + product.getQuantity() + " x " + product.getPrice()
                    + " = " + product.getCost());
        }
    }



    private Party initParty() {
        Party party = new Party();
        String name = keyboard("input party name");
        party.setName(name);
        return party;
    }

    private Product[] initProducts() {
        Product[] products = new Product[PRODUCTS_SIZE];
        for (int k = 0; k < products.length; k++) {
            String productTitle = keyboard("title product " + (k+1));
            double price = Double.parseDouble(keyboard("price for product " + (k+1)));
            int quantity = Integer.parseInt(keyboard("quantity for product " + (k+1)));


            Product product = new Product(productTitle, price, quantity);

            product.getCost();


            products[k] = product;
        }
        return products;
    }

    private void closeScaner() {
        this.scan.close();
    }


}

