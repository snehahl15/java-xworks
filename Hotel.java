class Hotel {

    int hotelId;
    String hotelName;
    String location;
    String ownerName;
    int numberOfRooms;
    double rating;

    Floor floor;

    public void getHotelDetails() {

        System.out.println("Hotel ID: " + hotelId);
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Location: " + location);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Rating: " + rating);

        floor.getFloorDetails();
    }
}