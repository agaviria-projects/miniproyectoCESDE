package com.example.customerpurchase.repository;

import com.example.customerpurchase.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
