package com.zem.onlineshop.entity;

import java.util.Date;

public class Purchase {

    private int id;
    private Customer customer;
    private String fiatType;
    private double fiat;
    private Invoice invoice;
    private Date date;

    public Purchase() {
    }

    public Purchase(int id, Customer customer, String fiatType, double fiat, Invoice invoice, Date date) {
        this.id = id;
        this.customer = customer;
        this.fiatType = fiatType;
        this.fiat = fiat;
        this.invoice = invoice;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
