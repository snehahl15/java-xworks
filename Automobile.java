class Automobile {

    public static String getBrand()	{
		String brand="Toyota";
        return brand;
    }

    public static String getModel() {
		String model="Fortuner";
        return model;
    }

    public static String getEngine() {
		String engine="2.8L Diesel";
        return engine;
    }

    public static String getColor() {
		String color="White";
        return color;
    }

    public static int getPrice()	{
		int price=3500000;
        return price;
    }

    public static void main(String[] args) {

        String brand = getBrand();
        String model = getModel();
        String engine = getEngine();
        String color = getColor();
        int price = getPrice();

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);

    }

}