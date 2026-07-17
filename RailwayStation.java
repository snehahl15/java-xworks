class RailwayStation{
static String passengerName;
static String trainName;
static int trainNumber;
static String sourceStation;
static String destinationStation;
static String coachType;
static double ticketFare;
static boolean isTicketBooked;


public static boolean createTicketBooking(
    String pName,
    String tName,
    int tNumber,
    String source,
    String destination,
    String coach,
    double fare,
    boolean booked){
		
		isTicketBooked = false;

    passengerName = pName;
    trainName = tName;
    trainNumber = tNumber;
    sourceStation = source;
    destinationStation = destination;
    coachType = coach;
    ticketFare = fare;

    isTicketBooked = booked;

    return isTicketBooked;

	}
	public static void fetchTicketBookingDetails(){
		
		
    System.out.println("Passenger Name      : " + passengerName);
    System.out.println("Train Name          : " + trainName);
    System.out.println("Train Number        : " + trainNumber);
    System.out.println("Source Station      : " + sourceStation);
    System.out.println("Destination Station : " + destinationStation);
    System.out.println("Coach Type          : " + coachType);
    System.out.println("Ticket Fare         : " + ticketFare);
    System.out.println("Ticket Booked       : " + isTicketBooked);
    System.out.println("----------------------------------------");
}

}