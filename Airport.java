class Airport {

    static String passengerName;
    static String flightNumber;
    static String source;
    static String destination;
    static String seatNumber;
    static long passportNumber;
    static double ticketPrice;
    static boolean isTicketBooked;

    public static boolean createFlightBooking(
            String pName,
            String fNumber,
            String from,
            String to,
            String seat,
            long passportNo,
            double price,
            boolean booked) {

        isTicketBooked = false;

        passengerName = pName;
        flightNumber = fNumber;
        source = from;
        destination = to;
        seatNumber = seat;
        passportNumber = passportNo;
        ticketPrice = price;

        isTicketBooked = booked;

        return isTicketBooked;
    }

    public static void fetchFlightBookingDetails() {

        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Flight Number  : " + flightNumber);
        System.out.println("Source         : " + source);
        System.out.println("Destination    : " + destination);
        System.out.println("Seat Number    : " + seatNumber);
        System.out.println("Passport No    : " + passportNumber);
        System.out.println("Ticket Price   : " + ticketPrice);
        System.out.println("Ticket Booked  : " + isTicketBooked);
        System.out.println("---------------------------------------");
    }
}