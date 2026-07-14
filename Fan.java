class Fan {

    static boolean isOn;
    static int currentSpeed;
    static int minSpeed;
    static int maxSpeed = 5;

    public static void onOrOff() {

        if (isOn == false) {
            isOn = true;
            System.out.println("Fan is ON...");
        } else {
            isOn = false;
            System.out.println("Fan is OFF...");
        }

    }

    public static void increaseSpeed() {

        if (isOn == true) {

            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Current Speed is: " + currentSpeed);
            } else {
                System.out.println("Maximum Speed is Reached...");
            }

        } else {
            System.out.println("Please Turn ON the Fan...");
        }

    }

    public static void decreaseSpeed() {

        if (isOn == true) {

            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Current Speed is: " + currentSpeed);
            } else {
                System.out.println("Minimum Speed is Reached...");
            }

        } else {
            System.out.println("Please Turn ON the Fan...");
        }

    }

   

}