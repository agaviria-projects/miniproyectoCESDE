package com.example.customerpurchase.controller;

import com.example.customerpurchase.model.Purchase;
import com.example.customerpurchase.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService service;

    @GetMapping
    public List<Purchase> listAll() {
        return service.listAll();
    }

    @PostMapping
    public Purchase save(@RequestBody Purchase purchase) {
        return service.save(purchase);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
