package com.practise.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity

public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;


    @OneToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name = "productdetails_id" , referencedColumnName = "id")

    private ProductDetails productDetails;




    public ProductDetails getProductDetails() {
        return productDetails;
    }
    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Producta [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
                + ", manufacturer=" + manufacturer + "]";
    }     
    
    

}
