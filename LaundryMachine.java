class LaundryMachine {

    static boolean isOn;
    static int currentWaterLevel;
    static int minWaterLevel;
    static int maxWaterLevel = 5;

    public static void onOrOff() {

        if (isOn == false) {
            isOn = true;
            System.out.println("Washing Machine is ON...");
        } else {
            isOn = false;
            System.out.println("Washing Machine is OFF...");
        }

    }

    public static void increaseWaterLevel() {

        if (isOn == true) {

            if (currentWaterLevel < maxWaterLevel) {
                currentWaterLevel = currentWaterLevel + 1;
                System.out.println("Current Water Level is: " + currentWaterLevel);
            } else {
                System.out.println("Maximum Water Level is Reached...");
            }

        } else {
            System.out.println("Please Turn ON the Washing Machine...");
        }

    }

    public static void decreaseWaterLevel() {

        if (isOn == true) {

            if (currentWaterLevel > minWaterLevel) {
                currentWaterLevel = currentWaterLevel - 1;
                System.out.println("Current Water Level is: " + currentWaterLevel);
            } else {
                System.out.println("Minimum Water Level is Reached...");
            }

        } else {
            System.out.println("Please Turn ON the Washing Machine...");
        }

    }



}