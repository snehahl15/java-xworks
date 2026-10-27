package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.ecommerce.Ecommerce;
import com.xworkz.ecommerceapp.ecommerce.EcommerceImpl;
import com.xworkz.ecommerceapp.product.Product;

import java.util.Scanner;
public class EcommerceRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products to add:");
        int size = sc.nextInt();

        Ecommerce ecommerce = new EcommerceImpl(size);

        for (int i = 1; i <= size; i++) {

            Product product = new Product();

            System.out.println("Enter product ID:");
            product.setProductId(sc.nextInt());

            System.out.println("Enter product name:");
            sc.nextLine();
            product.setProductName(sc.nextLine());

            System.out.println("Enter product brand:");
            product.setBrand(sc.nextLine());

            System.out.println("Enter product category:");
            product.setCategory(sc.nextLine());

            System.out.println("Enter product price:");
            product.setPrice(sc.nextDouble());

            System.out.println("Enter product quantity:");
            product.setQuantity(sc.nextInt());

            boolean added = ecommerce.addProduct(product);

            System.out.println("Product added: " + added);
        }


        String yesOrNo;

        do {
            System.out.println("\n===== E-COMMERCE MENU =====");
            System.out.println("1. Get all products");
            System.out.println("2. Get product by ID");
            System.out.println("3. Get product name by price");
            System.out.println("4. Get product price by name");
            System.out.println("5. Get brand by product name");
            System.out.println("6. Get product ID by name");
            System.out.println("7. Get category by brand");
            System.out.println("8. Get quantity by product name");
            System.out.println("9. Update product price by name");
            System.out.println("10. Update product quantity by ID");
            System.out.println("11. Update product brand by ID");
            System.out.println("12. Update product name by ID");
            System.out.println("13. Update product category by name");
            System.out.println("14. Update product ID by name");
            System.out.println("15. Exit");
            System.out.println("Enter your option:");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("All product details:");
                    ecommerce.getProducts();
                    break;

                case 2:
                    System.out.println("Enter product ID:");
                    int id = sc.nextInt();

                    Product product = ecommerce.getProductById(id);
                    System.out.println(product);
                    break;

                case 3:
                    System.out.println("Enter product price:");
                    double searchPrice = sc.nextDouble();

                    String productName =
                            ecommerce.getProductNameByPrice(searchPrice);
                    System.out.println("Product name: " + productName);
                    break;

                case 4:
                    System.out.println("Enter product name:");
                    sc.nextLine();
                    String searchName = sc.nextLine();

                    double price = ecommerce.getProductPriceByName(searchName);
                    System.out.println("Product price: " + price);
                    break;

                case 5:
                    System.out.println("Enter product name:");
                    sc.nextLine();
                    String nameForBrand = sc.nextLine();

                    String brand = ecommerce.getBrandByProductName(nameForBrand);
                    System.out.println("Product brand: " + brand);
                    break;

                case 6:
                    System.out.println("Enter product name:");
                    sc.nextLine();
                    String nameForId = sc.nextLine();

                    int productId = ecommerce.getProductIdByName(nameForId);
                    System.out.println("Product ID: " + productId);
                    break;

                case 7:
                    System.out.println("Enter product brand:");
                    sc.nextLine();
                    String searchBrand = sc.nextLine();

                    String category = ecommerce.getCategoryByBrand(searchBrand);
                    System.out.println("Product category: " + category);
                    break;

                case 8:
                    System.out.println("Enter product name:");
                    sc.nextLine();
                    String nameForQuantity = sc.nextLine();

                    int quantity =
                            ecommerce.getQuantityByProductName(nameForQuantity);
                    System.out.println("Product quantity: " + quantity);
                    break;

                case 9:
                    System.out.println("Enter product name:");
                    sc.nextLine();
                    String nameForPriceUpdate = sc.nextLine();

                    System.out.println("Enter new price:");
                    double newPrice = sc.nextDouble();

                    boolean priceUpdated =
                            ecommerce.updateProductPriceByName(
                                    newPrice, nameForPriceUpdate);

                    System.out.println("Price updated: " + priceUpdated);
                    break;

                case 10:
                    System.out.println("Enter product ID:");
                    int idForQuantity = sc.nextInt();

                    System.out.println("Enter new quantity:");
                    int newQuantity = sc.nextInt();

                    boolean quantityUpdated =
                            ecommerce.updateProductQuantityById(
                                    newQuantity, idForQuantity);

                    System.out.println("Quantity updated: " + quantityUpdated);
                    break;

                case 11:
                    System.out.println("Enter product ID:");
                    int idForBrand = sc.nextInt();

                    System.out.println("Enter new brand:");
                    sc.nextLine();
                    String newBrand = sc.nextLine();

                    boolean brandUpdated =
                            ecommerce.updateProductBrandById(
                                    newBrand, idForBrand);

                    System.out.println("Brand updated: " + brandUpdated);
                    break;

                case 12:
                    System.out.println("Enter product ID:");
                    int idForName = sc.nextInt();

                    System.out.println("Enter new product name:");
                    sc.nextLine();
                    String newName = sc.nextLine();

                    boolean nameUpdated =
                            ecommerce.updateProductNameById(
                                    newName, idForName);

                    System.out.println("Name updated: " + nameUpdated);
                    break;

                case 13:
                    System.out.println("Enter product name:");
                    sc.nextLine();
                    String nameForCategory = sc.nextLine();

                    System.out.println("Enter new category:");
                    String newCategory = sc.nextLine();

                    boolean categoryUpdated =
                            ecommerce.updateProductCategoryByName(
                                    newCategory, nameForCategory);

                    System.out.println("Category updated: " + categoryUpdated);
                    break;

                case 14:
                    System.out.println("Enter product name:");
                    sc.nextLine();
                    String nameForIdUpdate = sc.nextLine();

                    System.out.println("Enter new product ID:");
                    int newId = sc.nextInt();

                    boolean idUpdated =
                            ecommerce.updateProductIdByName(
                                    newId, nameForIdUpdate);

                    System.out.println("Product ID updated: " + idUpdated);
                    break;

                case 15:
                    System.out.println("Exiting E-Commerce application...");
                    break;

                default:
                    System.out.println("Please enter a valid option");
            }

            if (option != 15) {
                System.out.println("Do you want to continue? Y/N");
                yesOrNo = sc.next();
            } else {
                yesOrNo = "N";
            }

        } while (yesOrNo.equalsIgnoreCase("Y"));

        sc.close();

    }
}
