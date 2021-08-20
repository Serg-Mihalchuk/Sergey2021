package com.tms.homework;

public class MainShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Service service = new ShopService(shop);

        System.out.println("Null" + service.getAllProducts());

        Product product1 = new Product(123, "pr1", 10);
        Product product2 = new Product(234, "pr2", 100);
        Product product3 = new Product(45, "pr3", 150);


        service.addProduct(product1);
        service.addProduct(product2);
        service.addProduct(product3);

        System.out.println("Add some product " + service.getAllProducts());
        service.deleteProduct(45);
        service.deleteProduct(15);
        System.out.println("After deleted " + service.getAllProducts());

        service.editProduct(product1);


    }
}
