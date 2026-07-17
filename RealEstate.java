class RealEstate {

    static String customerName;
    static String propertyType;
    static String propertyLocation;
    static double propertyPrice;
    static String ownerName;
    static long mobileNumber;
    static String paymentMode;
    static boolean isPropertyBooked;

    public static boolean bookProperty(
            String cName,
            String pType,
            String pLocation,
            double pPrice,
            String oName,
            long phoneNumber,
            String payment,
            boolean booked) {

        isPropertyBooked = false;

        customerName = cName;
        propertyType = pType;
        propertyLocation = pLocation;
        propertyPrice = pPrice;
        ownerName = oName;
        mobileNumber = phoneNumber;
        paymentMode = payment;

        isPropertyBooked = booked;

        return isPropertyBooked;
    }

    public static void fetchPropertyBookingDetails() {

        System.out.println("Customer Name     : " + customerName);
        System.out.println("Property Type     : " + propertyType);
        System.out.println("Property Location : " + propertyLocation);
        System.out.println("Property Price    : " + propertyPrice);
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Mobile Number     : " + mobileNumber);
        System.out.println("Payment Mode      : " + paymentMode);
        System.out.println("Property Booked   : " + isPropertyBooked);
        System.out.println("-----------------------------------------");
    }
}