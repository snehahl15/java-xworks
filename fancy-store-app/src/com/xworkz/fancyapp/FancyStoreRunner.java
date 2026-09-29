package com.xworkz.fancyapp;

import com.xworkz.fancyapp.fancystore.FancyStore;
import com.xworkz.fancyapp.item.Item;

public class FancyStoreRunner {
    public static void main(String[] args) {

        FancyStore store = new FancyStore();

        //lipstick
        Item item1 = new Item();
        item1.setItemId(101);
        item1.setItemName("Lipstick");
        item1.setType("Cosmetics");
        item1.setBrand("Lakme");
        item1.setPrice(450);
        item1.setQuantity(10);


        //silver bangle
        Item item2 = new Item();
        item2.setItemId(102);
        item2.setItemName("Silver Bangle");
        item2.setType("Jewelry");
        item2.setBrand("LocalCraft");
        item2.setPrice(1200);
        item2.setQuantity(5);


        // 3. Perfume
        Item item3 = new Item();
        item3.setItemId(103);
        item3.setItemName("Body Mist");
        item3.setType("Fragrance");
        item3.setBrand("Fogg");
        item3.setPrice(299);
        item3.setQuantity(15);

        // 4. Nail Polish
        Item item4 = new Item();
        item4.setItemId(104);
        item4.setItemName("Nail Polish");
        item4.setType("Cosmetics");
        item4.setBrand("Colorbar");
        item4.setPrice(180);
        item4.setQuantity(30);

        // 5. Hair Clips
        Item item5 = new Item();
        item5.setItemId(105);
        item5.setItemName("Claw Clip");
        item5.setType("Hair Accessories");
        item5.setBrand("Vogue");
        item5.setPrice(75);
        item5.setQuantity(50);

        // 6. Foundation
        Item item6 = new Item();
        item6.setItemId(106);
        item6.setItemName("Liquid Foundation");
        item6.setType("Cosmetics");
        item6.setBrand("Maybelline");
        item6.setPrice(650);
        item6.setQuantity(8);

        // 7. Handbag
        Item item7 = new Item();
        item7.setItemId(107);
        item7.setItemName("Sling Bag");
        item7.setType("Bags");
        item7.setBrand("Baggit");
        item7.setPrice(1500);
        item7.setQuantity(4);

        // 8. Earrings
        Item item8 = new Item();
        item8.setItemId(108);
        item8.setItemName("Jhumkas");
        item8.setType("Jewelry");
        item8.setBrand("EthnicHub");
        item8.setPrice(350);
        item8.setQuantity(20);

        // 9. Kajal
        Item item9 = new Item();
        item9.setItemId(109);
        item9.setItemName("Eye Kajal");
        item9.setType("Cosmetics");
        item9.setBrand("Faces Canada");
        item9.setPrice(199);
        item9.setQuantity(25);

        // 10. Hair Bands
        Item item10 = new Item();
        item10.setItemId(110);
        item10.setItemName("Scrunchies Pack");
        item10.setType("Hair Accessories");
        item10.setBrand("UrbanGlow");
        item10.setPrice(120);
        item10.setQuantity(40);

        // 11. Necklace
        Item item11 = new Item();
        item11.setItemId(111);
        item11.setItemName("Choker Set");
        item11.setType("Jewelry");
        item11.setBrand("Zaveri");
        item11.setPrice(850);
        item11.setQuantity(6);

        // 12. Face Powder
        Item item12 = new Item();
        item12.setItemId(112);
        item12.setItemName("Compact Powder");
        item12.setType("Cosmetics");
        item12.setBrand("Sugar");
        item12.setPrice(499);
        item12.setQuantity(12);

        // 13. Sunscreen
        Item item13 = new Item();
        item13.setItemId(113);
        item13.setItemName("Sunscreen SPF 50");
        item13.setType("Skincare");
        item13.setBrand("Lotus");
        item13.setPrice(375);
        item13.setQuantity(18);

        // 14. Wallet
        Item item14 = new Item();
        item14.setItemId(114);
        item14.setItemName("Leather Wallet");
        item14.setType("Bags");
        item14.setBrand("Caprese");
        item14.setPrice(999);
        item14.setQuantity(7);

        // 15. Hair Pins
        Item item15 = new Item();
        item15.setItemId(115);
        item15.setItemName("Bobby Pins");
        item15.setType("Hair Accessories");
        item15.setBrand("Elite");
        item15.setPrice(40);
        item15.setQuantity(100);

        // 16. Eyeliner
        Item item16 = new Item();
        item16.setItemId(116);
        item16.setItemName("Waterproof Eyeliner");
        item16.setType("Cosmetics");
        item16.setBrand("Plum");
        item16.setPrice(275);
        item16.setQuantity(22);

        // 17. Rings
        Item item17 = new Item();
        item17.setItemId(117);
        item17.setItemName("Adjustable Ring");
        item17.setType("Jewelry");
        item17.setBrand("Giva");
        item17.setPrice(1100);
        item17.setQuantity(9);

        // 18. Face Wash
        Item item18 = new Item();
        item18.setItemId(118);
        item18.setItemName("Vitamin C Face Wash");
        item18.setType("Skincare");
        item18.setBrand("Mamaearth");
        item18.setPrice(249);
        item18.setQuantity(14);

        // 19. Hair Serum
        Item item19 = new Item();
        item19.setItemId(119);
        item19.setItemName("Hair Vitalizer");
        item19.setType("Haircare");
        item19.setBrand("Livon");
        item19.setPrice(320);
        item19.setQuantity(11);

        // 20. Sunglasses
        Item item20 = new Item();
        item20.setItemId(120);
        item20.setItemName("CatEye Sunglasses");
        item20.setType("Accessories");
        item20.setBrand("Fastrack");
        item20.setPrice(799);
        item20.setQuantity(5);

        // 21. Mascara
        Item item21 = new Item();
        item21.setItemId(121);
        item21.setItemName("Volume Mascara");
        item21.setType("Cosmetics");
        item21.setBrand("Loreal");
        item21.setPrice(599);
        item21.setQuantity(10);

        // 22. Anklets
        Item item22 = new Item();
        item22.setItemId(122);
        item22.setItemName("Payal Set");
        item22.setType("Jewelry");
        item22.setBrand("Traditional");
        item22.setPrice(250);
        item22.setQuantity(15);

        // 23. Lip Balm
        Item item23 = new Item();
        item23.setItemId(123);
        item23.setItemName("Cherry Lip Balm");
        item23.setType("Skincare");
        item23.setBrand("Nivea");
        item23.setPrice(140);
        item23.setQuantity(28);

        // 24. Moisturizer
        Item item24 = new Item();
        item24.setItemId(124);
        item24.setItemName("Gel Moisturizer");
        item24.setType("Skincare");
        item24.setBrand("Ponds");
        item24.setPrice(220);
        item24.setQuantity(20);

        // 25. Comb Set
        Item item25 = new Item();
        item25.setItemId(125);
        item25.setItemName("Wooden Comb");
        item25.setType("Accessories");
        item25.setBrand("Roots");
        item25.setPrice(195);
        item25.setQuantity(13);

        Item item26 = new Item();
        item25.setItemId(125);
        item25.setItemName("Wooden Comb");
        item25.setType("Accessories");
        item25.setBrand("Roots");
        item25.setPrice(195);
        item25.setQuantity(13);

        store.addItem(item1);
        store.addItem(item2);
        store.addItem(item3);
        store.addItem(item4);
        store.addItem(item5);
        store.addItem(item6);
        store.addItem(item7);
        store.addItem(item8);
        store.addItem(item9);
        store.addItem(item10);
        store.addItem(item11);
        store.addItem(item12);
        store.addItem(item13);
        store.addItem(item14);
        store.addItem(item15);
        store.addItem(item16);
        store.addItem(item17);
        store.addItem(item18);
        store.addItem(item19);
        store.addItem(item20);
        store.addItem(item21);
        store.addItem(item22);
        store.addItem(item23);
        store.addItem(item24);
        store.addItem(item25);
        store.addItem(item26);

        store.getAllItems();


    }
}
