package com.zem.onlineshop.entity;

import java.util.Date;
import java.util.List;

public class Customer extends User {

    private String customerType;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, Date birthDate, String phoneNumber, boolean phoneNumberVerified, String email, boolean emailVerified, String username, String password, String customerType) {
        super(id, firstName, lastName, birthDate, phoneNumber, phoneNumberVerified, email, emailVerified, username, password);
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

}
