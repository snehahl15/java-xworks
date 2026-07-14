class Shades {

    public static void getBrand() {
        return "Ray-Ban";
    }

    public static String getModel() {
        return "Aviator Classic";
    }

    public static int getPrice() {
        return 15000;
    }

    public static void main(String[] args) {

        String brand = getBrand();
        String model = getModel();
        int price = getPrice();

        System.out.println("The Brand is " + brand);
        System.out.println("The Model is " + model);
        System.out.println("The Price is " + price);

    }

}