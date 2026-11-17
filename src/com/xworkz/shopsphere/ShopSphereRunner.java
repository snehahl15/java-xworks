package com.xworkz.shopsphere;

import com.xworkz.shopsphere.dto.ProductDto;

import java.util.ArrayList;
import java.util.List;

public class ShopSphereRunner {

    public static void main(String[] args) {
        List<ProductDto> products = new ArrayList<>();

        products.add(new ProductDto(1,"laptop","Electronics","2026-01-15","dell",55000,10,20,"2 years"));
        products.add(new ProductDto(2,"mobile","electronics","2025-01-09","samsung",25000,5,15,"1 year"));
        products.add(new ProductDto(3,"motorola Edge 50 fusion","electronics","2026-02-19","android",21000,5,15,"1 year"));
        products.add(new ProductDto(4,"mouse","hp","2026-03-05","HP",800,5,50,"1 year"));
        products.add(new ProductDto(5,"monitor","Electronics","2026-02-18","LG",12000,8,18,"3 year"));

        products.add(new ProductDto(6,"Skipping Rope","sports","2026-02-06","decathlon",450,10,45,"6 months"));
        products.add(new ProductDto(7, "tablet", "electronics", "2026-03-12", "lenovo", 18000, 10, 12, "1 year"));
        products.add(new ProductDto(8, "printer", "electronics", "2026-01-25", "canon", 9000, 7, 10, "2 years"));
        products.add(new ProductDto(9, "smart watch", "electronics", "2026-04-10", "noise", 3500, 12, 25, "1 year"));
        products.add(new ProductDto(10, "power bank", "electronics", "2026-02-22", "mi", 1800, 5, 30, "6 months"));

        products.add(new ProductDto(11, "refrigerator", "home appliance", "2026-01-10", "whirlpool", 32000, 10, 8, "5 years"));
        products.add(new ProductDto(12, "washing machine", "home appliance", "2026-02-15", "lg", 28000, 8, 10, "5 years"));
        products.add(new ProductDto(13, "microwave", "home appliance", "2026-03-01", "samsung", 11000, 10, 14, "2 years"));
        products.add(new ProductDto(14, "mixer grinder", "home appliance", "2026-02-05", "prestige", 4500, 5, 20, "2 years"));
        products.add(new ProductDto(15, "ceiling fan", "home appliance", "2026-01-28", "crompton", 2500, 8, 30, "2 years"));

        products.add(new ProductDto(16, "electric iron", "home appliance", "2026-04-12", "philips", 1800, 10, 22, "2 years"));
        products.add(new ProductDto(17, "vacuum cleaner", "home appliance", "2026-03-18", "eureka forbes", 7500, 12, 9, "2 years"));
        products.add(new ProductDto(18, "air conditioner", "home appliance", "2026-02-20", "voltas", 38000, 10, 7, "5 years"));
        products.add(new ProductDto(19, "television", "home appliance", "2026-01-30", "sony", 45000, 15, 6, "3 years"));
        products.add(new ProductDto(20, "water purifier", "home appliance", "2026-03-25", "kent", 14000, 8, 11, "1 year"));

        products.add(new ProductDto(21, "t-shirt", "fashion", "2026-01-12", "puma", 999, 10, 50, "no warranty"));
        products.add(new ProductDto(22, "jeans", "fashion", "2026-02-08", "levis", 2499, 15, 30, "no warranty"));
        products.add(new ProductDto(23, "running shoes", "fashion", "2026-03-14", "nike", 4500, 10, 18, "6 months"));
        products.add(new ProductDto(24, "wrist watch", "fashion", "2026-04-05", "titan", 3200, 12, 20, "2 years"));
        products.add(new ProductDto(25, "backpack", "fashion", "2026-02-25", "wildcraft", 1800, 8, 25, "1 year"));

        products.add(new ProductDto(26, "jacket", "fashion", "2026-01-18", "adidas", 3500, 15, 12, "no warranty"));
        products.add(new ProductDto(27, "sunglasses", "fashion", "2026-03-08", "ray-ban", 6500, 5, 10, "1 year"));
        products.add(new ProductDto(28, "wallet", "fashion", "2026-04-15", "fossil", 2200, 10, 16, "1 year"));
        products.add(new ProductDto(29, "belt", "fashion", "2026-02-12", "woodland", 1200, 5, 24, "no warranty"));
        products.add(new ProductDto(30, "cap", "fashion", "2026-03-20", "puma", 700, 10, 40, "no warranty"));

        products.add(new ProductDto(31, "cricket bat", "sports", "2026-01-22", "sg", 2500, 10, 15, "6 months"));
        products.add(new ProductDto(32, "football", "sports", "2026-02-17", "nivia", 1200, 5, 25, "no warranty"));
        products.add(new ProductDto(33, "basketball", "sports", "2026-03-11", "spalding", 2200, 8, 12, "6 months"));
        products.add(new ProductDto(34, "dumbbells", "sports", "2026-04-02", "kore", 1800, 10, 20, "1 year"));
        products.add(new ProductDto(35, "yoga mat", "sports", "2026-01-26", "boldfit", 900, 5, 35, "6 months"));

        products.add(new ProductDto(36, "treadmill", "sports", "2026-02-28", "powermax", 35000, 12, 5, "2 years"));
        products.add(new ProductDto(37, "badminton racket", "sports", "2026-03-16", "yonex", 2800, 10, 14, "1 year"));
        products.add(new ProductDto(38, "bicycle", "sports", "2026-04-08", "hero", 12000, 8, 9, "2 years"));
        products.add(new ProductDto(39, "helmet", "sports", "2026-01-14", "vega", 1500, 5, 28, "1 year"));
        products.add(new ProductDto(40, "skipping rope", "sports", "2026-02-06", "decathlon", 450, 10, 45, "6 months"));

        products.add(new ProductDto(41, "refrigerator stand", "home appliance", "2026-05-10", "croma", 1800, 10, 12, "1 year"));
        products.add(new ProductDto(42, "gaming mouse", "electronics", "2026-05-12", "razer", 3500, 15, 20, "2 years"));
        products.add(new ProductDto(43, "sports shoes", "fashion", "2026-05-15", "reebok", 4000, 12, 18, "1 year"));
        products.add(new ProductDto(44, "cricket helmet", "sports", "2026-05-18", "shrey", 2800, 8, 10, "1 year"));
      //  System.out.println(products);
         //1. Print all product info
        for (ProductDto product : products) {
            System.out.println(product);
        }
        System.out.println("-----------------------");
         //2. print all  name's of the product
        for (ProductDto product : products) {
            System.out.println(product.getName());
        }
        System.out.println("-----------------------------");

         //3. Print all product where discount is greater than 10 %
        for (ProductDto product : products) {

            if (product.getDiscount() > 10) {

                System.out.println(product);
            }
        }
        System.out.println("------------------------------------");
        //4. Collect all product if warranty less than 3


       // 6. Collect all product if quantity > 5

        for(ProductDto product:products){
            if(product.getQuantity()>5){
                System.out.println(product);
            }
        }

    //    7. Collect only manufacturer of all product
        System.out.println("-----------------------------");

        for (ProductDto product:products){
            System.out.println(product.getManufacturer());
        }
        System.out.println("--------------------------------------");


       //8. get the product with min discount

       ProductDto minDiscount = products.get(0);
        for (ProductDto product :products){
            if(product.getDiscount()<minDiscount.getDiscount()){
                minDiscount =product;
            }
        }
        System.out.println("product with minimum discount");
        System.out.println(minDiscount);


        System.out.println("----------------------------");

 //10. get the product with max costPerItem
        ProductDto maxCost = products.get(0);
        for(ProductDto product:products){
            if(product.getCostPerItem()>maxCost.getCostPerItem()){
                maxCost = product;
            }
        }
        System.out.println("maximum cost per item");
        System.out.println(maxCost);

    }
}
