class HotelRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        // Creating Hotel object
        Hotel hotel = new Hotel();

        // Assigning Hotel details
        hotel.hotelId = 101;
        hotel.hotelName = "Taj Hotel";
        hotel.location = "Bangalore";
        hotel.ownerName = "TATA Group";
        hotel.numberOfRooms = 100;
        hotel.rating = 4.5;

        // Creating Floor object
        Floor floor = new Floor();

        // Assigning Floor details
        floor.floorNumber = 1;
        floor.floorName = "Ground Floor";
        floor.numberOfRooms = 25;
        floor.numberOfDoors = 10;
        floor.floorType = "Luxury";
        floor.floorManager = "Suresh";
		
		//hotel is dependent on floor
		
		hotel.floor=floor;

        // Calling Hotel method
        hotel.getHotelDetails();

        System.out.println("Main ended");
    }
}