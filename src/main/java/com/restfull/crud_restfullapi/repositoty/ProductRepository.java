package com.restfull.crud_restfullapi.repositoty;

import com.restfull.crud_restfullapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository  extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
