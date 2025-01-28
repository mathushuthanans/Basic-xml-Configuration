package com.configs.service;

import java.util.Scanner;

import com.configs.repo.Hib;


public class Register {
    private Product product;
    private Hib hib;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void addDetails(Scanner sc){
        System.out.print("Product: ");
        product.setName(sc.nextLine());

        System.out.print("Product Id: ");
        product.setId(sc.nextLine());

        System.out.print("Price: ");
        product.setPrice(sc.nextInt());
        sc.nextLine();

        System.out.print("Quantity: ");
        product.setQuantity(sc.nextInt());
        sc.nextLine();

        System.out.print("Supplier: ");
        product.setSupplier(sc.nextLine());

        hib.save(product);
    }

    @Override
    public String toString() {
        return product.toString();
    }

    public Hib getHib() {
        return hib;
    }

    public void setHib(Hib hib) {
        this.hib = hib;
    }
    
}
