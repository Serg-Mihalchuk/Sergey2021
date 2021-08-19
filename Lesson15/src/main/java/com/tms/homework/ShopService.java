package com.tms.homework;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
public class ShopService implements Service {
    private final Shop shop;


    @Override
    public void addProduct(Product product) {
        shop.getProducts().add(product);

    }

    @Override
    public List<Product> getAllProducts() {
        return shop.getProducts();
    }

    @Override
    public void deleteProduct(int id) {
        try {
            Product product = findProductById(id);
            List<Product> productList = getAllProducts();
            productList.remove(product);
            System.out.println(product + " - deleted");

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void editProduct(Product product) {
        Product sourseProduct = findProductById(product.getId());
        sourseProduct.setName(product.getName());
        sourseProduct.setPrice(product.getPrice());


//        List<Product> productList = getAllProducts();


    }

    private Product findProductById(int id) {

        List<Product> productList = getAllProducts();
        return productList.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Product with id: " + id + " not found"));


    }

}
