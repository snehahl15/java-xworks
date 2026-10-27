package com.xworkz.ecommerceapp.ecommerce;

import com.xworkz.ecommerceapp.product.Product;

public interface Ecommerce {
    // Add product
    boolean addProduct(Product product);

    // Display all products
    void getProducts();

    // Fetch product by ID
    Product getProductById(int id);

    // Fetch product name by price
    String getProductNameByPrice(double price);

    // Fetch product price by name
    double getProductPriceByName(String productName);

    // Fetch product brand by name
    String getBrandByProductName(String productName);

    // Fetch product ID by name
    int getProductIdByName(String productName);

    // Fetch category by brand
    String getCategoryByBrand(String brand);

    // Fetch quantity by product name
    int getQuantityByProductName(String productName);

    // Update product price by name
    boolean updateProductPriceByName(double newPrice, String productName);

    // Update product quantity by ID
    boolean updateProductQuantityById(int newQuantity, int productId);

    // Update product brand by ID
    boolean updateProductBrandById(String newBrand, int productId);

    // Update product name by ID
    boolean updateProductNameById(String newName, int productId);

    // Update product category by name
    boolean updateProductCategoryByName(String newCategory, String productName);

    boolean updateProductIdByName(int newId, String productName);
}
