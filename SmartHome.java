public class SmartHome {
    // 3 Instance Variables (No private keyword)
    SmartLight livingRoomLight; // 1st variable establishes the HAS-A relationship
    String homeOwnerName;       // 2nd variable
    int totalSmartDevices;      // 3rd variable

    // Constructor to set initial values
    public SmartHome(SmartLight light, String owner, int deviceCount) {
        livingRoomLight = light;
        homeOwnerName = owner;
        totalSmartDevices = deviceCount;
    }

    // Void method utilizing the HAS-A relationship
    public void activateNightMode() {
        System.out.println("Welcome home, " + homeOwnerName + "!");
        System.out.println("Checking your " + totalSmartDevices + " smart devices...");
        System.out.println("Activating night mode routine...");
        
        // Delegating work to the SmartLight instance variable
        livingRoomLight.turnOn(); 
    }
}
