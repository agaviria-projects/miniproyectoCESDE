package com.example.customerpurchase.repository;

import com.example.customerpurchase.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

