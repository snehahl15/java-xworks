public class SmartHomeRunner {
    
    public static void main(String[] args) {
        // 1. Create the SmartLight object with its 3 specific values
        SmartLight philipsHue = new SmartLight("Philips Hue", 85, false);
        
        // 2. Create the SmartHome object, passing the light object and 2 other values
        SmartHome myHome = new SmartHome(philipsHue, "Alex", 12);
        
        // 3. Trigger the void system routine
        myHome.activateNightMode();

        // 4. Proving direct package access to variables across both classes
        System.out.println("\n--- Direct Variable Verification ---");
        System.out.println("Owner: " + myHome.homeOwnerName);
        System.out.println("Light Brand: " + myHome.livingRoomLight.brand);
        System.out.println("Is Fluorescent: " + myHome.livingRoomLight.isColorFluorescent);
    }
}
