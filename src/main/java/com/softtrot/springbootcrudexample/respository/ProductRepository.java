package com.softtrot.springbootcrudexample.respository;

import com.softtrot.springbootcrudexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
