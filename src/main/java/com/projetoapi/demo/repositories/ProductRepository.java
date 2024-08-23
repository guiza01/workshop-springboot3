package com.projetoapi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoapi.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
