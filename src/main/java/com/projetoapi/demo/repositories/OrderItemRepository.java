package com.projetoapi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoapi.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
