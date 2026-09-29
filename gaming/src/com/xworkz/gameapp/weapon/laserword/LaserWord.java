package com.xworkz.gameapp.weapon.laserword;

import com.xworkz.gameapp.weapon.Weapon;

public class LaserWord extends Weapon {
    @Override
    public void attack() {
        durability -= 10; // Consumes more energy battery
        System.out.println("⚡ ZZZM! Laser blade slices dealing 80 Plasma Damage! Battery: " + durability);
    }
    @Override
    public void inspect() {
        System.out.println("✨ [Mythic Item] Energy Laser Sword | Battery Charge: " + durability + "%");
    }
}
