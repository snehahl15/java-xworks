class Showroom {

    static String customerName;
    static String vehicleBrand;
    static String vehicleModel;
    static String vehicleColor;
    static double vehiclePrice;
    static long mobileNumber;
    static String paymentMode;
    static boolean isVehicleBooked;

    public static boolean bookVehicle(
            String cName,
            String brand,
            String model,
            String color,
            double price,
            long phoneNumber,
            String payment,
            boolean booked) {

        isVehicleBooked = false;

        customerName = cName;
        vehicleBrand = brand;
        vehicleModel = model;
        vehicleColor = color;
        vehiclePrice = price;
        mobileNumber = phoneNumber;
        paymentMode = payment;

        isVehicleBooked = booked;

        return isVehicleBooked;
    }

    public static void fetchVehicleBookingDetails() {

        System.out.println("Customer Name     : " + customerName);
        System.out.println("Vehicle Brand     : " + vehicleBrand);
        System.out.println("Vehicle Model     : " + vehicleModel);
        System.out.println("Vehicle Color     : " + vehicleColor);
        System.out.println("Vehicle Price     : " + vehiclePrice);
        System.out.println("Mobile Number     : " + mobileNumber);
        System.out.println("Payment Mode      : " + paymentMode);
        System.out.println("Vehicle Booked    : " + isVehicleBooked);
        System.out.println("------------------------------------------");
    }
}