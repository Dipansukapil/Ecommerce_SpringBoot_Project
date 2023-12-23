package com.example.ecommers.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommers.models.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, UUID> {
}
