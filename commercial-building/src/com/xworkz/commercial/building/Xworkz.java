package com.xworkz.commercial.building;

public class Xworkz implements Building{

    @Override
    public double doBusiness() {
        System.out.println("Course Business");
        return 20000.00;
    }
}
