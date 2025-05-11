package com.example.customerpurchase.controller;

import com.example.customerpurchase.model.Customer;
import com.example.customerpurchase.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> listAll() {
        return service.listAll();
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return service.save(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
