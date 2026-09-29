class WPLRunner {

    public static void main(String[] args) {

        // Create WPL object
        WPL wpl = new WPL();

        // Create PointsBoard object
        PointsBoard pointsBoard = new PointsBoard();

        // Create Tournament objects
        Tournament tournament1 = new Tournament();
        Tournament tournament2 = new Tournament();
        Tournament tournament3 = new Tournament();
        Tournament tournament4 = new Tournament();


        
        // TOURNAMENT DETAILS
        

        // WPL 2023
        tournament1.year = 2023;

        // WPL 2024
        tournament2.year = 2024;

        // WPL 2025
        tournament3.year = 2025;

        // WPL 2026
        tournament4.year = 2026;


    
        // WPL 2023
       

        String[] lastFiveMI = {
            "win", "win", "lose", "win", "win"
        };

        Franchise franchise1 = new Franchise(
            "Mumbai Indians",
            8,
            6,
            2,
            "+1.711",
            12,
            lastFiveMI
        );


        String[] lastFiveDC = {
            "win", "lose", "win", "win", "win"
        };

        Franchise franchise2 = new Franchise(
            "Delhi Capitals",
            8,
            6,
            2,
            "+1.856",
            12,
            lastFiveDC
        );


        String[] lastFiveUPW = {
            "lose", "win", "lose", "win", "lose"
        };

        Franchise franchise3 = new Franchise(
            "UP Warriorz",
            8,
            4,
            4,
            "-0.200",
            8,
            lastFiveUPW
        );


        String[] lastFiveRCB = {
            "lose", "lose", "win", "lose", "lose"
        };

        Franchise franchise4 = new Franchise(
            "Royal Challengers Bangalore",
            8,
            2,
            6,
            "-1.137",
            4,
            lastFiveRCB
        );


        String[] lastFiveGG = {
            "lose", "lose", "lose", "win", "lose"
        };

        Franchise franchise5 = new Franchise(
            "Gujarat Giants",
            8,
            2,
            6,
            "-1.048",
            4,
            lastFiveGG
        );


        
        // WPL 2024
      

        String[] lastFiveRCB2024 = {
            "win", "win", "win", "lose", "win"
        };

        Franchise franchise6 = new Franchise(
            "Royal Challengers Bangalore",
            8,
            6,
            2,
            "+0.306",
            12,
            lastFiveRCB2024
        );


        String[] lastFiveDC2024 = {
            "win", "lose", "win", "win", "win"
        };

        Franchise franchise7 = new Franchise(
            "Delhi Capitals",
            8,
            6,
            2,
            "+1.083",
            12,
            lastFiveDC2024
        );


        String[] lastFiveMI2024 = {
            "win", "lose", "win", "win", "lose"
        };

        Franchise franchise8 = new Franchise(
            "Mumbai Indians",
            8,
            5,
            3,
            "+0.024",
            10,
            lastFiveMI2024
        );


        // WPL 2025
        

        String[] lastFiveDC2025 = {
            "win", "win", "lose", "win", "lose"
        };

        Franchise franchise11 = new Franchise(
            "Delhi Capitals",
            8,
            5,
            3,
            "+0.396",
            10,
            lastFiveDC2025
        );


        String[] lastFiveMI2025 = {
            "lose", "win", "win", "win", "lose"
        };

        Franchise franchise12 = new Franchise(
            "Mumbai Indians",
            8,
            5,
            3,
            "+0.192",
            10,
            lastFiveMI2025
        );


        String[] lastFiveGG2025 = {
            "lose", "win", "win", "win", "lose"
        };

        Franchise franchise13 = new Franchise(
            "Gujarat Giants",
            8,
            4,
            4,
            "+0.228",
            8,
            lastFiveGG2025
        );


        String[] lastFiveRCB2025 = {
            "lose", "lose", "win", "lose", "lose"
        };

        Franchise franchise14 = new Franchise(
            "Royal Challengers Bengaluru",
            8,
            3,
            5,
            "-0.196",
            6,
            lastFiveRCB2025
        );


        String[] lastFiveUPW2025 = {
            "win", "lose", "lose", "win", "lose"
        };

        Franchise franchise15 = new Franchise(
            "UP Warriorz",
            8,
            3,
            5,
            "-0.624",
            6,
            lastFiveUPW2025
        );

        // WPL 2026
     

        String[] lastFiveRCB2026 = {
            "win", "lose", "lose", "win", "win"
        };

        Franchise franchise16 = new Franchise(
            "Royal Challengers Bengaluru",
            8,
            6,
            2,
            "+1.247",
            12,
            lastFiveRCB2026
        );


        String[] lastFiveGG2026 = {
            "win", "win", "win", "lose", "lose"
        };

        Franchise franchise17 = new Franchise(
            "Gujarat Giants",
            8,
            5,
            3,
            "-0.168",
            10,
            lastFiveGG2026
        );


        String[] lastFiveDC2026 = {
            "win", "lose", "win", "win", "lose"
        };

        Franchise franchise18 = new Franchise(
            "Delhi Capitals",
            8,
            4,
            4,
            "-0.055",
            8,
            lastFiveDC2026
        );


        String[] lastFiveMI2026 = {
            "lose", "win", "lose", "lose", "lose"
        };

        Franchise franchise19 = new Franchise(
            "Mumbai Indians",
            8,
            3,
            5,
            "+0.059",
            6,
            lastFiveMI2026
        );


        String[] lastFiveUPW2026 = {
            "win", "win", "lose", "lose", "lose"
        };

        Franchise franchise20 = new Franchise(
            "UP Warriorz",
            8,
            2,
            6,
            "-1.076",
            4,
            lastFiveUPW2026
        );


       
        // FRANCHISE ARRAY - WPL 2023
   

        Franchise[] franchiseArray2023 = {
            franchise1,
            franchise2,
            franchise3,
            franchise4,
            franchise5
        };

        tournament1.franchises = franchiseArray2023;


        // FRANCHISE ARRAY - WPL 2024


        Franchise[] franchiseArray2024 = {
            franchise6,
            franchise7,
            franchise8
        };

        tournament2.franchises = franchiseArray2024;

        // FRANCHISE ARRAY - WPL 2025

        Franchise[] franchiseArray2025 = {
            franchise11,
            franchise12,
            franchise13,
            franchise14,
            franchise15
        };

        tournament3.franchises = franchiseArray2025;


        // FRANCHISE ARRAY - WPL 2026
        

        Franchise[] franchiseArray2026 = {
            franchise16,
            franchise17,
            franchise18,
            franchise19,
            franchise20
        };

        tournament4.franchises = franchiseArray2026;


      
        // TOURNAMENT ARRAY
      

        Tournament[] tournamentArray = {
            tournament1,
            tournament2,
            tournament3,
            tournament4
        };


        // Connect Tournament array to PointsBoard
        pointsBoard.tournaments = tournamentArray;


        // Connect PointsBoard to WPL
        wpl.pointsBoard = pointsBoard;


        // Print WPL details
        wpl.wplDetails();

    }
}