package com.cybertek.controller;


import com.cybertek.entity.Product;
import com.cybertek.servise.ProductService;
import jdk.nashorn.internal.runtime.Version;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getProuct(@PathVariable("id") long id) {


        return ResponseEntity.ok(productService.getProduct(id));
    }


    @RequestMapping
    public ResponseEntity<List<Product>> getProducts() {

        HttpHeaders responseHttpHeaders = new HttpHeaders();
        responseHttpHeaders.set("Version", "Cybertek.v1");
        responseHttpHeaders.set("Operation", "Get List");

        return ResponseEntity
                .ok()
                .headers(responseHttpHeaders)
                .body(productService.getProducts());
    }

    //crate Produuct

    @PostMapping
    public ResponseEntity<List<Product>>  crateProduct(@RequestBody Product product) {

         List <Product> set = productService.createProducts(product);

         return ResponseEntity
                 .status(HttpStatus.CREATED)
                 .header("Version","Cybertek.V1")
                 .header("Operation","Create")
                 .body(set);
    }

    //Delete Procduct

    @DeleteMapping(value = "/{id}")
    public List<Product> deleteProduct(@PathVariable("id") long id) {

        return productService.delete(id);
    }


    // update Product
    @PutMapping(value = "/{id}")
    public ResponseEntity<List<Product>> updateProduct(@PathVariable("id") long id, @RequestBody Product product) {

        MultiValueMap<String,String> map = new LinkedMultiValueMap<>();

        map.add("Version", "Cybertek.v1");
        map.add("operation","Update");



        List <Product> list =  productService.updateProducts(id, product);

        return new ResponseEntity<>(list,map,HttpStatus.OK);
    }

}
