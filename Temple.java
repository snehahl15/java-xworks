class Temple {

    static String devoteeName;
    static String templeName;
    static String deityName;
    static String darshanType;
    static int numberOfPersons;
    static double donationAmount;
    static String paymentMode;
    static boolean isDarshanBooked;

    public static boolean bookDarshan(
            String dName,
            String tName,
            String deity,
            String dType,
            int persons,
            double donation,
            String payment,
            boolean booked) {

        isDarshanBooked = false;

        devoteeName = dName;
        templeName = tName;
        deityName = deity;
        darshanType = dType;
        numberOfPersons = persons;
        donationAmount = donation;
        paymentMode = payment;

        isDarshanBooked = booked;

        return isDarshanBooked;
    }

    public static void fetchDarshanDetails() {

        System.out.println("Devotee Name      : " + devoteeName);
        System.out.println("Temple Name       : " + templeName);
        System.out.println("Deity Name        : " + deityName);
        System.out.println("Darshan Type      : " + darshanType);
        System.out.println("Number of Persons : " + numberOfPersons);
        System.out.println("Donation Amount   : " + donationAmount);
        System.out.println("Payment Mode      : " + paymentMode);
        System.out.println("Darshan Booked    : " + isDarshanBooked);
        System.out.println("-------------------------------------------");
    }
}