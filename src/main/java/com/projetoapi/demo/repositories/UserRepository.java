package com.projetoapi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoapi.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
