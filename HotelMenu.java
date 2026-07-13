class HotelMenu {

    public static void main(String[] args) {


        String hotelName = "Udupi Grand Hotel";
        String location = "Bangalore";
        String category = "South Indian Restaurant";


        String[] menu = {

            "Masala Dosa",
            "Idli Vada",
            "Poori Sagu",
            "Bisi Bele Bath",
            "Veg Fried Rice",
            "Paneer Butter Masala",
            "South Indian Meals",
            "Filter Coffee"

        };


        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Location: " + location);
        System.out.println("Category: " + category);


        System.out.println("Menu Items:");

        for(String food : menu){

            System.out.println(food);

        }

    }
}