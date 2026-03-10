package com.wipro.hibernate.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    private int productId;
    private String productName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")   // FK column
    private Customer customer;

    public Product() {
        super();
    }

    public Product(int productId, String productName) {
        super();
        this.productId = productId;
        this.productName = productName;
    }

    public Product(int productId, String productName, Customer customer) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.customer = customer;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
