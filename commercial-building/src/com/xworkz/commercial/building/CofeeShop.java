package com.xworkz.commercial.building;

public class CofeeShop implements Building{
    @Override
    public double doBusiness() {
        System.out.println("Cofee Business");
        return 1000.00;
    }
}
