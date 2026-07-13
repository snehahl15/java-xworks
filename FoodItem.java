class FoodItem {

    public static void main(String[] args) {


        String itemName = "Pizza";
        String category = "Fast Food";
        String origin = "Italy";


        String[] ingredients = {
            "Flour",
            "Tomato Sauce",
            "Cheese",
            "Onion",
            "Capsicum",
            "Olives",
            "Spices"
        };


        System.out.println("Item Name: " + itemName);
        System.out.println("Category: " + category);
        System.out.println("Origin: " + origin);


        System.out.println("Ingredients:");

        for(String ingredient : ingredients){

            System.out.println(ingredient);

        }

    }
}