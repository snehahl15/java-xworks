class Franchise {

    String franchiseName;
    int matches;
    int wins;
    int losses;
    String nrr;
    int points;
    String[] lastFive;

    Franchise(String franchiseName, int matches, int wins, int losses,
              String nrr, int points, String[] lastFive) {

        this.franchiseName = franchiseName;
        this.matches = matches;
        this.wins = wins;
        this.losses = losses;
        this.nrr = nrr;
        this.points = points;
        this.lastFive = lastFive;
    }

    public void franchiseInfo() {

        System.out.print(
            franchiseName + "    " +
            matches + "    " +
            wins + "    " +
            losses + "    " +
            nrr + "    " +
            points + "    "
        );

        for (String result : lastFive) {
            System.out.print(result + " ");
        }

        System.out.println();
    }
}