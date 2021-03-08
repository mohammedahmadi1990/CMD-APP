package com.zem.onlineshop.entity;

import java.util.Date;
import java.util.List;

public class Customer extends User {

    private String customerType;
    private List<Invoice> invoices;
    private Cart cart;
    private List<Purchase> purchases;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, Date birthDate, String phoneNumber, boolean phoneNumberVerified, String email, boolean emailVerified, String userType, String username, String password, String customerType, List<Invoice> invoices, Cart cart, List<Purchase> purchases) {
        super(id, firstName, lastName, birthDate, phoneNumber, phoneNumberVerified, email, emailVerified, userType, username, password);
        this.customerType = customerType;
        this.invoices = invoices;
        this.cart = cart;
        this.purchases = purchases;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }
}
