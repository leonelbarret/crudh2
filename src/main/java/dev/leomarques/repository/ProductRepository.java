package dev.leomarques.repository;

import dev.leomarques.entities.Category;
import dev.leomarques.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
