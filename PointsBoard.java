class PointsBoard {

    Tournament[] tournaments;

    public void pointsBoardInfo() {

        for (Tournament tournament : tournaments) {
            tournament.tournamentInfo();
        }
    }
}