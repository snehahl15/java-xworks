package com.xworkz.commercial;

import com.xworkz.commercial.building.*;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building = new HariSuperSandwich();
        building.doBusiness();

        Building building1 = new WatchShop();
        building1.doBusiness();
        Building building2 = new Xworkz();
        building2.doBusiness();
        Building building3  = new FlyingMachine();
        building3.doBusiness();
        Building building4 = new CofeeShop();
        building4.doBusiness();
        Building building5 = new WatchShop();
        building5.doBusiness();
        Building building6 = new LassiShop();
        building6.doBusiness();
    }
}
