package com.masha.myFirstTestProject.shieldtBook.inheritance.example1;

public class Runner {
    public static void main(String[] args) {


        String productType = args[0];
        String action = args[1];

        Product product;

        switch (productType){
            case "viber":
                product = new ViberProduct();
                break;
            case "skype":
                product = new SkypeProduct();
                break;
            default:
                throw new RuntimeException("Can't find product with name: " + productType);
        }

        switch (action){
            case "install":
                product.install();
                break;
            case "uninstall":
                product.unInstall();
                break;
            case "upgrade":
                product.upgrade();
            break;
             default:
                 throw new RuntimeException("Can't find action with type: " + action);
        }


    }
}
