package com.cybertek.controller;


import com.cybertek.entity.Product;
import com.cybertek.servise.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Product getProuct(@PathVariable("id") long id) {

        return productService.getProduct(id);
    }


    @RequestMapping(value = "/products")
    public @ResponseBody
    List<Product> getProducts() {

        return productService.getProducts();
    }

    //crate Produuct

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public @ResponseBody
    List<Product> crateProduct(@RequestBody Product product) {

        return productService.createProducts(product);
    }

    //Delete Procduct

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    List<Product> deleteProduct(@PathVariable("id") long id) {

        return productService.delete(id);
    }


    // update Product
    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public @ResponseBody
    List<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product) {

        productService.updateProducts(id, product);

        return productService.updateProducts(id, product);
    }

}
