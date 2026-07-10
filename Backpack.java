class Backpack {

    public static String getBrand() {
        return "Wildcraft";
    }

    public static String getColor() {
        return "Blue";
    }

    public static String getCapacity() {
        return "35 Litres";
    }

    public static String getMaterial() {
        return "Polyester";
    }

    public static int getPrice() {
        return 1899;
    }

    public static void main(String[] args) {

        String anyThing= getBrand();
        String color = getColor();
        String capacity = getCapacity();
        String material = getMaterial();
        int price = getPrice();

        System.out.println("The Brand is " + anyThing);
        System.out.println("The Color is " + color);
        System.out.println("The Capacity is " + capacity);
        System.out.println("The Material is " + material);
        System.out.println("The Price is " + price);

    }

}