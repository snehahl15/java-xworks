class Terminal {

    String terminalName;
    int totalGates;
    boolean hasInternationalCustoms;
    int currentPassengerCount;
    String terminalType;
    String terminalManager;

    public void printDetails() {

        System.out.println("Terminal Name: " + terminalName);
        System.out.println("Total Gates: " + totalGates);
        System.out.println("International Customs: " + hasInternationalCustoms);
        System.out.println("Current Passenger Count: " + currentPassengerCount);
        System.out.println("Terminal Type: " + terminalType);
        System.out.println("Terminal Manager: " + terminalManager);
    }
}