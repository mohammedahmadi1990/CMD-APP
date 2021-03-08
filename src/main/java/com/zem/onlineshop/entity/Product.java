package com.zem.onlineshop.entity;

public class Product {

    private int id;
    private String name;
    private String link;
    private String website;
    private double priceTL;
    private double priceRial;
    private double priceDollar;
    private double weight;
    private double cargoPrice;
    private String productType;


    public Product() {
    }

    public Product(int id, String name, String link, String website, double priceTL, double priceRial, double priceDollar, double weight, double cargoPrice, String productType) {
        this.id = id;
        this.name = name;
        this.link = link;
        this.website = website;
        this.priceTL = priceTL;
        this.priceRial = priceRial;
        this.priceDollar = priceDollar;
        this.weight = weight;
        this.cargoPrice = cargoPrice;
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public String getWebsite() {
        return website;
    }

    public double getPriceTL() {
        return priceTL;
    }

    public double getPriceRial() {
        return priceRial;
    }

    public double getPriceDollar() {
        return priceDollar;
    }

    public double getWeight() {
        return weight;
    }

    public double getCargoPrice() {
        return cargoPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setPriceTL(double priceTL) {
        this.priceTL = priceTL;
    }

    public void setPriceRial(double priceRial) {
        this.priceRial = priceRial;
    }

    public void setPriceDollar(double priceDollar) {
        this.priceDollar = priceDollar;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCargoPrice(double cargoPrice) {
        this.cargoPrice = cargoPrice;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
