package com.pluralsight.NorthwindTradersSpringBoot.model;

public class Product {
    private int productId;
    private String name;
    private int categoryId;
    private double price;

    public Product(int productId, int categoryId, double price, String name) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.price = price;
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
