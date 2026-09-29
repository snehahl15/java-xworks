package com.xworkz.gameapp.weapon.grapplinghook;

import com.xworkz.gameapp.weapon.Weapon;

public class GrapplingHookWeapon extends Weapon {
    @Override
    public void attack() {
        durability -= 8; // Pulling physics uses up cord durability
        System.out.println("🪝 Thwip! The hook launches into the ceiling and pulls you across the map!");
        System.out.println("Line Tension Stable. Cable Durability left: " + durability + "%");
    }

    @Override
    public void inspect() {
        System.out.println("🥷 [Tactical Gear] Stealth Grappling Hook | Cord Integrity: " + durability + "%");
    }
    public void swingFromCeiling() {
        System.out.println("🛸 WHEEE! You are swinging through the air like Spider-Man!");
    }
}
