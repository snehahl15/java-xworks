class Swiggy {

    public static double search(String itemName) {

        double price = 0.0;

        if(itemName=="Masala Dosa"){
            price=90.0;
        }else if(itemName=="Plain Dosa"){
            price=70.0;
        }else if(itemName=="Rava Dosa"){
            price=110.0;
        }else if(itemName=="Onion Dosa"){
            price=120.0;
        }else if(itemName=="Mysore Dosa"){
            price=130.0;
        }else if(itemName=="Idli"){
            price=50.0;
        }else if(itemName=="Vada"){
            price=45.0;
        }else if(itemName=="Pongal"){
            price=80.0;
        }else if(itemName=="Poori"){
            price=75.0;
        }else if(itemName=="Chapati"){
            price=40.0;
        }else if(itemName=="Parotta"){
            price=60.0;
        }else if(itemName=="Lemon Rice"){
            price=85.0;
        }else if(itemName=="Curd Rice"){
            price=70.0;
        }else if(itemName=="Tomato Rice"){
            price=80.0;
        }else if(itemName=="Bisibele Bath"){
            price=95.0;
        }
		        else if(itemName=="Puliyogare"){
            price=90.0;
        }else if(itemName=="Khara Bath"){
            price=80.0;
        }else if(itemName=="Kesari Bath"){
            price=75.0;
        }else if(itemName=="Upma"){
            price=60.0;
        }else if(itemName=="Avalakki"){
            price=65.0;
        }else if(itemName=="Akki Roti"){
            price=95.0;
        }else if(itemName=="Ragi Mudde"){
            price=85.0;
        }else if(itemName=="Jolada Rotti"){
            price=90.0;
        }else if(itemName=="Sambar"){
            price=50.0;
        }else if(itemName=="Rasam"){
            price=45.0;
        }else if(itemName=="Curd Vada"){
            price=70.0;
        }else if(itemName=="Medu Vada"){
            price=55.0;
        }else if(itemName=="Set Dosa"){
            price=90.0;
        }else if(itemName=="Neer Dosa"){
            price=100.0;
        }else if(itemName=="Pesarattu"){
            price=110.0;
        }

        return price;
    }

    public static double search(String itemName,int quantity){

        double totalPrice=0.0;

        if(itemName=="Masala Dosa"){
            totalPrice=90.0*quantity;
        }else if(itemName=="Plain Dosa"){
            totalPrice=70.0*quantity;
        }else if(itemName=="Rava Dosa"){
            totalPrice=110.0*quantity;
        }else if(itemName=="Onion Dosa"){
            totalPrice=120.0*quantity;
        }else if(itemName=="Mysore Dosa"){
            totalPrice=130.0*quantity;
        }else if(itemName=="Idli"){
            totalPrice=50.0*quantity;
        }else if(itemName=="Vada"){
            totalPrice=45.0*quantity;
        }else if(itemName=="Pongal"){
            totalPrice=80.0*quantity;
        }else if(itemName=="Poori"){
            totalPrice=75.0*quantity;
        }else if(itemName=="Chapati"){
            totalPrice=40.0*quantity;
        }else if(itemName=="Parotta"){
            totalPrice=60.0*quantity;
        }else if(itemName=="Lemon Rice"){
            totalPrice=85.0*quantity;
        }else if(itemName=="Curd Rice"){
            totalPrice=70.0*quantity;
        }else if(itemName=="Tomato Rice"){
            totalPrice=80.0*quantity;
        }else if(itemName=="Bisibele Bath"){
            totalPrice=95.0*quantity;
        }else if(itemName=="Puliyogare"){
            totalPrice=90.0*quantity;
        }else if(itemName=="Khara Bath"){
            totalPrice=80.0*quantity;
        }else if(itemName=="Kesari Bath"){
            totalPrice=75.0*quantity;
        }else if(itemName=="Upma"){
            totalPrice=60.0*quantity;
        }else if(itemName=="Avalakki"){
            totalPrice=65.0*quantity;
        }else if(itemName=="Akki Roti"){
            totalPrice=95.0*quantity;
        }else if(itemName=="Ragi Mudde"){
            totalPrice=85.0*quantity;
        }else if(itemName=="Jolada Rotti"){
            totalPrice=90.0*quantity;
        }else if(itemName=="Sambar"){
            totalPrice=50.0*quantity;
        }else if(itemName=="Rasam"){
            totalPrice=45.0*quantity;
        }else if(itemName=="Curd Vada"){
            totalPrice=70.0*quantity;
        }else if(itemName=="Medu Vada"){
            totalPrice=55.0*quantity;
        }else if(itemName=="Set Dosa"){
            totalPrice=90.0*quantity;
        }else if(itemName=="Neer Dosa"){
            totalPrice=100.0*quantity;
        }else if(itemName=="Pesarattu"){
            totalPrice=110.0*quantity;
        }

        return totalPrice;
    }

    public static void main(String[] args){

        double price = search("Masala Dosa");
        System.out.println("The Price of Masala Dosa is " + price);

        double totalPrice = search("Masala Dosa", 2);
        System.out.println("The Total Price of 2 Masala Dosa is " + totalPrice);

    }

}