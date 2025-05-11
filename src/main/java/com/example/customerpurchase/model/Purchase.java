package com.example.customerpurchase.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;
    private Double amount;
    private Date purchaseDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Purchase() {}

    public Long getId() { return id; }
    public String getProduct() { return product; }
    public Double getAmount() { return amount; }
    public Date getPurchaseDate() { return purchaseDate; }
    public Customer getCustomer() { return customer; }

    public void setId(Long id) { this.id = id; }
    public void setProduct(String product) { this.product = product; }
    public void setAmount(Double amount) { this.amount = amount; }
    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}

