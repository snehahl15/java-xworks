class Speaker {

    static boolean isOn;
    static int currentVolume;
    static int minVolume;
    static int maxVolume = 20;

    public static void onOrOff() {

        if (isOn == false) {
            isOn = true;
            System.out.println("Speaker is ON...");
        } else {
            isOn = false;
            System.out.println("Speaker is OFF...");
        }

    }

    public static void increaseVolume() {

        if (isOn == true) {

            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("Current Volume is: " + currentVolume);
            } else {
                System.out.println("Maximum Volume is Reached...");
            }

        } else {
            System.out.println("Please Turn ON the Speaker...");
        }

    }

    public static void decreaseVolume() {

        if (isOn == true) {

            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("Current Volume is: " + currentVolume);
            } else {
                System.out.println("Minimum Volume is Reached...");
            }

        } else {
            System.out.println("Please Turn ON the Speaker...");
        }

    }

    public static void main(String[] args) {

        System.out.println(isOn);

        onOrOff();
        System.out.println(isOn);

        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();

        decreaseVolume();
        decreaseVolume();
        decreaseVolume();
        decreaseVolume();
        decreaseVolume();

        onOrOff();
        System.out.println(isOn);

    }

}