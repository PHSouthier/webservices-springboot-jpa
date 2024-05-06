package com.phs.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phs.project.entities.OrderItem;
import com.phs.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
