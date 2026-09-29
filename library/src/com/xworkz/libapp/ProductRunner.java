package com.xworkz.libapp;

import com.xworkz.libapp.product.Product;

public class ProductRunner {
    public static void main(String[] args) {


        Product p1 = new Product();
        p1.setProductID(101);
        int id1 = p1.getProductID();
        System.out.println("product = " + id1
        );

        p1.setProductName("Galaxy S26 Ultra");
        String pName = p1.getProductName();
        System.out.println("pName = " + pName);


        p1.setPrice(1299.99);
        double price = p1.getPrice();
        System.out.println("price = " + price);

        p1.setBrandName("Samsung");
        String bName = p1.getBrandName();
        System.out.println("bName = " + bName);

        p1.setModelNumber("SM-G948B");
        String model = p1.getModelNumber();
        System.out.println("model = " + model);

        System.out.println("-------------------------");


        Product p2 = new Product();
        p2.setProductID(102);
        int id2 = p2.getProductID();
        System.out.println("product = " + id2);

        p2.setProductName("MacBook Pro 14");
        String pName2 = p2.getProductName();
        System.out.println("pName = " + pName2);

        p2.setPrice(1999.00);
        double price2 = p2.getPrice();
        System.out.println("price = " + price2);

        p2.setBrandName("Apple");
        String bName2 = p2.getBrandName();
        System.out.println("bName = " + bName2);

        p2.setModelNumber("A3114");
        String model2 = p2.getModelNumber();
        System.out.println("model = " + model2);
        System.out.println("---------------------------");

        Product p3 = new Product();
        p3.setProductID(103);
        int id3 = p3.getProductID();
        System.out.println("product = " + id3);

        p3.setProductName("WH-1000XM5");
        String pName3 = p3.getProductName();
        System.out.println("pName = " + pName3);

        p3.setPrice(398.00);
        double price3 = p3.getPrice();
        System.out.println("price = " + price3);

        p3.setBrandName("Sony");
        String bName3 = p3.getBrandName();
        System.out.println("bName = " + bName3);

        p3.setModelNumber("WH1000XM5/B");
        String model3 = p3.getModelNumber();
        System.out.println("model = " + model3);
        System.out.println(" -----------------------------");


        Product p4 = new Product();
        p4.setProductID(104);
        int id4 = p4.getProductID();
        System.out.println("product = " + id4);

        p4.setProductName("Kindle Paperwhite");
        String pName4 = p4.getProductName();
        System.out.println("pName = " + pName4);

        p4.setPrice(149.99);
        double price4 = p4.getPrice();
        System.out.println("price = " + price4);

        p4.setBrandName("Amazon");
        String bName4 = p4.getBrandName();
        System.out.println("bName = " + bName4);

        p4.setModelNumber("B09TMF6742");
        String model4 = p4.getModelNumber();
        System.out.println("model = " + model4);
        System.out.println("---------------------------");


        Product p5 = new Product();
        p5.setProductID(105);
        int id5 = p5.getProductID();
        System.out.println("product = " + id5);

        p5.setProductName("Hero 12 Black");
        String pName5 = p5.getProductName();
        System.out.println("pName = " + pName5);

        p5.setPrice(399.99);
        double price5 = p5.getPrice();
        System.out.println("price = " + price5);

        p5.setBrandName("GoPro");
        String bName5 = p5.getBrandName();
        System.out.println("bName = " + bName5);

        p5.setModelNumber("CHDHX-121-RW");
        String model5 = p5.getModelNumber();
        System.out.println("model = " + model5);


        System.out.println(" -------------------------------------");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}

