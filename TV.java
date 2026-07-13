class TV {

    static boolean isOn;
    static int currentVolume;
    static int minVolume;
    static int maxVolume = 100;

    public static void onOrOff() {

        if (isOn == false) {
            isOn = true;
            System.out.println("Television is ON...");
        } else {
            isOn = false;
            System.out.println("Television is OFF...");
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
            System.out.println("Please Turn ON the Television...");
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
            System.out.println("Please Turn ON the Television...");
        }

    }

    public static void main(String[] args) {

        System.out.println(isOn);

        onOrOff();
        System.out.println(isOn);

        increaseVolume();
        increaseVolume();
        increaseVolume();

        decreaseVolume();
        decreaseVolume();
        decreaseVolume();
        decreaseVolume();

        onOrOff();
        System.out.println(isOn);

    }

}