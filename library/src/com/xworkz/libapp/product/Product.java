package com.xworkz.libapp.product;

import java.util.Objects;

public class Product {
    private int productID;
    private String productName;
    private double price;
    private String brandName;
    private String modelNumber;

    public String toString(){
        return  "product(productID= "+this.productID+",productName="+this.productName+
        ",price ="+this.price+
        ",BrandName="+this.brandName+
        ",ModelNumber="+this.modelNumber+")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID && Double.compare(price, product.price) == 0 && Objects.equals(productName, product.productName) && Objects.equals(brandName, product.brandName) && Objects.equals(modelNumber, product.modelNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, productName, price, brandName, modelNumber);
    }

    //setters ---- mutators
    //getter -----accessors
    public void setProductID(int productID) {
        this.productID = productID;

    }

    public int getProductID() {

        return productID;
    }

    public void setProductName(String productName) {

      this.  productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

}
