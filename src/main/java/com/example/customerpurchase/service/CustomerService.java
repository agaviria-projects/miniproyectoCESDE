package com.example.customerpurchase.service;

import com.example.customerpurchase.model.Customer;
import com.example.customerpurchase.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> listAll() {
        return repository.findAll();
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
