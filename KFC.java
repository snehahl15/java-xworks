class KFC {

    public static double search(String itemName){

        double price = 0.0;

        if(itemName=="Hot Wings"){
            price=199.0;
        }else if(itemName=="Crispy Chicken"){
            price=249.0;
        }else if(itemName=="Chicken Popcorn"){
            price=179.0;
        }else if(itemName=="Chicken Strips"){
            price=219.0;
        }else if(itemName=="Chicken Bucket"){
            price=699.0;
        }else if(itemName=="Zinger Burger"){
            price=229.0;
        }else if(itemName=="Veg Zinger"){
            price=189.0;
        }else if(itemName=="Chicken Roll"){
            price=159.0;
        }else if(itemName=="Veg Roll"){
            price=129.0;
        }else if(itemName=="French Fries"){
            price=109.0;
        }else if(itemName=="Peri Peri Fries"){
            price=129.0;
        }else if(itemName=="Chicken Nuggets"){
            price=199.0;
        }else if(itemName=="Veg Nuggets"){
            price=169.0;
        }else if(itemName=="Chicken Wrap"){
            price=189.0;
        }else if(itemName=="Veg Wrap"){
            price=159.0;
        } else if(itemName=="Rice Bowl"){
            price=179.0;
        }else if(itemName=="Chicken Rice Bowl"){
            price=229.0;
        }else if(itemName=="Veg Rice Bowl"){
            price=169.0;
        }else if(itemName=="Chocolate Sundae"){
            price=99.0;
        }else if(itemName=="Chocolate Shake"){
            price=149.0;
        }else if(itemName=="Oreo Shake"){
            price=169.0;
        }else if(itemName=="Mojito"){
            price=89.0;
        }else if(itemName=="Lime Soda"){
            price=69.0;
        }else if(itemName=="Orange Juice"){
            price=79.0;
        }else if(itemName=="Chicken Sandwich"){
            price=189.0;
        }else if(itemName=="Veg Sandwich"){
            price=159.0;
        }else if(itemName=="Coleslaw"){
            price=99.0;
        }else if(itemName=="Chicken Salad"){
            price=199.0;
        }else if(itemName=="Veg Salad"){
            price=149.0;
        }else if(itemName=="Brownie"){
            price=119.0;
        }

        return price;
    }

     public static double search(String itemName, int quantity){

        double totalPrice = 0.0;

        if(itemName=="Hot Wings"){
            totalPrice=199.0*quantity;
        }else if(itemName=="Crispy Chicken"){
            totalPrice=249.0*quantity;
        }else if(itemName=="Chicken Popcorn"){
            totalPrice=179.0*quantity;
        }else if(itemName=="Chicken Strips"){
            totalPrice=219.0*quantity;
        }else if(itemName=="Chicken Bucket"){
            totalPrice=699.0*quantity;
        }else if(itemName=="Zinger Burger"){
            totalPrice=229.0*quantity;
        }else if(itemName=="Veg Zinger"){
            totalPrice=189.0*quantity;
        }else if(itemName=="Chicken Roll"){
            totalPrice=159.0*quantity;
        }else if(itemName=="Veg Roll"){
            totalPrice=129.0*quantity;
        }else if(itemName=="French Fries"){
            totalPrice=109.0*quantity;
        }else if(itemName=="Peri Peri Fries"){
            totalPrice=129.0*quantity;
        }else if(itemName=="Chicken Nuggets"){
            totalPrice=199.0*quantity;
        }else if(itemName=="Veg Nuggets"){
            totalPrice=169.0*quantity;
        }else if(itemName=="Chicken Wrap"){
            totalPrice=189.0*quantity;
        }else if(itemName=="Veg Wrap"){
            totalPrice=159.0*quantity;
        }else if(itemName=="Rice Bowl"){
            totalPrice=179.0*quantity;
        }else if(itemName=="Chicken Rice Bowl"){
            totalPrice=229.0*quantity;
        }else if(itemName=="Veg Rice Bowl"){
            totalPrice=169.0*quantity;
        }else if(itemName=="Chocolate Sundae"){
            totalPrice=99.0*quantity;
        }else if(itemName=="Chocolate Shake"){
            totalPrice=149.0*quantity;
        }else if(itemName=="Oreo Shake"){
            totalPrice=169.0*quantity;
        }else if(itemName=="Mojito"){
            totalPrice=89.0*quantity;
        }else if(itemName=="Lime Soda"){
            totalPrice=69.0*quantity;
        }else if(itemName=="Orange Juice"){
            totalPrice=79.0*quantity;
        }else if(itemName=="Chicken Sandwich"){
            totalPrice=189.0*quantity;
        }else if(itemName=="Veg Sandwich"){
            totalPrice=159.0*quantity;
        }else if(itemName=="Coleslaw"){
            totalPrice=99.0*quantity;
        }else if(itemName=="Chicken Salad"){
            totalPrice=199.0*quantity;
        }else if(itemName=="Veg Salad"){
            totalPrice=149.0*quantity;
        }else if(itemName=="Brownie"){
            totalPrice=119.0*quantity;
        }

        return totalPrice;
    }

    public static void main(String[] args){
		String itemName="Chicken Bucket";

        double price = search(itemName);
        System.out.println("The Price of Chicken Bucket is " + price);

        double totalPrice = search("Chicken Bucket", 2);
        System.out.println("The Total Price of 2 Chicken Bucket is " + totalPrice);

    }

}