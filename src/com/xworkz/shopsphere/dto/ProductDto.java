package com.xworkz.shopsphere.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor


@Data
public class ProductDto {
    private int id;
    private String name;
    private String type;
    private String manufacturedDate;
    private String manufacturer;
    private  double costPerItem;
    private double discount;
    private int quantity;
    private String warranty;


}
