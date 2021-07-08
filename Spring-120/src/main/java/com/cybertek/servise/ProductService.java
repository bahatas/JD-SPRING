package com.cybertek.servise;

import com.cybertek.entity.Product;

import java.util.List;

public interface ProductService {


    List<Product> getProducts();
    List<Product> delete(long id);
    List<Product> createProducts(Product product);
    List<Product> updateProducts(long id,Product product);
    Product getProduct(long id);



}
