package com.xworkz.gameapp;

import com.xworkz.gameapp.weapon.Weapon;
import com.xworkz.gameapp.weapon.grapplinghook.GrapplingHookWeapon;

public class GameRunner {
    public static void main(String[] args) {
        Weapon equippedWeapon = new GrapplingHookWeapon();
        equippedWeapon.attack();
        System.out.println("-------------------------------");
        equippedWeapon.inspect();



        //down casting
        System.out.println("perform down casting");
       GrapplingHookWeapon physicalHook= (GrapplingHookWeapon) equippedWeapon;
       physicalHook.swingFromCeiling();


    }
}
