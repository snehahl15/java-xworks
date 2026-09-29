package com.xworkz.commercial.building;

public class WatchShop implements Building{

    @Override
    public double doBusiness() {
        System.out.println(" Watch Business");
        return 1000.00;
    }
}
