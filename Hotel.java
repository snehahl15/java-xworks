class Hotel{
	static String customerName;
	static long mobileNumber;
	static String email;
	static String roomType;
	static int roomNumber;
	static int numberOfDays;
	static double roomRent;
	static String paymentMethod;
	static boolean isRoomBooked;


public static boolean createHotelBooking(
                          String customer,
                           long mobile,
                           String mail,
                           String room,
                           int roomNo,
                           int days,
                           double rent,
                         String payment){
	isRoomBooked=false;
	customerName=customer;
	mobileNumber=mobile;
	email=mail;
	roomType=room;
	roomNumber=roomNo;
	numberOfDays=days;
	roomRent=rent;
	paymentMethod=payment;
	isRoomBooked=true;
	return isRoomBooked;
}
 public static void fetchHotelBookingDetails(){
	 

    System.out.println("Booking Status : " + isRoomBooked);
    System.out.println("Customer Name : " + customerName);
    System.out.println("Mobile Number : " + mobileNumber);
    System.out.println("Email ID : " + email);
    System.out.println("Room Type : " + roomType);
    System.out.println("Room Number : " + roomNumber);
    System.out.println("Number of Days : " + numberOfDays);
    System.out.println("Room Rent : " + roomRent);
    System.out.println("Payment Method : " + paymentMethod);
}




}