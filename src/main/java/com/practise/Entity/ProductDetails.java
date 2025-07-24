package com.practise.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String  warrantyPeriod;
    private int productNumber;


    @OneToOne(mappedBy = "productDetails")
    private Products products;
    
    public Products getProducts() {
        return products;
    }
    public void setProducts(Products products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public int getProductNumber() {
        return productNumber;
    }
    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }



    @Override
    public String toString() {
        return "ProductDetails [id=" + id + ", warrantyPeriod=" + warrantyPeriod + ", productNumber=" + productNumber
                + ", products=" + products + "]";
    }


    
}
