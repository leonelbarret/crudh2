package dev.leomarques.repository;

import dev.leomarques.entities.Category;
import dev.leomarques.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
