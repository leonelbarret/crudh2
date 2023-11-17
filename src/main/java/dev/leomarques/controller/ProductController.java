package dev.leomarques.controller;

import dev.leomarques.entities.Category;
import dev.leomarques.entities.Product;
import dev.leomarques.services.CategoryServices;
import dev.leomarques.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductServices serv;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product product = serv.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
