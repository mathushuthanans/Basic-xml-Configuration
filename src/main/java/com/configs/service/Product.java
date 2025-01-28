package com.configs.service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private String id;
    
    private String Name;
    private int price;
    private int quantity;
    private String supplier;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getSupplier() {
        return supplier;
    }
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }  

    @Override
    public String toString() {
        return "Product [id=" + id + ", Name=" + Name + ", price=" + price + ", quantity=" + quantity + ", supplier="
                + supplier + "]";
    }

    

    
}
