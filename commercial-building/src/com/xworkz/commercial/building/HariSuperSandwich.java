package com.xworkz.commercial.building;

public class HariSuperSandwich implements Building{

    @Override
    public double doBusiness() {
        System.out.println("Sandwich Business + chat Business");

        return 1000.00;
    }
}
