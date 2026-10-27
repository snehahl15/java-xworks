package com.xworkz.ecommerceapp.product;

public class Product {
    private int productId;
    private String productName;
    private String brand;
    private String category;
    private double price;
    private int quantity;

    public void setProductId(int productId){
        this.productId = productId;

    }

    public int getProductId() {
        return productId;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
