package com.phs.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phs.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
