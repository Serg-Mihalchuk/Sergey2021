package com.tms.homework;

import java.util.List;

public interface Service {
    // добавить товар(принимает объект товара и добавляет его в список товаров).
// При попытке добавить товар с id уже существующем в списке, вставка производится не должна
    void addProduct(Product product);


    //получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в  магазине)
    List<Product> getAllProducts();


    //удалить товар (метод принимает id товара и удаляет из списка товар с соответствующим id)
    void deleteProduct(int id);


    //редактировать товар(принимает объект товара и редактирует им список товаров)
    void editProduct(Product product);

}
