class TamilnaduTemples {

    public static void main(String[] args) {


        String stateName = "Tamil Nadu";
        String famousFor = "Ancient Temples";
        String location = "South India";


        String[] temples = {
            "Meenakshi Amman Temple - Madurai",
            "Brihadeeswarar Temple - Thanjavur",
            "Ramanathaswamy Temple - Rameswaram",
            "Kamakshi Amman Temple - Kanchipuram",
            "Arunachaleswarar Temple - Tiruvannamalai",
            "Sri Ranganathaswamy Temple - Srirangam",
            "Ekambareswarar Temple - Kanchipuram",
            "Palani Murugan Temple - Palani",
            "Kapaleeshwarar Temple - Chennai",
            "Thillai Nataraja Temple - Chidambaram"
        };


        System.out.println("State Name: " + stateName);
        System.out.println("Famous For: " + famousFor);
        System.out.println("Location: " + location);


        System.out.println("Tamil Nadu Temples:");

        for(String temple : temples){

            System.out.println(temple);

        }

    }
}