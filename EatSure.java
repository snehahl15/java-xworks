class EatSure {

    public static double search(String itemName){

        double price = 0.0;

        if(itemName=="Chocolate Cake"){
            price=450.0;
        }else if(itemName=="Black Forest Cake"){
            price=500.0;
        }else if(itemName=="Red Velvet Cake"){
            price=650.0;
        }else if(itemName=="Vanilla Cake"){
            price=400.0;
        }else if(itemName=="Pineapple Cake"){
            price=480.0;
        }else if(itemName=="Chocolate Ice Cream"){
            price=120.0;
        }else if(itemName=="Vanilla Ice Cream"){
            price=100.0;
        }else if(itemName=="Butterscotch Ice Cream"){
            price=130.0;
        }else if(itemName=="Strawberry Ice Cream"){
            price=140.0;
        }else if(itemName=="Mango Ice Cream"){
            price=150.0;
        }else if(itemName=="Gulab Jamun"){
            price=90.0;
        }else if(itemName=="Rasgulla"){
            price=100.0;
        }else if(itemName=="Jalebi"){
            price=110.0;
        }else if(itemName=="Mysore Pak"){
            price=180.0;
        }else if(itemName=="Kaju Katli"){
            price=220.0;
        }else if(itemName=="Laddu"){
            price=160.0;
        }else if(itemName=="Rasmalai"){
            price=180.0;
        }else if(itemName=="Brownie"){
            price=150.0;
        }else if(itemName=="Donut"){
            price=90.0;
        }else if(itemName=="Muffin"){
            price=80.0;
        }else if(itemName=="Pastry"){
            price=110.0;
        }else if(itemName=="Cupcake"){
            price=70.0;
        }else if(itemName=="Apple Pie"){
            price=190.0;
        }else if(itemName=="Fruit Salad"){
            price=120.0;
        }else if(itemName=="Falooda"){
            price=140.0;
        }else if(itemName=="Kulfi"){
            price=90.0;
        }else if(itemName=="Milkshake"){
            price=130.0;
        }else if(itemName=="Cold Coffee"){
            price=150.0;
        }else if(itemName=="Fresh Lime Juice"){
            price=80.0;
        }else if(itemName=="Smoothie"){
            price=170.0;
        }

        return price;
    }

    public static double search(String itemName,int quantity){

        double totalPrice = 0.0;

        if(itemName=="Chocolate Cake"){
            totalPrice=450.0*quantity;
        }else if(itemName=="Black Forest Cake"){
            totalPrice=500.0*quantity;
        }else if(itemName=="Red Velvet Cake"){
            totalPrice=650.0*quantity;
        }else if(itemName=="Vanilla Cake"){
            totalPrice=400.0*quantity;
        }else if(itemName=="Pineapple Cake"){
            totalPrice=480.0*quantity;
        }else if(itemName=="Chocolate Ice Cream"){
            totalPrice=120.0*quantity;
        }else if(itemName=="Vanilla Ice Cream"){
            totalPrice=100.0*quantity;
        }else if(itemName=="Butterscotch Ice Cream"){
            totalPrice=130.0*quantity;
        }else if(itemName=="Strawberry Ice Cream"){
            totalPrice=140.0*quantity;
        }else if(itemName=="Mango Ice Cream"){
            totalPrice=150.0*quantity;
        }else if(itemName=="Gulab Jamun"){
            totalPrice=90.0*quantity;
        }else if(itemName=="Rasgulla"){
            totalPrice=100.0*quantity;
        }else if(itemName=="Jalebi"){
            totalPrice=110.0*quantity;
        }else if(itemName=="Mysore Pak"){
            totalPrice=180.0*quantity;
        }else if(itemName=="Kaju Katli"){
            totalPrice=220.0*quantity;
        }else if(itemName=="Laddu"){
            totalPrice=160.0*quantity;
        }else if(itemName=="Rasmalai"){
            totalPrice=180.0*quantity;
        }else if(itemName=="Brownie"){
            totalPrice=150.0*quantity;
        }else if(itemName=="Donut"){
            totalPrice=90.0*quantity;
        }else if(itemName=="Muffin"){
            totalPrice=80.0*quantity;
        }else if(itemName=="Pastry"){
            totalPrice=110.0*quantity;
        }else if(itemName=="Cupcake"){
            totalPrice=70.0*quantity;
        }else if(itemName=="Apple Pie"){
            totalPrice=190.0*quantity;
        }else if(itemName=="Fruit Salad"){
            totalPrice=120.0*quantity;
        }else if(itemName=="Falooda"){
            totalPrice=140.0*quantity;
        }else if(itemName=="Kulfi"){
            totalPrice=90.0*quantity;
        }else if(itemName=="Milkshake"){
            totalPrice=130.0*quantity;
        }else if(itemName=="Cold Coffee"){
            totalPrice=150.0*quantity;
        }else if(itemName=="Fresh Lime Juice"){
            totalPrice=80.0*quantity;
        }else if(itemName=="Smoothie"){
            totalPrice=170.0*quantity;
        }

        return totalPrice;
    }

    public static void main(String[] args){

        double price = search("Chocolate Cake");
        System.out.println("The Price of Chocolate Cake is " + price);

        double totalPrice = search("Chocolate Cake", 2);
        System.out.println("The Total Price of 2 Chocolate Cake is " + totalPrice);

    }

}