class Agriculture {

    public static void main(String[] args) {


        String farmName = "Green Valley Farm";
        String location = "Karnataka";
        String farmingType = "Organic Farming";

String[] farmingTools = {

    "Tractor",
    "Plough",
    "Seed Drill",
    "Water Pump",
    "Sprayer",
    "Harvester Machine",
    "Cultivator",
    "Sickle",
    "Hoe",
    "Shovel",
    "Spade",
    "Rake",
    "Wheelbarrow",
    "Threshing Machine",
    "Rotavator",
    "Drip Irrigation System",
    "Crop Cutter",
    "Fertilizer Spreader",
    "Power Tiller",
    "Plucking Machine"

};

        System.out.println("Farm Name: " + farmName);
        System.out.println("Location: " + location);
        System.out.println("Farming Type: " + farmingType);


        System.out.println("Farming Tools:");

        for(String tool : farmingTools){

            System.out.println(tool);

        }

    }
}