package com.wipro.hibernate.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

    @Id
    private int customerId;
    private String customerName;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Product> products = new HashSet<>();

    public Customer() {
        super();
    }

    public Customer(int customerId, String customerName) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Customer(int customerId, String customerName, Set<Product> products) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    // helper method (VERY IMPORTANT)
    public void addProduct(Product product) {
        product.setCustomer(this);
        products.add(product);
    }
}