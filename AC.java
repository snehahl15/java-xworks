class AC {

    static boolean isOn;
    static int currentTemperature = 24;
    static int minTemperature = 16;
    static int maxTemperature = 30;

    public static void onOrOff() {

        if (isOn == false) {
            isOn = true;
            System.out.println("Air Conditioner is ON...");
        } else {
            isOn = false;
            System.out.println("Air Conditioner is OFF...");
        }

    }

    public static void increaseTemperature() {

        if (isOn == true) {

            if (currentTemperature < maxTemperature) {
                currentTemperature = currentTemperature + 1;
                System.out.println("Current Temperature is: " + currentTemperature);
            } else {
                System.out.println("Maximum Temperature is Reached...");
            }

        } else {
            System.out.println("Please Turn ON the Air Conditioner...");
        }

    }

    public static void decreaseTemperature() {

        if (isOn == true) {

            if (currentTemperature > minTemperature) {
                currentTemperature = currentTemperature - 1;
                System.out.println("Current Temperature is: " + currentTemperature);
            } else {
                System.out.println("Minimum Temperature is Reached...");
            }

        } else {
            System.out.println("Please Turn ON the Air Conditioner...");
        }

    }

    public static void main(String[] args) {

        System.out.println(isOn);

        onOrOff();
        System.out.println(isOn);

        increaseTemperature();
        increaseTemperature();
        increaseTemperature();

        decreaseTemperature();
        decreaseTemperature();
        decreaseTemperature();
        decreaseTemperature();
        decreaseTemperature();

        onOrOff();
        System.out.println(isOn);

    }

}