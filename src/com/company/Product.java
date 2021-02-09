package com.company;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private Category categoryObject;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategoryObject() {
        return categoryObject;
    }

    public void setCategoryObject(Category categoryObject) {
        this.categoryObject = categoryObject;
    }

    public void applyCoupon(){
        if(getCategoryObject().getCategoryName().equals("Electronic")){
            price = price * 9/10;
        }
        if(getCategoryObject().getCategoryName().equals("Furniture")){
            price = price * 95/100;
        }
        if(getCategoryObject().getCategoryName().equals("Cosmetics")){
            price = price * 98/100;
        }
    }
}
