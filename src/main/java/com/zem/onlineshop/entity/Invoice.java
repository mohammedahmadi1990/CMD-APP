package com.zem.onlineshop.entity;

import java.util.Date;
import java.util.List;

public class Invoice {

    private String id;
    private Date purchaseDate;
    private List<Product> products;
    private double weight;
    private double totalDiscount;
    private double totalCargo;
    private double totalPrice;
    private Customer customer;
    private Address address;
    private String status;
    private String localCargoReference;

    public Invoice() {
    }

    public Invoice(String id, Date purchaseDate, List<Product> products, double weight, double totalDiscount, double totalCargo, double totalPrice, Customer customer, Address address, String status, String localCargoReference) {
        this.id = id;
        this.purchaseDate = purchaseDate;
        this.products = products;
        this.weight = weight;
        this.totalDiscount = totalDiscount;
        this.totalCargo = totalCargo;
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.address = address;
        this.status = status;
        this.localCargoReference = localCargoReference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public double getCargo() {
        return totalCargo;
    }

    public void setCargo(double totalCargo) {
        this.totalCargo = totalCargo;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocalCargoReference() {
        return localCargoReference;
    }

    public void setLocalCargoReference(String localCargoReference) {
        this.localCargoReference = localCargoReference;
    }

    public double getTotalCargo() {
        return totalCargo;
    }

    public void setTotalCargo(double totalCargo) {
        this.totalCargo = totalCargo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
