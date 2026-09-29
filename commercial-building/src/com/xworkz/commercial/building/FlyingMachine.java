package com.xworkz.commercial.building;

public class FlyingMachine implements Building{

    @Override
    public double doBusiness() {
        System.out.println("Cloths Business");
        return 10000.00;
    }
}
