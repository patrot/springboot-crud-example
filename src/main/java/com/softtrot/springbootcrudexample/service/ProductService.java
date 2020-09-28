package com.softtrot.springbootcrudexample.service;

import com.softtrot.springbootcrudexample.model.Product;
import com.softtrot.springbootcrudexample.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
//        List<Product> products = Arrays.asList(
//                new Product(1, "Toaster", "Basic Toaster model")
//        );
//        return products;
        return productRepository.findAll();
    }
}
