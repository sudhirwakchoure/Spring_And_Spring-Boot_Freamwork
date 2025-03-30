package com.core.springaop.services;

import org.springframework.stereotype.Service;

@Service
public class ProductService {



    public void createProduct() {
        System.out.println("Creating product");
        System.out.println("Product created");
    }

    public void getProduct() {
        System.out.println("getProduct");
        System.out.println("Product get");
    }

    public void searchProduct() {
        System.out.println("searchProduct");
        System.out.println("Product search");
    }

}
