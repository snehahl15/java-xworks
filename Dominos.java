class Dominos {

    public static double search(String itemName){

        double price = 0.0;

        if(itemName=="Garlic Bread"){
            price=149.0;
        }else if(itemName=="Stuffed Garlic Bread"){
            price=229.0;
        }else if(itemName=="Taco Mexicana"){
            price=189.0;
        }else if(itemName=="Choco Lava Cake"){
            price=119.0;
        }else if(itemName=="Cheese Dip"){
            price=49.0;
        }else if(itemName=="Pepsi"){
            price=60.0;
        }else if(itemName=="7Up"){
            price=60.0;
        }else if(itemName=="Mirinda"){
            price=60.0;
        }else if(itemName=="Mountain Dew"){
            price=60.0;
        }else if(itemName=="Sprite"){
            price=60.0;
        }else if(itemName=="Coke"){
            price=60.0;
        }else if(itemName=="Fanta"){
            price=60.0;
        }else if(itemName=="Veg Pasta"){
            price=179.0;
        }else if(itemName=="White Sauce Pasta"){
            price=199.0;
        }else if(itemName=="Red Sauce Pasta"){
            price=199.0;
        }
		        else if(itemName=="Chicken Pasta"){
            price=229.0;
        }else if(itemName=="Veg Parcel"){
            price=169.0;
        }else if(itemName=="Chicken Parcel"){
            price=199.0;
        }else if(itemName=="Cheese Burst Pizza"){
            price=349.0;
        }else if(itemName=="Mexican Green Wave"){
            price=329.0;
        }else if(itemName=="Indi Tandoori Paneer Pizza"){
            price=369.0;
        }else if(itemName=="Pepper Barbecue Chicken Pizza"){
            price=389.0;
        }else if(itemName=="Chicken Dominator Pizza"){
            price=449.0;
        }else if(itemName=="Veg Extravaganza Pizza"){
            price=399.0;
        }else if(itemName=="Double Cheese Pizza"){
            price=359.0;
        }else if(itemName=="Corn Pizza"){
            price=279.0;
        }else if(itemName=="Cheese Pizza"){
            price=259.0;
        }else if(itemName=="Paneer Makhani Pizza"){
            price=379.0;
        }else if(itemName=="Chicken Sausage Pizza"){
            price=369.0;
        }else if(itemName=="Choco Brownie"){
            price=129.0;
        }

        return price;
    }

    public static double search(String itemName, int quantity){

        double totalPrice = 0.0;

        if(itemName=="Garlic Bread"){
            totalPrice=149.0*quantity;
        }else if(itemName=="Stuffed Garlic Bread"){
            totalPrice=229.0*quantity;
        }else if(itemName=="Taco Mexicana"){
            totalPrice=189.0*quantity;
        }else if(itemName=="Choco Lava Cake"){
            totalPrice=119.0*quantity;
        }else if(itemName=="Cheese Dip"){
            totalPrice=49.0*quantity;
        }else if(itemName=="Pepsi"){
            totalPrice=60.0*quantity;
        }else if(itemName=="7Up"){
            totalPrice=60.0*quantity;
        }else if(itemName=="Mirinda"){
            totalPrice=60.0*quantity;
        }else if(itemName=="Mountain Dew"){
            totalPrice=60.0*quantity;
        }else if(itemName=="Sprite"){
            totalPrice=60.0*quantity;
        }else if(itemName=="Coke"){
            totalPrice=60.0*quantity;
        }else if(itemName=="Fanta"){
            totalPrice=60.0*quantity;
        }else if(itemName=="Veg Pasta"){
            totalPrice=179.0*quantity;
        }else if(itemName=="White Sauce Pasta"){
            totalPrice=199.0*quantity;
        }else if(itemName=="Red Sauce Pasta"){
            totalPrice=199.0*quantity;
        }else if(itemName=="Chicken Pasta"){
            totalPrice=229.0*quantity;
        }else if(itemName=="Veg Parcel"){
            totalPrice=169.0*quantity;
        }else if(itemName=="Chicken Parcel"){
            totalPrice=199.0*quantity;
        }else if(itemName=="Cheese Burst Pizza"){
            totalPrice=349.0*quantity;
        }else if(itemName=="Mexican Green Wave"){
            totalPrice=329.0*quantity;
        }else if(itemName=="Indi Tandoori Paneer Pizza"){
            totalPrice=369.0*quantity;
        }else if(itemName=="Pepper Barbecue Chicken Pizza"){
            totalPrice=389.0*quantity;
        }else if(itemName=="Chicken Dominator Pizza"){
            totalPrice=449.0*quantity;
        }else if(itemName=="Veg Extravaganza Pizza"){
            totalPrice=399.0*quantity;
        }else if(itemName=="Double Cheese Pizza"){
            totalPrice=359.0*quantity;
        }else if(itemName=="Corn Pizza"){
            totalPrice=279.0*quantity;
        }else if(itemName=="Cheese Pizza"){
            totalPrice=259.0*quantity;
        }else if(itemName=="Paneer Makhani Pizza"){
            totalPrice=379.0*quantity;
        }else if(itemName=="Chicken Sausage Pizza"){
            totalPrice=369.0*quantity;
        }else if(itemName=="Choco Brownie"){
            totalPrice=129.0*quantity;
        }

        return totalPrice;
    }

    public static void main(String[] args){

        double price = search("Cheese Burst Pizza");
        System.out.println("The Price of Cheese Burst Pizza is " + price);

        double totalPrice = search("Cheese Burst Pizza", 2);
        System.out.println("The Total Price of 2 Cheese Burst Pizza is " + totalPrice);

    }

}
