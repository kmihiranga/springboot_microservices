package com.techwizlanka.orderservice.repository;

import com.techwizlanka.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
