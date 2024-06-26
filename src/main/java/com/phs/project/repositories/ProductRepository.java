package com.phs.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phs.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
