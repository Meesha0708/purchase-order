package com.ecom.purchaseorder.purchaseorderservice.service;

import com.ecom.purchaseorder.purchaseorderservice.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<Product>(Arrays.asList(
          new Product(1,"Check print shirt","Sociosqu duis ...",1100,"Clothing"),
          new Product(2,"Sneakers","Sociosqu duis ...",2000,"Shoes"),
          new Product(3,"Desk Decor","Sociosqu duis ...",500,"Home"),
          new Product(4,"Pumps","Sociosqu duis ...",1170,"Heels"),
          new Product(5,"Duffle Bag","Sociosqu duis ...",1500,"Hangbags"),
          new Product(6,"Michael Kors","Sociosqu duis ...",3409,"Watches"),
          new Product(7,"Jimmy Choo","Sociosqu duis ...",5000,"Shoes"),
          new Product(8,"Cross top","Sociosqu duis ...",600,"Tops"),
          new Product(9,"Satchel","Sociosqu duis ...",2910,"Hangbags"),
          new Product(10,"Sport Shoes","Sociosqu duis ...",1800,"Shoes")
    ));

    public List<Product> getAllProducts() {
         return this.products;
    }

    public void addProduct(Product product) {
       Product prod = this.products.stream().max(Comparator.comparing(v -> v.getProductId())).get();
       product.setProductId(prod.getProductId()+1);
       this.products.add(product);
    }
}
