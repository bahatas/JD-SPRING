package com.cybertek.controller;


import com.cybertek.entity.Product;
import com.cybertek.servise.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping(value = "/{id}")
    public Product getProuct(@PathVariable("id") long id) {

        return productService.getProduct(id);
    }


    @RequestMapping
    public List<Product> getProducts() {

        return productService.getProducts();
    }

    //crate Produuct

    @PostMapping
    public List<Product> crateProduct(@RequestBody Product product) {

        return productService.createProducts(product);
    }

    //Delete Procduct

    @DeleteMapping(value = "/{id}")
    public List<Product> deleteProduct(@PathVariable("id") long id) {

        return productService.delete(id);
    }


    // update Product
    @PutMapping(value = "/{id}")
    public @ResponseBody
    List<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product) {

        productService.updateProducts(id, product);

        return productService.updateProducts(id, product);
    }

}
