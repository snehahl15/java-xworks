public class SmartLight {
    // 3 Instance Variables (No private keyword)
    String brand;
    int brightnessPercentage;
    boolean isColorFluorescent;

    // Constructor to set initial values
    public SmartLight(String lightBrand, int brightness, boolean fluorescent) {
        brand = lightBrand;
        brightnessPercentage = brightness;
        isColorFluorescent = fluorescent;
    }

    // Void method performing an action
    public void turnOn() {
        System.out.println("The " + brand + " light bulb is now glowing at " + brightnessPercentage + "% brightness.");
    }
}
