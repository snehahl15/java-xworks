class AmusementPark {

    static String visitorName;
    static int ticketNumber;
    static String rideName;
    static int numberOfPersons;
    static double ticketPrice;
    static String paymentMode;
    static long mobileNumber;
    static boolean isTicketBooked;

    public static boolean bookTicket(
            String vName,
            int tNumber,
            String rName,
            int persons,
            double price,
            String payment,
            long phoneNumber,
            boolean booked) {

        isTicketBooked = false;

        visitorName = vName;
        ticketNumber = tNumber;
        rideName = rName;
        numberOfPersons = persons;
        ticketPrice = price;
        paymentMode = payment;
        mobileNumber = phoneNumber;

        isTicketBooked = booked;

        return isTicketBooked;
    }

    public static void fetchTicketDetails() {

        System.out.println("Visitor Name      : " + visitorName);
        System.out.println("Ticket Number     : " + ticketNumber);
        System.out.println("Ride Name         : " + rideName);
        System.out.println("Number of Persons : " + numberOfPersons);
        System.out.println("Ticket Price      : " + ticketPrice);
        System.out.println("Payment Mode      : " + paymentMode);
        System.out.println("Mobile Number     : " + mobileNumber);
        System.out.println("Ticket Booked     : " + isTicketBooked);
        System.out.println("---------------------------------------");
    }
}