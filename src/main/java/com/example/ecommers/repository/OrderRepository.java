package com.example.ecommers.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommers.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
}
