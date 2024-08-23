package com.projetoapi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoapi.demo.entities.OrderItem;
import com.projetoapi.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
