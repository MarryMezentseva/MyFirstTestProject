package com.masha.myFirstTestProject.productsCollection;

import java.util.*;

public class Program {

    private final List<Product> products = new LinkedList<>();
    private final Collection<Deal> deals = new LinkedList<>();

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Program program = new Program();
        System.out.println("Formalization deal");

        System.out.println("Init products ");
        boolean isNeedToContinue = true;
        do {
            program.addProduct();
            System.out.println("Do you want to continue adding products?");
            String choice = program.keyboard("Yes - y, No - n");
            if(choice.equals("y")){
               isNeedToContinue = true;
               }
            else {
                isNeedToContinue = false;
            }
        }
        while(isNeedToContinue);
        //--------------------------------------------







        boolean isNeedToAddOneMoreDeal = true;
        do {
            program.addDeal();
            System.out.println("Do you want to continue adding deals?");
            String choice = program.keyboard("Yes - y, No - n");
            if(choice.equals("y")){
               isNeedToAddOneMoreDeal = true;
               }
            else {
                isNeedToAddOneMoreDeal = false;
            }
        }
        while(isNeedToAddOneMoreDeal);

    }

    private String keyboard() {
        String rez = scan.next();
        scan.reset();
        return rez;
    }

    private String keyboard(String msg) {
        System.out.println(msg + ": ");
        return keyboard();
    }

    public void addProduct(){
        String title = keyboard("Input title");
        double price = Double.parseDouble(keyboard("Input price"));
        Product product = new Product(title, price);
        this.products.add(product);
    }

    private Party initParty() {
            Party party = new Party();
            String name = keyboard("input party name");
            party.setName(name);
            return party;
    }
     public void addDeal(){
         for (Deal deal: deals) {
             System.out.println("deal number " );
             System.out.println("input buyer -> ");
             Party partyBuyer = initParty();

             System.out.println("input seller -> ");
             Party partySeller = initParty();

             deal = new Deal(partySeller, partyBuyer);
             System.out.println();
         }
     }

    private void printDeal() {
        for (Deal deal : deals) {
            System.out.println("Deal " + deal.getDate());
            System.out.println("    " + deal.getBuyer().getName()
                    + " buys from " + deal.getSeller().getName());
            System.out.println("List of products" + deal.getProductsMap());

            System.out.println("Sum: " + deal.getSum());
            System.out.println("----------------------------");
        }
    }

    public List<Product> getProducts() {
        return products;
    }
    public Collection<Deal> getDeals(){
        return deals;
    }

       private void printProducts(){
        for (Product product : products) {
            System.out.println("        " + product.getTitle() + " "
                    + product.getPrice() );
        }
    }


    private void closeScaner() {
        this.scan.close();
    }
}

