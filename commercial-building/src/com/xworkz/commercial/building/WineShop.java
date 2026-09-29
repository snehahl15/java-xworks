package com.xworkz.commercial.building;

public class WineShop implements Building{
    @Override
    public double doBusiness() {
        System.out.println("Wine Business");
        return 19990.00;
    }
}
