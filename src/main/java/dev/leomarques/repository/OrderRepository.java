package dev.leomarques.repository;

import dev.leomarques.entities.Order;
import dev.leomarques.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
