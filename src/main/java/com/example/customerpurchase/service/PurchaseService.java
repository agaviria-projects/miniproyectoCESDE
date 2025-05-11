package com.example.customerpurchase.service;

import com.example.customerpurchase.model.Purchase;
import com.example.customerpurchase.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository repository;

    public List<Purchase> listAll() {
        return repository.findAll();
    }

    public Purchase save(Purchase purchase) {
        return repository.save(purchase);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
