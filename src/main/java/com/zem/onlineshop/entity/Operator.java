package com.zem.onlineshop.entity;

import java.util.Date;

public class Operator extends User {

    private String operatorType;

    public Operator() {
    }

    public Operator(int id, String firstName, String lastName, Date birthDate, String phoneNumber, boolean phoneNumberVerified, String email, boolean emailVerified, String userType, String username, String password, String operatorType) {
        super(id, firstName, lastName, birthDate, phoneNumber, phoneNumberVerified, email, emailVerified, userType, username, password);
        this.operatorType = operatorType;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }
}
