class Wallet {

    public static String getBrand() {
        return "WildHorn";
    }

    public static String getColor() {
        return "Brown";
    }

    public static String getMaterial() {
        return "Leather";
    }

    public static String getType() {
        return "Bi-Fold";
    }

    public static int getPrice() {
        return 999;
    }

    public static void main(String[] args) {

        String brand = getBrand();
        String color = getColor();
        String material = getMaterial();
        String type = getType();
        int price = getPrice();

        System.out.println("The Brand is " + brand);
        System.out.println("The Color is " + color);
        System.out.println("The Material is " + material);
        System.out.println("The Type is " + type);
        System.out.println("The Price is " + price);

    }

}