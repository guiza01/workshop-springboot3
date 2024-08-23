package com.projetoapi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoapi.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	
}
