class VRLLogistics {
static String customerName;
static String sourceLocation;
static String destinationLocation;
static String parcelType;
static double parcelWeight;
static double deliveryCharge;
static long contactNumber;
static boolean isParcelBooked;


public static boolean createParcelBooking(
String cName,
String source,
String destination,
String pType,
double weight,
long mobile,
double charge,
boolean booked){
	isParcelBooked=false;
customerName=cName;
sourceLocation=source;
destinationLocation=destination;
parcelType=pType;
parcelWeight=weight;
contactNumber=mobile;
deliveryCharge=charge;
isParcelBooked=booked;
return isParcelBooked;
}


public static void fetchParcelBookingDetails(){
System.out.println("Customer: "+customerName);
System.out.println("Source: "+sourceLocation);
System.out.println("Destination: "+destinationLocation);
System.out.println("Parcel Type: "+parcelType);
System.out.println("Weight: "+parcelWeight);
System.out.println("Contact: "+contactNumber);
System.out.println("Charge: "+deliveryCharge);
System.out.println("Booked: "+isParcelBooked);
System.out.println("----------------");
}
}