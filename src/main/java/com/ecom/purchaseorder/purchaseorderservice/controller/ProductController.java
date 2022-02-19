package com.ecom.purchaseorder.purchaseorderservice.controller;

import com.ecom.purchaseorder.purchaseorderservice.entity.Product;
import com.ecom.purchaseorder.purchaseorderservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-catalog")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/welcome")
    public String index() {
        return "<h1>Welcome to Product Catalog API!</h1>";
    }

    @GetMapping("/products")
    List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/addProduct")
    void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
}
