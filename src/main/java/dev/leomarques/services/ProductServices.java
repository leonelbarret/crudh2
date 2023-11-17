package dev.leomarques.services;

import dev.leomarques.entities.Category;
import dev.leomarques.entities.Product;
import dev.leomarques.repository.CategoryRepository;
import dev.leomarques.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    ProductRepository repo;

    @GetMapping
    public List<Product> findAll(){
        return repo.findAll();
    }


    @GetMapping(value = "/{id}")
    public Product findById(Long id){
        Optional<Product> obj = repo.findById(id);
        return obj.get();

    }





}
