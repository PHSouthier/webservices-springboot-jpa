package com.phs.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phs.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
