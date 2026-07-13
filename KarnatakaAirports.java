class KarnatakaAirports {

    public static void main(String[] args) {


        String stateName = "Karnataka";
        String stateCapital = "Bangalore";
        String famousFor = "IT Hub and Aviation Connectivity";


        String[] airports = {
            "Kempegowda International Airport - Bangalore",
            "Mangalore International Airport - Mangalore",
            "Hubli Airport - Hubli",
            "Belagavi Airport - Belagavi",
            "Mysore Airport - Mysore",
            "Kalaburagi Airport - Kalaburagi",
            "Bidar Airport - Bidar",
            "Shivamogga Airport - Shivamogga"
        };


        System.out.println("State Name: " + stateName);
        System.out.println("Capital: " + stateCapital);
        System.out.println("Famous For: " + famousFor);


        System.out.println("Karnataka Airports:");

        for(String airport : airports){

            System.out.println(airport);

        }

    }
}