package com.xworkz.fancyapp.fancystore;

import com.xworkz.fancyapp.item.Item;

public class FancyStore {
    // Array initialized to hold exactly 25 items
    private Item[] items = new Item[25];
    private int index = 0;

    public boolean addItem(Item item) {
        if (index >= items.length) {
            System.out.println("Store capacity full! Cannot add more items.");
            return false;
        }

        boolean isIdValid = item.getItemId() > 0;
        boolean isNameValid = item.getItemName() != null && !item.getItemName().isEmpty();
        boolean isTypeValid = item.getType() != null && !item.getType().isEmpty();
        boolean isBrandValid = item.getBrand() != null && !item.getBrand().isEmpty();
        boolean isPriceValid = item.getPrice() > 0;
        boolean isQuantityValid = item.getQuantity() >= 0;

        if (!isIdValid) System.out.println("Invalid Item ID");
        if (!isNameValid) System.out.println("Invalid Item Name");
        if (!isTypeValid) System.out.println("Invalid Item Type");
        if (!isBrandValid) System.out.println("Invalid Item Brand");
        if (!isPriceValid) System.out.println("Invalid Item Price");


        // Save if all conditions are met
        if (isIdValid && isNameValid && isTypeValid && isBrandValid && isPriceValid && isQuantityValid) {
            items[index++] = item;
            return true;
        }
        return false;
    }

    public void getAllItems() {
        System.out.println("--- Fancy Store Inventory List ---");
        for (Item item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

}