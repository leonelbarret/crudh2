package dev.leomarques.repository;

import dev.leomarques.entities.Category;
import dev.leomarques.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
