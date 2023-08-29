package com.restfull.crud_restfullapi.controller;

import com.restfull.crud_restfullapi.entity.Product;
import com.restfull.crud_restfullapi.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(List<Product> products){
        return (List<Product>) service.saveProducts(products);
    }

    @GetMapping("/products")
    public  List<Product>  findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findAllProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public  Product  findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

}
