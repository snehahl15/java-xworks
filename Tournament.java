class Tournament {

    int year;

    Franchise[] franchises;

    public void tournamentInfo() {

        System.out.println("WPL Season: " + year);

        System.out.println(
            "Franchise    M    W    L    NRR    Pts    Last 5"
        );

        for (Franchise franchise : franchises) {
            franchise.franchiseInfo();
        }
    }
}