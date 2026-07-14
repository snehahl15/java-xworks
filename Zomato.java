class Zomato {

    public static double search(String itemName) {

        double price = 0.0;

        if(itemName=="Margherita Pizza"){
            price=199.0;
        }else if(itemName=="Farmhouse Pizza"){
            price=299.0;
        }else if(itemName=="Veg Supreme Pizza"){
            price=349.0;
        }else if(itemName=="Chicken Pizza"){
            price=399.0;
        }else if(itemName=="Paneer Pizza"){
            price=329.0;
        }else if(itemName=="Chicken Biryani"){
            price=249.0;
        }else if(itemName=="Mutton Biryani"){
            price=349.0;
        }else if(itemName=="Veg Biryani"){
            price=199.0;
        }else if(itemName=="Egg Biryani"){
            price=219.0;
        }else if(itemName=="Hyderabadi Biryani"){
            price=299.0;
        }else if(itemName=="Chicken Fried Rice"){
            price=189.0;
        }else if(itemName=="Veg Fried Rice"){
            price=149.0;
        }else if(itemName=="Schezwan Rice"){
            price=179.0;
        }else if(itemName=="Gobi Manchurian"){
            price=169.0;
        }else if(itemName=="Chicken Manchurian"){
            price=229.0;
        }
		        else if(itemName=="Paneer Tikka"){
            price=269.0;
        }else if(itemName=="Chicken Tikka"){
            price=299.0;
        }else if(itemName=="Butter Naan"){
            price=49.0;
        }else if(itemName=="Garlic Naan"){
            price=59.0;
        }else if(itemName=="Butter Chicken"){
            price=349.0;
        }else if(itemName=="Palak Paneer"){
            price=239.0;
        }else if(itemName=="Dal Fry"){
            price=159.0;
        }else if(itemName=="Jeera Rice"){
            price=139.0;
        }else if(itemName=="Tandoori Roti"){
            price=30.0;
        }else if(itemName=="Chilli Chicken"){
            price=249.0;
        }else if(itemName=="Chicken 65"){
            price=259.0;
        }else if(itemName=="Fish Fry"){
            price=329.0;
        }else if(itemName=="Prawn Fry"){
            price=399.0;
        }else if(itemName=="Mushroom Curry"){
            price=229.0;
        }else if(itemName=="Veg Meals"){
            price=199.0;
        }

        return price;
    }

    public static double search(String itemName, int quantity){

        double totalPrice = 0.0;

        if(itemName=="Margherita Pizza"){
            totalPrice=199.0*quantity;
        }else if(itemName=="Farmhouse Pizza"){
            totalPrice=299.0*quantity;
        }else if(itemName=="Veg Supreme Pizza"){
            totalPrice=349.0*quantity;
        }else if(itemName=="Chicken Pizza"){
            totalPrice=399.0*quantity;
        }else if(itemName=="Paneer Pizza"){
            totalPrice=329.0*quantity;
        }else if(itemName=="Chicken Biryani"){
            totalPrice=249.0*quantity;
        }else if(itemName=="Mutton Biryani"){
            totalPrice=349.0*quantity;
        }else if(itemName=="Veg Biryani"){
            totalPrice=199.0*quantity;
        }else if(itemName=="Egg Biryani"){
            totalPrice=219.0*quantity;
        }else if(itemName=="Hyderabadi Biryani"){
            totalPrice=299.0*quantity;
        }else if(itemName=="Chicken Fried Rice"){
            totalPrice=189.0*quantity;
        }else if(itemName=="Veg Fried Rice"){
            totalPrice=149.0*quantity;
        }else if(itemName=="Schezwan Rice"){
            totalPrice=179.0*quantity;
        }else if(itemName=="Gobi Manchurian"){
            totalPrice=169.0*quantity;
        }else if(itemName=="Chicken Manchurian"){
            totalPrice=229.0*quantity;
        }else if(itemName=="Paneer Tikka"){
            totalPrice=269.0*quantity;
        }else if(itemName=="Chicken Tikka"){
            totalPrice=299.0*quantity;
        }else if(itemName=="Butter Naan"){
            totalPrice=49.0*quantity;
        }else if(itemName=="Garlic Naan"){
            totalPrice=59.0*quantity;
        }else if(itemName=="Butter Chicken"){
            totalPrice=349.0*quantity;
        }else if(itemName=="Palak Paneer"){
            totalPrice=239.0*quantity;
        }else if(itemName=="Dal Fry"){
            totalPrice=159.0*quantity;
        }else if(itemName=="Jeera Rice"){
            totalPrice=139.0*quantity;
        }else if(itemName=="Tandoori Roti"){
            totalPrice=30.0*quantity;
        }else if(itemName=="Chilli Chicken"){
            totalPrice=249.0*quantity;
        }else if(itemName=="Chicken 65"){
            totalPrice=259.0*quantity;
        }else if(itemName=="Fish Fry"){
            totalPrice=329.0*quantity;
        }else if(itemName=="Prawn Fry"){
            totalPrice=399.0*quantity;
        }else if(itemName=="Mushroom Curry"){
            totalPrice=229.0*quantity;
        }else if(itemName=="Veg Meals"){
            totalPrice=199.0*quantity;
        }

        return totalPrice;
    }

    public static void main(String[] args){

        double price = search("Chicken Biryani");
        System.out.println("The Price of Chicken Biryani is " + price);

        double totalPrice = search("Chicken Biryani",3);
        System.out.println("The Total Price of 3 Chicken Biryani is " + totalPrice);

    }
}