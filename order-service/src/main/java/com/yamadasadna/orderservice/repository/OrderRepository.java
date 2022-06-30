package com.yamadasadna.orderservice.repository;

import com.yamadasadna.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
