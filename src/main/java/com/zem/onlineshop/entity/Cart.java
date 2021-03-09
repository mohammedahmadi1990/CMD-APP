package com.zem.onlineshop.entity;

import java.util.List;

public class Cart {

    private String id;
    private List<Product> products;
    private double totalWeight;
    private double totalDiscount;
    private double totalCargo;
    private double totalPrice;
    private User user;

    public Cart() {
    }

    public Cart(String id, List<Product> products, double totalWeight, double totalDiscount, double totalCargo, double totalPrice, User user) {
        this.id = id;
        this.products = products;
        this.totalWeight = totalWeight;
        this.totalDiscount = totalDiscount;
        this.totalCargo = totalCargo;
        this.totalPrice = totalPrice;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public double getTotalCargo() {
        return totalCargo;
    }

    public void setTotalCargo(double totalCargo) {
        this.totalCargo = totalCargo;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
