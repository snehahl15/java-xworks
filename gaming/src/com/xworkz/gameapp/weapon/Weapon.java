package com.xworkz.gameapp.weapon;

public class Weapon {
    public int durability = 100;


    //method1
    public void attack(){

        durability -= 5;
        System.out.println("Basic swing! Dealt 10 damage. Durability left: " + durability);

    }
    // Method 2: Defend / Block an incoming hit

    public void block() {
        durability -= 2;
        System.out.println("Basic block! Absorbed 5 damage. Durability left: " + durability);
    }
    // Method 3: Show the item description info
    public void inspect() {
        System.out.println("Weapon Type: Standard Gear | Durability: " + durability + "%");
    }
}
