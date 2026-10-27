package com.xworkz.ecommerceapp.ecommerce;

import com.xworkz.ecommerceapp.product.Product;

public class EcommerceImpl implements Ecommerce{

    private Product[] products;
    private int index;

    public EcommerceImpl(int size) {
        products = new Product[size];
    }

    @Override
    public boolean addProduct(Product product) {
        boolean isAdded = false;

        boolean idAdded = false;
        boolean nameAdded = false;
        boolean brandAdded = false;
        boolean categoryAdded = false;
        boolean priceAdded = false;
        boolean quantityAdded = false;

        if (product != null && product.getProductId() > 0) {
            idAdded = true;
        }

        if (product != null && product.getProductName() != null
                && !product.getProductName().isEmpty()) {
            nameAdded = true;
        }

        if (product != null && product.getBrand() != null
                && !product.getBrand().isEmpty()) {
            brandAdded = true;
        }

        if (product != null && product.getCategory() != null
                && !product.getCategory().isEmpty()) {
            categoryAdded = true;
        }

        if (product != null && product.getPrice() > 0) {
            priceAdded = true;
        }

        if (product != null && product.getQuantity() > 0) {
            quantityAdded = true;
        }

        if (idAdded && nameAdded && brandAdded
                && categoryAdded && priceAdded && quantityAdded
                && index < products.length) {

            products[index++] = product;
            isAdded = true;
        }

        return isAdded;
    }
    @Override
    public void getProducts() {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }


    @Override
    public Product getProductById(int id) {
        Product foundProduct = null;

        for (Product product : products) {
            if (product != null && product.getProductId() == id) {
                foundProduct = product;
                break;
            }
        }

        return foundProduct;
    }

    @Override
    public String getProductNameByPrice(double price) {
        String productName = null;

        for (Product product : products) {
            if (product != null && product.getPrice() == price) {
                productName = product.getProductName();
                break;
            }
        }

        return productName;
    }

    @Override
    public double getProductPriceByName(String productName) {
        double price = 0.0;

        for (Product product : products) {
            if (product != null
                    && product.getProductName().equals(productName)) {
                price = product.getPrice();
                break;
            }
        }

        return price;
    }

    @Override
    public String getBrandByProductName(String productName) {
        String brand = null;

        for (Product product : products) {
            if (product != null
                    && product.getProductName().equals(productName)) {
                brand = product.getBrand();
                break;
            }
        }

        return brand;
    }

    @Override
    public int getProductIdByName(String productName) {
        int productId = -1;

        for (Product product : products) {
            if (product != null
                    && product.getProductName().equals(productName)) {
                productId = product.getProductId();
                break;
            }
        }

        return productId;
    }

    @Override
    public String getCategoryByBrand(String brand) {
        String category = null;

        for (Product product : products) {
            if (product != null
                    && product.getBrand().equals(brand)) {
                category = product.getCategory();
                break;
            }
        }

        return category;
    }

    @Override
    public int getQuantityByProductName(String productName) {
        int quantity = 0;

        for (Product product : products) {
            if (product != null
                    && product.getProductName().equals(productName)) {
                quantity = product.getQuantity();
                break;
            }
        }

        return quantity;
    }

    @Override
    public boolean updateProductPriceByName(double newPrice, String productName) {
        boolean isUpdated = false;

        if (newPrice > 0 && productName != null) {
            for (Product product : products) {
                if (product != null
                        && product.getProductName().equals(productName)) {
                    product.setPrice(newPrice);
                    isUpdated = true;
                    break;
                }
            }
        }

        return isUpdated;
    }

    @Override
    public boolean updateProductQuantityById(int newQuantity, int productId) {
        boolean isUpdated = false;

        if (newQuantity >= 0 && productId > 0) {
            for (Product product : products) {
                if (product != null
                        && product.getProductId() == productId) {
                    product.setQuantity(newQuantity);
                    isUpdated = true;
                    break;
                }
            }
        }

        return isUpdated;
    }

    @Override
    public boolean updateProductBrandById(String newBrand, int productId) {
        boolean isUpdated = false;

        if (newBrand != null && !newBrand.isEmpty() && productId > 0) {
            for (Product product : products) {
                if (product != null
                        && product.getProductId() == productId) {
                    product.setBrand(newBrand);
                    isUpdated = true;
                    break;
                }
            }
        }

        return isUpdated;
    }

    @Override
    public boolean updateProductNameById(String newName, int productId) {
        boolean isUpdated = false;

        if (newName != null && !newName.isEmpty() && productId > 0) {
            for (Product product : products) {
                if (product != null
                        && product.getProductId() == productId) {
                    product.setProductName(newName);
                    isUpdated = true;
                    break;
                }
            }
        }

        return isUpdated;
    }

    @Override
    public boolean updateProductCategoryByName(String newCategory, String productName) {
        boolean isUpdated = false;

        if (newCategory != null && !newCategory.isEmpty()
                && productName != null && !productName.isEmpty()) {

            for (Product product : products) {
                if (product != null
                        && product.getProductName().equals(productName)) {
                    product.setCategory(newCategory);
                    isUpdated = true;
                    break;
                }
            }
        }

        return isUpdated;
    }

    @Override
    public boolean updateProductIdByName(int newId, String productName) {
        boolean isUpdated = false;

        if (newId > 0 && productName != null && !productName.isEmpty()) {
            for (Product product : products) {
                if (product != null
                        && product.getProductName().equals(productName)) {
                    product.setProductId(newId);
                    isUpdated = true;
                    break;
                }
            }
        }

        return isUpdated;
    }

}
