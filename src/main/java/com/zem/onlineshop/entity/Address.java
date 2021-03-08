package com.zem.onlineshop.entity;

public class Address {

    private int id;
    private User user;
    private String country;
    private String state;
    private String city;
    private String addressDetail;
    private String postalCode;


    public Address() {
    }

    public Address(int id, User user, String country, String state, String city, String addressDetail, String postalCode) {
        this.id = id;
        this.user = user;
        this.country = country;
        this.state = state;
        this.city = city;
        this.addressDetail = addressDetail;
        this.postalCode = postalCode;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
