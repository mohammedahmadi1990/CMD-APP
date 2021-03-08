package com.zem.onlineshop.entity;

public class Purchase {

    private int id;
    private User user;
    private String fiatType;
    private double fiat;
    private Invoice invoice;

    public Purchase() {
    }

    public Purchase(int id, User user, String fiatType, double fiat, Invoice invoice) {
        this.id = id;
        this.user = user;
        this.fiatType = fiatType;
        this.fiat = fiat;
        this.invoice = invoice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFiatType() {
        return fiatType;
    }

    public void setFiatType(String fiatType) {
        this.fiatType = fiatType;
    }

    public double getFiat() {
        return fiat;
    }

    public void setFiat(double fiat) {
        this.fiat = fiat;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
