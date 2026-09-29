class IPLRunner{
	
	   public static void main(String[] cricket){
	
	   IPL ipl = new IPL();
	
	
	   Table table = new Table();
	
	   //Season Details for 2008
	   Season season1 = new Season();
	
	   season1.seasonYear = 2008;
	
	   // Season Details for 2009
       Season season2 = new Season();
      
       season2.seasonYear = 2009;
	 
	   // Season Details for 2010
       Season season3 = new Season();
      
	  
      season3.seasonYear = 2010;
	  
	  // Season Details for 2011
       Season season4 = new Season();

        
       season4.seasonYear = 2011;
	   
	   
	   // Season Details for 2012
		Season season5 = new Season();

		season5.seasonYear = 2012;
		
		// Season Details for 2013
		Season season6 = new Season();

		season6.seasonYear = 2013;
		
		// Season Details for 2014
		Season season7 = new Season();

		season7.seasonYear = 2014;
		
		// Season Details for 2015
		Season season8 = new Season();

		season8.seasonYear = 2015;
		
		
		// Season Details for 2016
		Season season9 = new Season();

		season9.seasonYear = 2016;
		
		// Season Details for 2017
		Season season10 = new Season();

		season10.seasonYear = 2017;
		
		// Season Details for 2018
		Season season11 = new Season();

		season11.seasonYear = 2018;
		
		
		// Season Details for 2019
		Season season12 = new Season();

		season12.seasonYear = 2019;
		
		// Season Details for 2020
		Season season13 = new Season();

		season13.seasonYear = 2020;


        // Season Details for 2021
		Season season14 = new Season();

		season14.seasonYear = 2021;
		
		// Season Details for 2022
		Season season15 = new Season();

		season15.seasonYear = 2022;

         
		 // Season Details for 2023
		Season season16 = new Season();

		season16.seasonYear = 2023;
		
		
		// Season Details for 2024
		Season season17 = new Season();

		season17.seasonYear = 2024;
		
		// Season Details for 2025
		Season season18 = new Season();

		season18.seasonYear = 2025;



		  // Season Details for 2026
		Season season19 = new Season();

		season19.seasonYear = 2026;




	
	//Team 1 for season 2008
	Team team1 = new Team();
	//Team1 Details
	team1.teamName = "Rajastan Royals";
	team1.matches = 14;
	team1.wins = 11;
	team1.losses = 3;
	team1.nrr = "+0.632";
	team1.points = 22;
	String lastFiveMatchesRR[] = {"win","win","win","win","lose"};
	team1.lastFive = lastFiveMatchesRR;
	
	
	
	//Team 2 for season 2008
	
	Team team2 = new Team();
	//Team2 Details
	
	team2.teamName = "King XI punjab";
	team2.matches = 14;
	team2.wins = 10;
	team2.losses = 4;
	team2.nrr = "+0.509";
	team2.points = 20;
	String lastFiveMatchesKXIP[] = {"win","win","lose","win","lose"};
	team2.lastFive = lastFiveMatchesKXIP;
	
	
	// Team 3 for Season 2008
     Team team3 = new Team();

		team3.teamName = "Chennai Super Kings";
		team3.matches = 14;
		team3.wins = 8;
		team3.losses = 6;
		team3.nrr = "-0.192";
		team3.points = 16;

		String[] lastFiveMatchesCSK = {"win", "lose", "win", "lose", "win"};

		team3.lastFive = lastFiveMatchesCSK;
		
		
				
		// Team 4 for Season 2008
		Team team4 = new Team();

		// Team 4 Details
		team4.teamName = "Delhi Daredevils";
		team4.matches = 14;
		team4.wins = 7;
		team4.losses = 7;
		team4.nrr = "+0.342";
		team4.points = 14;

		String[] lastFiveMatchesDD = {
			"win", "lose", "win", "lose", "win"
		};

		team4.lastFive = lastFiveMatchesDD;
		
		
		
		// Team 5 for Season 2008
		Team team5 = new Team();
          
		  // Team 5 Details
		team5.teamName = "Mumbai Indians";
		team5.matches = 14;
		team5.wins = 7;
		team5.losses = 7;
		team5.nrr = "+0.570";
		team5.points = 14;

		String[] lastFiveMatchesMI = {
			"win", "lose", "lose", "lose", "win"
		};

		team5.lastFive = lastFiveMatchesMI;




      // Team 6 for Season 2008

		Team team6 = new Team();
             
		// Team 6 Details
		team6.teamName = "Kolkata Knight Riders";
		team6.matches = 14;
		team6.wins = 6;
		team6.losses = 7;
		team6.nrr = "-0.147";
		team6.points = 13;

		String[] lastFiveMatchesKKR = {
			"lose", "lose", "lose", "no result", "win"
		};

		team6.lastFive = lastFiveMatchesKKR;





          // Team 7 for Season 2008

		Team team7 = new Team();
        
		// Team 7 Details
		team7.teamName = "Royal Challengers Bangalore";
		team7.matches = 14;
		team7.wins = 4;
		team7.losses = 10;
		team7.nrr = "-1.160";
		team7.points = 8;

		String[] lastFiveMatchesRCB = {
			"lose", "lose", "win", "win", "lose"
		};

		team7.lastFive = lastFiveMatchesRCB;



         // Team 8 for Season 2008

		Team team8 = new Team();


        // Team 8 Details
		team8.teamName = "Deccan Chargers";
		team8.matches = 14;
		team8.wins = 2;
		team8.losses = 12;
		team8.nrr = "-0.467";
		team8.points = 4;

		String[] lastFiveMatchesDC = {
			"lose", "lose", "lose", "lose", "lose"
		};

		team8.lastFive = lastFiveMatchesDC;
		
		
		
		
			// Team 1 for Season 2009
			Team team9 = new Team();

			team9.teamName = "Delhi Daredevils";
			team9.matches = 14;
			team9.wins = 10;
			team9.losses = 4;
			team9.nrr = "+0.311";
			team9.points = 20;

			String lastFiveMatchesDD2009[] = {
				"win", "win", "lose", "win", "win"
			};

			team9.lastFive = lastFiveMatchesDD2009;

			// Team 2 for Season 2009
			Team team10 = new Team();

			team10.teamName = "Chennai Super Kings";
			team10.matches = 14;
			team10.wins = 8;
			team10.losses = 5;
			team10.nrr = "+0.951";
			team10.points = 17;

			String lastFiveMatchesCSK2009[] = {
				"win", "win", "lose", "win", "win"
			};

			team10.lastFive = lastFiveMatchesCSK2009;


			// Team 3 for Season 2009
			Team team11 = new Team();

			team11.teamName = "Royal Challengers Bangalore";
			team11.matches = 14;
			team11.wins = 8;
			team11.losses = 6;
			team11.nrr = "-0.191";
			team11.points = 16;

			String lastFiveMatchesRCB2009[] = {
				"win", "lose", "win", "win", "win"
			};

			team11.lastFive = lastFiveMatchesRCB2009;

			// Team 4 for Season 2009
			Team team12 = new Team();

			team12.teamName = "Deccan Chargers";
			team12.matches = 14;
			team12.wins = 7;
			team12.losses = 7;
			team12.nrr = "+0.203";
			team12.points = 14;

			String lastFiveMatchesDC2009[] = {
				"win", "lose", "win", "lose", "win"
			};

			team12.lastFive = lastFiveMatchesDC2009;


			// Team 5 for Season 2009
			Team team13 = new Team();

			team13.teamName = "Kings XI Punjab";
			team13.matches = 14;
			team13.wins = 7;
			team13.losses = 7;
			team13.nrr = "-0.043";
			team13.points = 14;

			String lastFiveMatchesKXIP2009[] = {
				"lose", "win", "win", "lose", "win"
			};

			team13.lastFive = lastFiveMatchesKXIP2009;




			// Team 6 for Season 2009
			Team team14 = new Team();

			team14.teamName = "Rajasthan Royals";
			team14.matches = 14;
			team14.wins = 6;
			team14.losses = 7;
			team14.nrr = "-0.352";
			team14.points = 13;

			String lastFiveMatchesRR2009[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team14.lastFive = lastFiveMatchesRR2009;



			// Team 7 for Season 2009
			Team team15 = new Team();

			team15.teamName = "Mumbai Indians";
			team15.matches = 14;
			team15.wins = 5;
			team15.losses = 8;
			team15.nrr = "-0.763";
			team15.points = 11;

			String lastFiveMatchesMI2009[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team15.lastFive = lastFiveMatchesMI2009;



			// Team 8 for Season 2009
			Team team16 = new Team();

			team16.teamName = "Kolkata Knight Riders";
			team16.matches = 14;
			team16.wins = 3;
			team16.losses = 10;
			team16.nrr = "-0.789";
			team16.points = 7;

			String lastFiveMatchesKKR2009[] = {
				"lose", "lose", "win", "lose", "lose"
			};

           team16.lastFive = lastFiveMatchesKKR2009;
		   
		   
		   
		   
		   
		   // Team 1 for Season 2010
			Team team17 = new Team();

			team17.teamName = "Mumbai Indians";
			team17.matches = 14;
			team17.wins = 10;
			team17.losses = 4;
			team17.nrr = "+0.725";
			team17.points = 20;

			String lastFiveMatchesMI2010[] = {
				"win", "win", "win", "lose", "win"
			};

			team17.lastFive = lastFiveMatchesMI2010;


			// Team 2 for Season 2010
			Team team18 = new Team();

			team18.teamName = "Deccan Chargers";
			team18.matches = 14;
			team18.wins = 8;
			team18.losses = 6;
			team18.nrr = "+0.251";
			team18.points = 16;

			String lastFiveMatchesDC2010[] = {
				"win", "lose", "win", "win", "win"
			};

			team18.lastFive = lastFiveMatchesDC2010;


			// Team 3 for Season 2010
			Team team19 = new Team();

			team19.teamName = "Chennai Super Kings";
			team19.matches = 14;
			team19.wins = 7;
			team19.losses = 7;
			team19.nrr = "+0.274";
			team19.points = 14;

			String lastFiveMatchesCSK2010[] = {
				"win", "win", "lose", "win", "lose"
			};

			team19.lastFive = lastFiveMatchesCSK2010;


			// Team 4 for Season 2010
			Team team20 = new Team();

			team20.teamName = "Royal Challengers Bangalore";
			team20.matches = 14;
			team20.wins = 7;
			team20.losses = 7;
			team20.nrr = "+0.219";
			team20.points = 14;

			String lastFiveMatchesRCB2010[] = {
				"lose", "win", "win", "lose", "win"
			};

			team20.lastFive = lastFiveMatchesRCB2010;


			// Team 5 for Season 2010
			Team team21 = new Team();

			team21.teamName = "Delhi Daredevils";
			team21.matches = 14;
			team21.wins = 7;
			team21.losses = 7;
			team21.nrr = "+0.021";
			team21.points = 14;

			String lastFiveMatchesDD2010[] = {
				"win", "lose", "win", "lose", "win"
			};

			team21.lastFive = lastFiveMatchesDD2010;


			// Team 6 for Season 2010
			Team team22 = new Team();

			team22.teamName = "Kolkata Knight Riders";
			team22.matches = 14;
			team22.wins = 7;
			team22.losses = 7;
			team22.nrr = "-0.341";
			team22.points = 14;

			String lastFiveMatchesKKR2010[] = {
				"lose", "win", "lose", "win", "win"
			};

			team22.lastFive = lastFiveMatchesKKR2010;


			// Team 7 for Season 2010
			Team team23 = new Team();

			team23.teamName = "Rajasthan Royals";
			team23.matches = 14;
			team23.wins = 6;
			team23.losses = 8;
			team23.nrr = "-0.514";
			team23.points = 14;

			String lastFiveMatchesRR2010[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team23.lastFive = lastFiveMatchesRR2010;


			// Team 8 for Season 2010
			Team team24 = new Team();

			team24.teamName = "Kings XI Punjab";
			team24.matches = 14;
			team24.wins = 4;
			team24.losses = 10;
			team24.nrr = "-0.692";
			team24.points = 8;

			String lastFiveMatchesKXIP2010[] = {
				"lose", "lose", "win", "lose", "lose"
			};

			team24.lastFive = lastFiveMatchesKXIP2010;
			
			// Team 1 for Season 2011
			Team team25 = new Team();

			team25.teamName = "Royal Challengers Bangalore";
			team25.matches = 14;
			team25.wins = 9;
			team25.losses = 4;
			team25.nrr = "+0.326";
			team25.points = 19;

			String lastFiveMatchesRCB2011[] = {
				"win", "win", "win", "lose", "win"
			};

			team25.lastFive = lastFiveMatchesRCB2011;


			// Team 2 for Season 2011
			Team team26 = new Team();

			team26.teamName = "Chennai Super Kings";
			team26.matches = 14;
			team26.wins = 9;
			team26.losses = 5;
			team26.nrr = "+0.443";
			team26.points = 18;

			String lastFiveMatchesCSK2011[] = {
				"win", "win", "lose", "win", "win"
			};

			team26.lastFive = lastFiveMatchesCSK2011;


			// Team 3 for Season 2011
			Team team27 = new Team();

			team27.teamName = "Mumbai Indians";
			team27.matches = 14;
			team27.wins = 8;
			team27.losses = 6;
			team27.nrr = "+0.040";
			team27.points = 18;

			String lastFiveMatchesMI2011[] = {
				"win", "lose", "win", "win", "lose"
			};

			team27.lastFive = lastFiveMatchesMI2011;


			// Team 4 for Season 2011
			Team team28 = new Team();

			team28.teamName = "Kolkata Knight Riders";
			team28.matches = 14;
			team28.wins = 8;
			team28.losses = 6;
			team28.nrr = "+0.433";
			team28.points = 16;

			String lastFiveMatchesKKR2011[] = {
				"win", "win", "lose", "win", "lose"
			};

			team28.lastFive = lastFiveMatchesKKR2011;


			// Team 5 for Season 2011
			Team team29 = new Team();

			team29.teamName = "Kings XI Punjab";
			team29.matches = 14;
			team29.wins = 7;
			team29.losses = 7;
			team29.nrr = "-0.051";
			team29.points = 14;

			String lastFiveMatchesKXIP2011[] = {
				"win", "lose", "win", "win", "lose"
			};

			team29.lastFive = lastFiveMatchesKXIP2011;


			// Team 6 for Season 2011
			Team team30 = new Team();

			team30.teamName = "Rajasthan Royals";
			team30.matches = 14;
			team30.wins = 6;
			team30.losses = 8;
			team30.nrr = "-0.691";
			team30.points = 12;

			String lastFiveMatchesRR2011[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team30.lastFive = lastFiveMatchesRR2011;


			// Team 7 for Season 2011
			Team team31 = new Team();

			team31.teamName = "Deccan Chargers";
			team31.matches = 14;
			team31.wins = 6;
			team31.losses = 8;
			team31.nrr = "-0.222";
			team31.points = 12;

			String lastFiveMatchesDC2011[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team31.lastFive = lastFiveMatchesDC2011;


			// Team 8 for Season 2011
			Team team32 = new Team();

			team32.teamName = "Kochi Tuskers Kerala";
			team32.matches = 14;
			team32.wins = 6;
			team32.losses = 8;
			team32.nrr = "-0.214";
			team32.points = 12;

			String lastFiveMatchesKTK2011[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team32.lastFive = lastFiveMatchesKTK2011;


			// Team 9 for Season 2011
			Team team33 = new Team();

			team33.teamName = "Pune Warriors India";
			team33.matches = 14;
			team33.wins = 4;
			team33.losses = 9;
			team33.nrr = "-0.135";
			team33.points = 9;

			String lastFiveMatchesPWI2011[] = {
				"lose", "lose", "win", "lose", "win"
			};

			team33.lastFive = lastFiveMatchesPWI2011;

             
			 // Team 10 for Season 2011
			Team team34 = new Team();

			team34.teamName = "Delhi Daredevils";
			team34.matches = 14;
			team34.wins = 4;
			team34.losses = 9;
			team34.nrr = "-0.448";
			team34.points = 8;

			String lastFiveMatchesDD2011[] = {
				"lose", "lose", "lose", "win", "lose"
			};

          team34.lastFive = lastFiveMatchesDD2011;
		  
		  // Team 1 for Season 2012
			Team team35 = new Team();

			team35.teamName = "Delhi Daredevils";
			team35.matches = 16;
			team35.wins = 11;
			team35.losses = 5;
			team35.nrr = "+0.617";
			team35.points = 22;

			String lastFiveMatchesDD2012[] = {
				"win", "win", "lose", "win", "win"
			};

			team35.lastFive = lastFiveMatchesDD2012;


			// Team 2 for Season 2012
			Team team36 = new Team();

			team36.teamName = "Kolkata Knight Riders";
			team36.matches = 16;
			team36.wins = 10;
			team36.losses = 5;
			team36.nrr = "+0.561";
			team36.points = 21;

			String lastFiveMatchesKKR2012[] = {
				"win", "win", "win", "lose", "win"
			};

			team36.lastFive = lastFiveMatchesKKR2012;


			// Team 3 for Season 2012
			Team team37 = new Team();

			team37.teamName = "Mumbai Indians";
			team37.matches = 16;
			team37.wins = 10;
			team37.losses = 6;
			team37.nrr = "-0.100";
			team37.points = 20;

			String lastFiveMatchesMI2012[] = {
				"win", "lose", "win", "win", "win"
			};

			team37.lastFive = lastFiveMatchesMI2012;


			// Team 4 for Season 2012
			Team team38 = new Team();

			team38.teamName = "Chennai Super Kings";
			team38.matches = 16;
			team38.wins = 8;
			team38.losses = 7;
			team38.nrr = "+0.100";
			team38.points = 17;

			String lastFiveMatchesCSK2012[] = {
				"win", "win", "lose", "win", "lose"
			};

			team38.lastFive = lastFiveMatchesCSK2012;


			// Team 5 for Season 2012
			Team team39 = new Team();

			team39.teamName = "Royal Challengers Bangalore";
			team39.matches = 16;
			team39.wins = 8;
			team39.losses = 7;
			team39.nrr = "-0.044";
			team39.points = 17;

			String lastFiveMatchesRCB2012[] = {
				"lose", "win", "win", "lose", "win"
			};

			team39.lastFive = lastFiveMatchesRCB2012;


			// Team 6 for Season 2012
			Team team40 = new Team();

			team40.teamName = "Kings XI Punjab";
			team40.matches = 16;
			team40.wins = 8;
			team40.losses = 8;
			team40.nrr = "-0.216";
			team40.points = 16;

			String lastFiveMatchesKXIP2012[] = {
				"win", "lose", "win", "lose", "win"
			};

			team40.lastFive = lastFiveMatchesKXIP2012;


			// Team 7 for Season 2012
			Team team41 = new Team();

			team41.teamName = "Rajasthan Royals";
			team41.matches = 16;
			team41.wins = 7;
			team41.losses = 9;
			team41.nrr = "+0.201";
			team41.points = 14;

			String lastFiveMatchesRR2012[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team41.lastFive = lastFiveMatchesRR2012;


			// Team 8 for Season 2012
			Team team42 = new Team();

			team42.teamName = "Deccan Chargers";
			team42.matches = 16;
			team42.wins = 4;
			team42.losses = 11;
			team42.nrr = "-0.509";
			team42.points = 8;

			String lastFiveMatchesDC2012[] = {
				"lose", "lose", "win", "lose", "lose"
			};

			team42.lastFive = lastFiveMatchesDC2012;


			// Team 9 for Season 2012
			Team team43 = new Team();

			team43.teamName = "Pune Warriors India";
			team43.matches = 16;
			team43.wins = 4;
			team43.losses = 12;
			team43.nrr = "-0.551";
			team43.points = 8;

			String lastFiveMatchesPWI2012[] = {
				"win", "lose", "lose", "lose", "lose"
			};

			team43.lastFive = lastFiveMatchesPWI2012;
			
			
			// Team 1 for Season 2013
			Team team44 = new Team();

			team44.teamName = "Mumbai Indians";
			team44.matches = 16;
			team44.wins = 11;
			team44.losses = 5;
			team44.nrr = "+0.319";
			team44.points = 22;

			String lastFiveMatchesMI2013[] = {
				"win", "win", "lose", "win", "win"
			};

			team44.lastFive = lastFiveMatchesMI2013;


			// Team 2 for Season 2013
			Team team45 = new Team();

			team45.teamName = "Chennai Super Kings";
			team45.matches = 16;
			team45.wins = 11;
			team45.losses = 5;
			team45.nrr = "+0.530";
			team45.points = 22;

			String lastFiveMatchesCSK2013[] = {
				"win", "win", "win", "lose", "win"
			};

			team45.lastFive = lastFiveMatchesCSK2013;


			// Team 3 for Season 2013
			Team team46 = new Team();

			team46.teamName = "Rajasthan Royals";
			team46.matches = 16;
			team46.wins = 10;
			team46.losses = 6;
			team46.nrr = "+0.322";
			team46.points = 20;

			String lastFiveMatchesRR2013[] = {
				"win", "win", "lose", "win", "lose"
			};

			team46.lastFive = lastFiveMatchesRR2013;


			// Team 4 for Season 2013
			Team team47 = new Team();

			team47.teamName = "Sunrisers Hyderabad";
			team47.matches = 16;
			team47.wins = 10;
			team47.losses = 6;
			team47.nrr = "+0.003";
			team47.points = 20;

			String lastFiveMatchesSRH2013[] = {
				"win", "lose", "win", "win", "win"
			};

			team47.lastFive = lastFiveMatchesSRH2013;


			// Team 5 for Season 2013
			Team team48 = new Team();

			team48.teamName = "Royal Challengers Bangalore";
			team48.matches = 16;
			team48.wins = 9;
			team48.losses = 7;
			team48.nrr = "+0.457";
			team48.points = 18;

			String lastFiveMatchesRCB2013[] = {
				"lose", "win", "win", "win", "lose"
			};

			team48.lastFive = lastFiveMatchesRCB2013;


			// Team 6 for Season 2013
			Team team49 = new Team();

			team49.teamName = "Kings XI Punjab";
			team49.matches = 16;
			team49.wins = 8;
			team49.losses = 8;
			team49.nrr = "-0.218";
			team49.points = 16;

			String lastFiveMatchesKXIP2013[] = {
				"win", "lose", "win", "lose", "win"
			};

			team49.lastFive = lastFiveMatchesKXIP2013;


			// Team 7 for Season 2013
			Team team50 = new Team();

			team50.teamName = "Kolkata Knight Riders";
			team50.matches = 16;
			team50.wins = 6;
			team50.losses = 10;
			team50.nrr = "-0.095";
			team50.points = 12;

			String lastFiveMatchesKKR2013[] = {
				"lose", "win", "lose", "lose", "win"
			};

			team50.lastFive = lastFiveMatchesKKR2013;


			// Team 8 for Season 2013
			Team team51 = new Team();

			team51.teamName = "Pune Warriors India";
			team51.matches = 16;
			team51.wins = 4;
			team51.losses = 12;
			team51.nrr = "-1.006";
			team51.points = 8;

			String lastFiveMatchesPWI2013[] = {
				"lose", "lose", "win", "lose", "lose"
			};

			team51.lastFive = lastFiveMatchesPWI2013;


			// Team 9 for Season 2013
			Team team52 = new Team();

			team52.teamName = "Delhi Daredevils";
			team52.matches = 16;
			team52.wins = 3;
			team52.losses = 13;
			team52.nrr = "-0.848";
			team52.points = 6;

			String lastFiveMatchesDD2013[] = {
				"lose", "lose", "lose", "win", "lose"
			};

			team52.lastFive = lastFiveMatchesDD2013;
			
			// Team 1 for Season 2014
			Team team53 = new Team();

			team53.teamName = "Kings XI Punjab";
			team53.matches = 14;
			team53.wins = 11;
			team53.losses = 3;
			team53.nrr = "+0.968";
			team53.points = 18;

			String lastFiveMatchesKXIP2014[] = {
				"win", "win", "win", "lose", "win"
			};

			team53.lastFive = lastFiveMatchesKXIP2014;


			// Team 2 for Season 2014
			Team team54 = new Team();

			team54.teamName = "Kolkata Knight Riders";
			team54.matches = 14;
			team54.wins = 9;
			team54.losses = 5;
			team54.nrr = "+0.418";
			team54.points = 18;

			String lastFiveMatchesKKR2014[] = {
				"win", "win", "lose", "win", "win"
			};

			team54.lastFive = lastFiveMatchesKKR2014;


			// Team 3 for Season 2014
			Team team55 = new Team();

			team55.teamName = "Chennai Super Kings";
			team55.matches = 14;
			team55.wins = 9;
			team55.losses = 5;
			team55.nrr = "+0.385";
			team55.points = 18;

			String lastFiveMatchesCSK2014[] = {
				"win", "lose", "win", "win", "lose"
			};

			team55.lastFive = lastFiveMatchesCSK2014;


			// Team 4 for Season 2014
			Team team56 = new Team();

			team56.teamName = "Mumbai Indians";
			team56.matches = 14;
			team56.wins = 7;
			team56.losses = 7;
			team56.nrr = "+0.095";
			team56.points = 14;

			String lastFiveMatchesMI2014[] = {
				"win", "win", "lose", "win", "lose"
			};

			team56.lastFive = lastFiveMatchesMI2014;


			// Team 5 for Season 2014
			Team team57 = new Team();

			team57.teamName = "Rajasthan Royals";
			team57.matches = 14;
			team57.wins = 7;
			team57.losses = 7;
			team57.nrr = "+0.060";
			team57.points = 14;

			String lastFiveMatchesRR2014[] = {
				"lose", "win", "win", "lose", "win"
			};

			team57.lastFive = lastFiveMatchesRR2014;


			// Team 6 for Season 2014
			Team team58 = new Team();

			team58.teamName = "Royal Challengers Bangalore";
			team58.matches = 14;
			team58.wins = 5;
			team58.losses = 8;
			team58.nrr = "-0.399";
			team58.points = 12;

			String lastFiveMatchesRCB2014[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team58.lastFive = lastFiveMatchesRCB2014;


			// Team 7 for Season 2014
			Team team59 = new Team();

			team59.teamName = "Sunrisers Hyderabad";
			team59.matches = 14;
			team59.wins = 6;
			team59.losses = 8;
			team59.nrr = "-0.399";
			team59.points = 12;

			String lastFiveMatchesSRH2014[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team59.lastFive = lastFiveMatchesSRH2014;


			// Team 8 for Season 2014
			Team team60 = new Team();

			team60.teamName = "Delhi Daredevils";
			team60.matches = 14;
			team60.wins = 2;
			team60.losses = 12;
			team60.nrr = "-1.182";
			team60.points = 4;

			String lastFiveMatchesDD2014[] = {
				"lose", "lose", "lose", "lose", "win"
			};

			team60.lastFive = lastFiveMatchesDD2014;
			
			// Team 1 for Season 2015
			Team team61 = new Team();

			team61.teamName = "Mumbai Indians";
			team61.matches = 14;
			team61.wins = 8;
			team61.losses = 6;
			team61.nrr = "+0.433";
			team61.points = 16;

			String lastFiveMatchesMI2015[] = {
				"win", "win", "lose", "win", "win"
			};

			team61.lastFive = lastFiveMatchesMI2015;


			// Team 2 for Season 2015
			Team team62 = new Team();

			team62.teamName = "Chennai Super Kings";
			team62.matches = 14;
			team62.wins = 9;
			team62.losses = 5;
			team62.nrr = "+0.709";
			team62.points = 16;

			String lastFiveMatchesCSK2015[] = {
				"win", "lose", "win", "win", "lose"
			};

			team62.lastFive = lastFiveMatchesCSK2015;


			// Team 3 for Season 2015
			Team team63 = new Team();

			team63.teamName = "Royal Challengers Bangalore";
			team63.matches = 14;
			team63.wins = 7;
			team63.losses = 5;
			team63.nrr = "+1.037";
			team63.points = 16;

			String lastFiveMatchesRCB2015[] = {
				"win", "win", "lose", "win", "win"
			};

			team63.lastFive = lastFiveMatchesRCB2015;


			// Team 4 for Season 2015
			Team team64 = new Team();

			team64.teamName = "Rajasthan Royals";
			team64.matches = 14;
			team64.wins = 7;
			team64.losses = 5;
			team64.nrr = "+0.062";
			team64.points = 16;

			String lastFiveMatchesRR2015[] = {
				"lose", "win", "win", "lose", "win"
			};

			team64.lastFive = lastFiveMatchesRR2015;


			// Team 5 for Season 2015
			Team team65 = new Team();

			team65.teamName = "Kolkata Knight Riders";
			team65.matches = 14;
			team65.wins = 7;
			team65.losses = 6;
			team65.nrr = "+0.253";
			team65.points = 15;

			String lastFiveMatchesKKR2015[] = {
				"win", "lose", "win", "lose", "win"
			};

			team65.lastFive = lastFiveMatchesKKR2015;


			// Team 6 for Season 2015
			Team team66 = new Team();

			team66.teamName = "Sunrisers Hyderabad";
			team66.matches = 14;
			team66.wins = 7;
			team66.losses = 7;
			team66.nrr = "-0.239";
			team66.points = 14;

			String lastFiveMatchesSRH2015[] = {
				"win", "lose", "win", "lose", "lose"
			};

			team66.lastFive = lastFiveMatchesSRH2015;


			// Team 7 for Season 2015
			Team team67 = new Team();

			team67.teamName = "Delhi Daredevils";
			team67.matches = 14;
			team67.wins = 5;
			team67.losses = 8;
			team67.nrr = "-0.049";
			team67.points = 11;

			String lastFiveMatchesDD2015[] = {
				"lose", "win", "lose", "lose", "win"
			};

			team67.lastFive = lastFiveMatchesDD2015;


			// Team 8 for Season 2015
			Team team68 = new Team();

			team68.teamName = "Kings XI Punjab";
			team68.matches = 14;
			team68.wins = 3;
			team68.losses = 11;
			team68.nrr = "-1.436";
			team68.points = 6;

			String lastFiveMatchesKXIP2015[] = {
				"lose", "lose", "lose", "win", "lose"
			};

			team68.lastFive = lastFiveMatchesKXIP2015;
			
			
			// Team 1 for Season 2016
			Team team69 = new Team();

			team69.teamName = "Sunrisers Hyderabad";
			team69.matches = 14;
			team69.wins = 8;
			team69.losses = 6;
			team69.nrr = "+0.296";
			team69.points = 16;

			String lastFiveMatchesSRH2016[] = {
				"win", "win", "lose", "win", "win"
			};

			team69.lastFive = lastFiveMatchesSRH2016;


			// Team 2 for Season 2016
			Team team70 = new Team();

			team70.teamName = "Royal Challengers Bangalore";
			team70.matches = 14;
			team70.wins = 8;
			team70.losses = 6;
			team70.nrr = "+0.932";
			team70.points = 16;

			String lastFiveMatchesRCB2016[] = {
				"win", "lose", "win", "win", "win"
			};

			team70.lastFive = lastFiveMatchesRCB2016;


			// Team 3 for Season 2016
			Team team71 = new Team();

			team71.teamName = "Gujarat Lions";
			team71.matches = 14;
			team71.wins = 9;
			team71.losses = 5;
			team71.nrr = "-0.374";
			team71.points = 18;

			String lastFiveMatchesGL2016[] = {
				"win", "win", "lose", "win", "lose"
			};

			team71.lastFive = lastFiveMatchesGL2016;


			// Team 4 for Season 2016
			Team team72 = new Team();

			team72.teamName = "Kolkata Knight Riders";
			team72.matches = 14;
			team72.wins = 8;
			team72.losses = 6;
			team72.nrr = "+0.641";
			team72.points = 16;

			String lastFiveMatchesKKR2016[] = {
				"lose", "win", "win", "lose", "win"
			};

			team72.lastFive = lastFiveMatchesKKR2016;


			// Team 5 for Season 2016
			Team team73 = new Team();

			team73.teamName = "Mumbai Indians";
			team73.matches = 14;
			team73.wins = 7;
			team73.losses = 7;
			team73.nrr = "-0.146";
			team73.points = 14;

			String lastFiveMatchesMI2016[] = {
				"win", "lose", "win", "lose", "win"
			};

			team73.lastFive = lastFiveMatchesMI2016;


			// Team 6 for Season 2016
			Team team74 = new Team();

			team74.teamName = "Delhi Daredevils";
			team74.matches = 14;
			team74.wins = 7;
			team74.losses = 7;
			team74.nrr = "-0.155";
			team74.points = 14;

			String lastFiveMatchesDD2016[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team74.lastFive = lastFiveMatchesDD2016;


			// Team 7 for Season 2016
			Team team75 = new Team();

			team75.teamName = "Rising Pune Supergiant";
			team75.matches = 14;
			team75.wins = 5;
			team75.losses = 9;
			team75.nrr = "-0.740";
			team75.points = 10;

			String lastFiveMatchesRPS2016[] = {
				"lose", "win", "lose", "lose", "win"
			};

			team75.lastFive = lastFiveMatchesRPS2016;


			// Team 8 for Season 2016
			Team team76 = new Team();

			team76.teamName = "Kings XI Punjab";
			team76.matches = 14;
			team76.wins = 4;
			team76.losses = 10;
			team76.nrr = "-0.646";
			team76.points = 8;

			String lastFiveMatchesKXIP2016[] = {
				"lose", "lose", "win", "lose", "lose"
			};

			team76.lastFive = lastFiveMatchesKXIP2016;




			// Team 1 for Season 2017
			Team team77 = new Team();

			team77.teamName = "Mumbai Indians";
			team77.matches = 14;
			team77.wins = 10;
			team77.losses = 4;
			team77.nrr = "+0.784";
			team77.points = 20;

			String lastFiveMatchesMI2017[] = {
				"win", "win", "lose", "win", "win"
			};

			team77.lastFive = lastFiveMatchesMI2017;


			// Team 2 for Season 2017
			Team team78 = new Team();

			team78.teamName = "Rising Pune Supergiant";
			team78.matches = 14;
			team78.wins = 9;
			team78.losses = 5;
			team78.nrr = "+0.176";
			team78.points = 18;

			String lastFiveMatchesRPS2017[] = {
				"win", "win", "win", "lose", "win"
			};

			team78.lastFive = lastFiveMatchesRPS2017;


			// Team 3 for Season 2017
			Team team79 = new Team();

			team79.teamName = "Sunrisers Hyderabad";
			team79.matches = 14;
			team79.wins = 8;
			team79.losses = 5;
			team79.nrr = "+0.599";
			team79.points = 17;

			String lastFiveMatchesSRH2017[] = {
				"win", "lose", "win", "win", "lose"
			};

			team79.lastFive = lastFiveMatchesSRH2017;


			// Team 4 for Season 2017
			Team team80 = new Team();

			team80.teamName = "Kolkata Knight Riders";
			team80.matches = 14;
			team80.wins = 8;
			team80.losses = 6;
			team80.nrr = "+0.641";
			team80.points = 16;

			String lastFiveMatchesKKR2017[] = {
				"lose", "win", "win", "lose", "win"
			};

			team80.lastFive = lastFiveMatchesKKR2017;


			// Team 5 for Season 2017
			Team team81 = new Team();

			team81.teamName = "Kings XI Punjab";
			team81.matches = 14;
			team81.wins = 7;
			team81.losses = 7;
			team81.nrr = "-0.009";
			team81.points = 14;

			String lastFiveMatchesKXIP2017[] = {
				"win", "lose", "win", "lose", "win"
			};

			team81.lastFive = lastFiveMatchesKXIP2017;


			// Team 6 for Season 2017
			Team team82 = new Team();

			team82.teamName = "Delhi Daredevils";
			team82.matches = 14;
			team82.wins = 6;
			team82.losses = 8;
			team82.nrr = "-0.512";
			team82.points = 12;

			String lastFiveMatchesDD2017[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team82.lastFive = lastFiveMatchesDD2017;


			// Team 7 for Season 2017
			Team team83 = new Team();

			team83.teamName = "Gujarat Lions";
			team83.matches = 14;
			team83.wins = 4;
			team83.losses = 10;
			team83.nrr = "-0.412";
			team83.points = 8;

			String lastFiveMatchesGL2017[] = {
				"lose", "lose", "win", "lose", "lose"
			};

			team83.lastFive = lastFiveMatchesGL2017;


			// Team 8 for Season 2017
			Team team84 = new Team();

			team84.teamName = "Royal Challengers Bangalore";
			team84.matches = 14;
			team84.wins = 3;
			team84.losses = 10;
			team84.nrr = "-1.299";
			team84.points = 7;

			String lastFiveMatchesRCB2017[] = {
				"lose", "lose", "win", "lose", "lose"
			};

			team84.lastFive = lastFiveMatchesRCB2017;
			
			// Team 1 for Season 2018
			Team team85 = new Team();

			team85.teamName = "Sunrisers Hyderabad";
			team85.matches = 14;
			team85.wins = 10;
			team85.losses = 4;
			team85.nrr = "+0.284";
			team85.points = 20;

			String lastFiveMatchesSRH2018[] = {
				"win", "win", "lose", "win", "win"
			};

			team85.lastFive = lastFiveMatchesSRH2018;


			// Team 2 for Season 2018
			Team team86 = new Team();

			team86.teamName = "Chennai Super Kings";
			team86.matches = 14;
			team86.wins = 9;
			team86.losses = 5;
			team86.nrr = "+0.253";
			team86.points = 18;

			String lastFiveMatchesCSK2018[] = {
				"win", "win", "lose", "win", "win"
			};

			team86.lastFive = lastFiveMatchesCSK2018;


			// Team 3 for Season 2018
			Team team87 = new Team();

			team87.teamName = "Kolkata Knight Riders";
			team87.matches = 14;
			team87.wins = 8;
			team87.losses = 6;
			team87.nrr = "-0.070";
			team87.points = 16;

			String lastFiveMatchesKKR2018[] = {
				"win", "lose", "win", "win", "lose"
			};

			team87.lastFive = lastFiveMatchesKKR2018;


			// Team 4 for Season 2018
			Team team88 = new Team();

			team88.teamName = "Rajasthan Royals";
			team88.matches = 14;
			team88.wins = 7;
			team88.losses = 7;
			team88.nrr = "-0.250";
			team88.points = 14;

			String lastFiveMatchesRR2018[] = {
				"win", "lose", "lose", "win", "win"
			};

			team88.lastFive = lastFiveMatchesRR2018;


			// Team 5 for Season 2018
			Team team89 = new Team();

			team89.teamName = "Mumbai Indians";
			team89.matches = 14;
			team89.wins = 6;
			team89.losses = 8;
			team89.nrr = "+0.317";
			team89.points = 12;

			String lastFiveMatchesMI2018[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team89.lastFive = lastFiveMatchesMI2018;


			// Team 6 for Season 2018
			Team team90 = new Team();

			team90.teamName = "Royal Challengers Bangalore";
			team90.matches = 14;
			team90.wins = 6;
			team90.losses = 8;
			team90.nrr = "+0.129";
			team90.points = 12;

			String lastFiveMatchesRCB2018[] = {
				"win", "lose", "win", "lose", "lose"
			};

			team90.lastFive = lastFiveMatchesRCB2018;


			// Team 7 for Season 2018
			Team team91 = new Team();

			team91.teamName = "Kings XI Punjab";
			team91.matches = 14;
			team91.wins = 6;
			team91.losses = 8;
			team91.nrr = "-0.502";
			team91.points = 12;

			String lastFiveMatchesKXIP2018[] = {
				"lose", "win", "lose", "lose", "win"
			};

			team91.lastFive = lastFiveMatchesKXIP2018;


			// Team 8 for Season 2018
			Team team92 = new Team();

			team92.teamName = "Delhi Daredevils";
			team92.matches = 14;
			team92.wins = 5;
			team92.losses = 9;
			team92.nrr = "-0.222";
			team92.points = 10;

			String lastFiveMatchesDD2018[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team92.lastFive = lastFiveMatchesDD2018;
			
			
			
			// Team 1 for Season 2019
			Team team93 = new Team();

			team93.teamName = "Mumbai Indians";
			team93.matches = 14;
			team93.wins = 9;
			team93.losses = 5;
			team93.nrr = "+0.421";
			team93.points = 18;

			String lastFiveMatchesMI2019[] = {
				"win", "win", "lose", "win", "win"
			};

			team93.lastFive = lastFiveMatchesMI2019;


			// Team 2 for Season 2019
			Team team94 = new Team();

			team94.teamName = "Chennai Super Kings";
			team94.matches = 14;
			team94.wins = 9;
			team94.losses = 5;
			team94.nrr = "+0.131";
			team94.points = 18;

			String lastFiveMatchesCSK2019[] = {
				"win", "lose", "win", "win", "win"
			};

			team94.lastFive = lastFiveMatchesCSK2019;


			// Team 3 for Season 2019
			Team team95 = new Team();

			team95.teamName = "Delhi Capitals";
			team95.matches = 14;
			team95.wins = 9;
			team95.losses = 5;
			team95.nrr = "+0.044";
			team95.points = 18;

			String lastFiveMatchesDC2019[] = {
				"win", "win", "lose", "win", "lose"
			};

			team95.lastFive = lastFiveMatchesDC2019;


			// Team 4 for Season 2019
			Team team96 = new Team();

			team96.teamName = "Sunrisers Hyderabad";
			team96.matches = 14;
			team96.wins = 6;
			team96.losses = 8;
			team96.nrr = "+0.577";
			team96.points = 12;

			String lastFiveMatchesSRH2019[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team96.lastFive = lastFiveMatchesSRH2019;


			// Team 5 for Season 2019
			Team team97 = new Team();

			team97.teamName = "Kolkata Knight Riders";
			team97.matches = 14;
			team97.wins = 6;
			team97.losses = 8;
			team97.nrr = "+0.028";
			team97.points = 12;

			String lastFiveMatchesKKR2019[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team97.lastFive = lastFiveMatchesKKR2019;


			// Team 6 for Season 2019
			Team team98 = new Team();

			team98.teamName = "Kings XI Punjab";
			team98.matches = 14;
			team98.wins = 6;
			team98.losses = 8;
			team98.nrr = "-0.251";
			team98.points = 12;

			String lastFiveMatchesKXIP2019[] = {
				"lose", "win", "lose", "lose", "win"
			};

			team98.lastFive = lastFiveMatchesKXIP2019;


			// Team 7 for Season 2019
			Team team99 = new Team();

			team99.teamName = "Rajasthan Royals";
			team99.matches = 14;
			team99.wins = 5;
			team99.losses = 8;
			team99.nrr = "-0.449";
			team99.points = 11;

			String lastFiveMatchesRR2019[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team99.lastFive = lastFiveMatchesRR2019;


			// Team 8 for Season 2019
			Team team100 = new Team();

			team100.teamName = "Royal Challengers Bangalore";
			team100.matches = 14;
			team100.wins = 5;
			team100.losses = 8;
			team100.nrr = "-0.607";
			team100.points = 11;

			String lastFiveMatchesRCB2019[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team100.lastFive = lastFiveMatchesRCB2019;


			// Team 1 for Season 2020
			Team team101 = new Team();

			team101.teamName = "Mumbai Indians";
			team101.matches = 14;
			team101.wins = 9;
			team101.losses = 5;
			team101.nrr = "+1.107";
			team101.points = 18;

			String lastFiveMatchesMI2020[] = {
				"win", "win", "lose", "win", "win"
			};

			team101.lastFive = lastFiveMatchesMI2020;


			// Team 2 for Season 2020
			Team team102 = new Team();

			team102.teamName = "Delhi Capitals";
			team102.matches = 14;
			team102.wins = 8;
			team102.losses = 6;
			team102.nrr = "-0.109";
			team102.points = 16;

			String lastFiveMatchesDC2020[] = {
				"win", "lose", "win", "lose", "win"
			};

			team102.lastFive = lastFiveMatchesDC2020;


			// Team 3 for Season 2020
			Team team103 = new Team();

			team103.teamName = "Sunrisers Hyderabad";
			team103.matches = 14;
			team103.wins = 8;
			team103.losses = 6;
			team103.nrr = "+0.608";
			team103.points = 14;

			String lastFiveMatchesSRH2020[] = {
				"win", "win", "lose", "win", "win"
			};

			team103.lastFive = lastFiveMatchesSRH2020;


			// Team 4 for Season 2020
			Team team104 = new Team();

			team104.teamName = "Royal Challengers Bangalore";
			team104.matches = 14;
			team104.wins = 7;
			team104.losses = 7;
			team104.nrr = "-0.172";
			team104.points = 14;

			String lastFiveMatchesRCB2020[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team104.lastFive = lastFiveMatchesRCB2020;


			// Team 5 for Season 2020
			Team team105 = new Team();

			team105.teamName = "Kolkata Knight Riders";
			team105.matches = 14;
			team105.wins = 7;
			team105.losses = 7;
			team105.nrr = "-0.214";
			team105.points = 14;

			String lastFiveMatchesKKR2020[] = {
				"win", "lose", "win", "lose", "win"
			};

			team105.lastFive = lastFiveMatchesKKR2020;


			// Team 6 for Season 2020
			Team team106 = new Team();

			team106.teamName = "Kings XI Punjab";
			team106.matches = 14;
			team106.wins = 6;
			team106.losses = 8;
			team106.nrr = "-0.162";
			team106.points = 12;

			String lastFiveMatchesKXIP2020[] = {
				"win", "win", "lose", "win", "lose"
			};

			team106.lastFive = lastFiveMatchesKXIP2020;


			// Team 7 for Season 2020
			Team team107 = new Team();

			team107.teamName = "Chennai Super Kings";
			team107.matches = 14;
			team107.wins = 6;
			team107.losses = 8;
			team107.nrr = "-0.455";
			team107.points = 12;

			String lastFiveMatchesCSK2020[] = {
				"lose", "win", "lose", "lose", "win"
			};

			team107.lastFive = lastFiveMatchesCSK2020;


			// Team 8 for Season 2020
			Team team108 = new Team();

			team108.teamName = "Rajasthan Royals";
			team108.matches = 14;
			team108.wins = 6;
			team108.losses = 8;
			team108.nrr = "-0.569";
			team108.points = 12;

			String lastFiveMatchesRR2020[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team108.lastFive = lastFiveMatchesRR2020;


			// Team 1 for Season 2021
			Team team109 = new Team();

			team109.teamName = "Delhi Capitals";
			team109.matches = 14;
			team109.wins = 10;
			team109.losses = 4;
			team109.nrr = "+0.481";
			team109.points = 20;

			String lastFiveMatchesDC2021[] = {
				"win", "win", "lose", "win", "win"
			};

			team109.lastFive = lastFiveMatchesDC2021;


			// Team 2 for Season 2021
			Team team110 = new Team();

			team110.teamName = "Chennai Super Kings";
			team110.matches = 14;
			team110.wins = 9;
			team110.losses = 5;
			team110.nrr = "+0.455";
			team110.points = 18;

			String lastFiveMatchesCSK2021[] = {
				"win", "win", "lose", "win", "win"
			};

			team110.lastFive = lastFiveMatchesCSK2021;


			// Team 3 for Season 2021
			Team team111 = new Team();

			team111.teamName = "Royal Challengers Bangalore";
			team111.matches = 14;
			team111.wins = 9;
			team111.losses = 5;
			team111.nrr = "-0.140";
			team111.points = 18;

			String lastFiveMatchesRCB2021[] = {
				"lose", "win", "win", "lose", "win"
			};

			team111.lastFive = lastFiveMatchesRCB2021;


			// Team 4 for Season 2021
			Team team112 = new Team();

			team112.teamName = "Kolkata Knight Riders";
			team112.matches = 14;
			team112.wins = 7;
			team112.losses = 7;
			team112.nrr = "+0.587";
			team112.points = 14;

			String lastFiveMatchesKKR2021[] = {
				"win", "win", "lose", "win", "lose"
			};

			team112.lastFive = lastFiveMatchesKKR2021;


			// Team 5 for Season 2021
			Team team113 = new Team();

			team113.teamName = "Mumbai Indians";
			team113.matches = 14;
			team113.wins = 7;
			team113.losses = 7;
			team113.nrr = "+0.116";
			team113.points = 14;

			String lastFiveMatchesMI2021[] = {
				"win", "lose", "win", "lose", "win"
			};

			team113.lastFive = lastFiveMatchesMI2021;


			// Team 6 for Season 2021
			Team team114 = new Team();

			team114.teamName = "Punjab Kings";
			team114.matches = 14;
			team114.wins = 6;
			team114.losses = 8;
			team114.nrr = "-0.001";
			team114.points = 12;

			String lastFiveMatchesPBKS2021[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team114.lastFive = lastFiveMatchesPBKS2021;


			// Team 7 for Season 2021
			Team team115 = new Team();

			team115.teamName = "Rajasthan Royals";
			team115.matches = 14;
			team115.wins = 5;
			team115.losses = 9;
			team115.nrr = "-0.993";
			team115.points = 10;

			String lastFiveMatchesRR2021[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team115.lastFive = lastFiveMatchesRR2021;


			// Team 8 for Season 2021
			Team team116 = new Team();

			team116.teamName = "Sunrisers Hyderabad";
			team116.matches = 14;
			team116.wins = 3;
			team116.losses = 11;
			team116.nrr = "-0.545";
			team116.points = 6;

			String lastFiveMatchesSRH2021[] = {
				"lose", "lose", "win", "lose", "lose"
			};

			team116.lastFive = lastFiveMatchesSRH2021;
			
			
			
			// Team 1 for Season 2022
			Team team117 = new Team();

			team117.teamName = "Gujarat Titans";
			team117.matches = 14;
			team117.wins = 10;
			team117.losses = 4;
			team117.nrr = "+0.316";
			team117.points = 20;

			String lastFiveMatchesGT2022[] = {
				"win", "win", "lose", "win", "win"
			};

			team117.lastFive = lastFiveMatchesGT2022;


			// Team 2 for Season 2022
			Team team118 = new Team();

			team118.teamName = "Rajasthan Royals";
			team118.matches = 14;
			team118.wins = 9;
			team118.losses = 5;
			team118.nrr = "+0.298";
			team118.points = 18;

			String lastFiveMatchesRR2022[] = {
				"win", "win", "lose", "win", "lose"
			};

			team118.lastFive = lastFiveMatchesRR2022;


			// Team 3 for Season 2022
			Team team119 = new Team();

			team119.teamName = "Lucknow Super Giants";
			team119.matches = 14;
			team119.wins = 9;
			team119.losses = 5;
			team119.nrr = "+0.251";
			team119.points = 18;

			String lastFiveMatchesLSG2022[] = {
				"win", "lose", "win", "win", "win"
			};

			team119.lastFive = lastFiveMatchesLSG2022;


			// Team 4 for Season 2022
			Team team120 = new Team();

			team120.teamName = "Royal Challengers Bangalore";
			team120.matches = 14;
			team120.wins = 8;
			team120.losses = 6;
			team120.nrr = "-0.253";
			team120.points = 16;

			String lastFiveMatchesRCB2022[] = {
				"win", "lose", "win", "win", "lose"
			};

			team120.lastFive = lastFiveMatchesRCB2022;


			// Team 5 for Season 2022
			Team team121 = new Team();

			team121.teamName = "Delhi Capitals";
			team121.matches = 14;
			team121.wins = 7;
			team121.losses = 7;
			team121.nrr = "+0.204";
			team121.points = 14;

			String lastFiveMatchesDC2022[] = {
				"lose", "win", "win", "lose", "win"
			};

			team121.lastFive = lastFiveMatchesDC2022;


			// Team 6 for Season 2022
			Team team122 = new Team();

			team122.teamName = "Punjab Kings";
			team122.matches = 14;
			team122.wins = 7;
			team122.losses = 7;
			team122.nrr = "+0.126";
			team122.points = 14;

			String lastFiveMatchesPBKS2022[] = {
				"win", "lose", "win", "lose", "win"
			};

			team122.lastFive = lastFiveMatchesPBKS2022;


			// Team 7 for Season 2022
			Team team123 = new Team();

			team123.teamName = "Kolkata Knight Riders";
			team123.matches = 14;
			team123.wins = 6;
			team123.losses = 8;
			team123.nrr = "+0.146";
			team123.points = 12;

			String lastFiveMatchesKKR2022[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team123.lastFive = lastFiveMatchesKKR2022;


			// Team 8 for Season 2022
			Team team124 = new Team();

			team124.teamName = "Sunrisers Hyderabad";
			team124.matches = 14;
			team124.wins = 6;
			team124.losses = 8;
			team124.nrr = "-0.379";
			team124.points = 12;

			String lastFiveMatchesSRH2022[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team124.lastFive = lastFiveMatchesSRH2022;


			// Team 9 for Season 2022
			Team team125 = new Team();

			team125.teamName = "Chennai Super Kings";
			team125.matches = 14;
			team125.wins = 4;
			team125.losses = 10;
			team125.nrr = "-0.203";
			team125.points = 8;

			String lastFiveMatchesCSK2022[] = {
				"lose", "win", "lose", "lose", "win"
			};

			team125.lastFive = lastFiveMatchesCSK2022;


			// Team 10 for Season 2022
			Team team126 = new Team();

			team126.teamName = "Mumbai Indians";
			team126.matches = 14;
			team126.wins = 4;
			team126.losses = 10;
			team126.nrr = "-0.506";
			team126.points = 8;

			String lastFiveMatchesMI2022[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team126.lastFive = lastFiveMatchesMI2022;



			// Team 1
			Team team127 = new Team();

			team127.teamName = "Gujarat Titans";
			team127.matches = 14;
			team127.wins = 10;
			team127.losses = 4;
			team127.nrr = "+0.809";
			team127.points = 20;

			String lastFiveMatchesGT2023[] = {
				"win", "win", "win", "lose", "win"
			};

			team127.lastFive = lastFiveMatchesGT2023;


			// Team 2
			Team team128 = new Team();

			team128.teamName = "Chennai Super Kings";
			team128.matches = 14;
			team128.wins = 8;
			team128.losses = 5;
			team128.nrr = "+0.652";
			team128.points = 17;

			String lastFiveMatchesCSK2023[] = {
				"win", "win", "lose", "win", "win"
			};

			team128.lastFive = lastFiveMatchesCSK2023;


			// Team 3
			Team team129 = new Team();

			team129.teamName = "Lucknow Super Giants";
			team129.matches = 14;
			team129.wins = 8;
			team129.losses = 5;
			team129.nrr = "+0.284";
			team129.points = 17;

			String lastFiveMatchesLSG2023[] = {
				"win", "lose", "win", "win", "lose"
			};

			team129.lastFive = lastFiveMatchesLSG2023;


			// Team 4
			Team team130 = new Team();

			team130.teamName = "Mumbai Indians";
			team130.matches = 14;
			team130.wins = 8;
			team130.losses = 6;
			team130.nrr = "-0.044";
			team130.points = 16;

			String lastFiveMatchesMI2023[] = {
				"win", "win", "lose", "win", "lose"
			};

			team130.lastFive = lastFiveMatchesMI2023;


			// Team 5
			Team team131 = new Team();

			team131.teamName = "Rajasthan Royals";
			team131.matches = 14;
			team131.wins = 7;
			team131.losses = 7;
			team131.nrr = "+0.148";
			team131.points = 14;

			String lastFiveMatchesRR2023[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team131.lastFive = lastFiveMatchesRR2023;


			// Team 6
			Team team132 = new Team();

			team132.teamName = "Royal Challengers Bangalore";
			team132.matches = 14;
			team132.wins = 7;
			team132.losses = 7;
			team132.nrr = "+0.135";
			team132.points = 14;

			String lastFiveMatchesRCB2023[] = {
				"win", "lose", "win", "lose", "win"
			};

			team132.lastFive = lastFiveMatchesRCB2023;


			// Team 7
			Team team133 = new Team();

			team133.teamName = "Kolkata Knight Riders";
			team133.matches = 14;
			team133.wins = 6;
			team133.losses = 8;
			team133.nrr = "-0.239";
			team133.points = 12;

			String lastFiveMatchesKKR2023[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team133.lastFive = lastFiveMatchesKKR2023;


			// Team 8
			Team team134 = new Team();

			team134.teamName = "Punjab Kings";
			team134.matches = 14;
			team134.wins = 6;
			team134.losses = 8;
			team134.nrr = "-0.304";
			team134.points = 12;

			String lastFiveMatchesPBKS2023[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team134.lastFive = lastFiveMatchesPBKS2023;


			// Team 9
			Team team135 = new Team();

			team135.teamName = "Delhi Capitals";
			team135.matches = 14;
			team135.wins = 5;
			team135.losses = 9;
			team135.nrr = "-0.808";
			team135.points = 10;

			String lastFiveMatchesDC2023[] = {
				"lose", "win", "lose", "lose", "win"
			};

			team135.lastFive = lastFiveMatchesDC2023;


			// Team 10
			Team team136 = new Team();

			team136.teamName = "Sunrisers Hyderabad";
			team136.matches = 14;
			team136.wins = 4;
			team136.losses = 10;
			team136.nrr = "-0.590";
			team136.points = 8;

			String lastFiveMatchesSRH2023[] = {
				"lose", "lose", "win", "lose", "lose"
			};

			team136.lastFive = lastFiveMatchesSRH2023;
			
			
			// Team 1
			Team team137 = new Team();

			team137.teamName = "Kolkata Knight Riders";
			team137.matches = 14;
			team137.wins = 9;
			team137.losses = 3;
			team137.nrr = "+1.428";
			team137.points = 20;

			String lastFiveMatchesKKR2024[] = {
				"win", "win", "win", "lose", "win"
			};

			team137.lastFive = lastFiveMatchesKKR2024;


			// Team 2
			Team team138 = new Team();

			team138.teamName = "Sunrisers Hyderabad";
			team138.matches = 14;
			team138.wins = 8;
			team138.losses = 5;
			team138.nrr = "+0.414";
			team138.points = 17;

			String lastFiveMatchesSRH2024[] = {
				"win", "win", "lose", "win", "win"
			};

			team138.lastFive = lastFiveMatchesSRH2024;


			// Team 3
			Team team139 = new Team();

			team139.teamName = "Rajasthan Royals";
			team139.matches = 14;
			team139.wins = 8;
			team139.losses = 6;
			team139.nrr = "+0.273";
			team139.points = 17;

			String lastFiveMatchesRR2024[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team139.lastFive = lastFiveMatchesRR2024;


			// Team 4
			Team team140 = new Team();

			team140.teamName = "Royal Challengers Bangalore";
			team140.matches = 14;
			team140.wins = 7;
			team140.losses = 7;
			team140.nrr = "+0.459";
			team140.points = 14;

			String lastFiveMatchesRCB2024[] = {
				"win", "win", "win", "win", "win"
			};

			team140.lastFive = lastFiveMatchesRCB2024;


			// Team 5
			Team team141 = new Team();

			team141.teamName = "Chennai Super Kings";
			team141.matches = 14;
			team141.wins = 7;
			team141.losses = 7;
			team141.nrr = "+0.392";
			team141.points = 14;

			String lastFiveMatchesCSK2024[] = {
				"win", "lose", "win", "lose", "win"
			};

			team141.lastFive = lastFiveMatchesCSK2024;


			// Team 6
			Team team142 = new Team();

			team142.teamName = "Delhi Capitals";
			team142.matches = 14;
			team142.wins = 7;
			team142.losses = 7;
			team142.nrr = "-0.377";
			team142.points = 14;

			String lastFiveMatchesDC2024[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team142.lastFive = lastFiveMatchesDC2024;


			// Team 7
			Team team143 = new Team();

			team143.teamName = "Lucknow Super Giants";
			team143.matches = 14;
			team143.wins = 7;
			team143.losses = 7;
			team143.nrr = "-0.667";
			team143.points = 14;

			String lastFiveMatchesLSG2024[] = {
				"lose", "win", "lose", "lose", "win"
			};

			team143.lastFive = lastFiveMatchesLSG2024;


			// Team 8
			Team team144 = new Team();

			team144.teamName = "Gujarat Titans";
			team144.matches = 14;
			team144.wins = 5;
			team144.losses = 7;
			team144.nrr = "-1.063";
			team144.points = 12;

			String lastFiveMatchesGT2024[] = {
				"win", "lose", "win", "lose", "lose"
			};

			team144.lastFive = lastFiveMatchesGT2024;


			// Team 9
			Team team145 = new Team();

			team145.teamName = "Punjab Kings";
			team145.matches = 14;
			team145.wins = 5;
			team145.losses = 9;
			team145.nrr = "-0.353";
			team145.points = 10;

			String lastFiveMatchesPBKS2024[] = {
				"win", "lose", "win", "lose", "win"
			};

			team145.lastFive = lastFiveMatchesPBKS2024;


			// Team 10
			Team team146 = new Team();

			team146.teamName = "Mumbai Indians";
			team146.matches = 14;
			team146.wins = 4;
			team146.losses = 10;
			team146.nrr = "-0.318";
			team146.points = 8;

			String lastFiveMatchesMI2024[] = {
				"lose", "win", "lose", "lose", "lose"
			};

			team146.lastFive = lastFiveMatchesMI2024;


			// Team 1
			Team team147 = new Team();

			team147.teamName = "Royal Challengers Bangalore";
			team147.matches = 14;
			team147.wins = 9;
			team147.losses = 4;
			team147.nrr = "+0.301";
			team147.points = 19;

			String lastFiveMatchesRCB2025[] = {
				"win", "win", "lose", "win", "win"
			};

			team147.lastFive = lastFiveMatchesRCB2025;


			// Team 2
			Team team148 = new Team();

			team148.teamName = "Punjab Kings";
			team148.matches = 14;
			team148.wins = 9;
			team148.losses = 4;
			team148.nrr = "+0.372";
			team148.points = 19;

			String lastFiveMatchesPBKS2025[] = {
				"win", "win", "win", "lose", "win"
			};

			team148.lastFive = lastFiveMatchesPBKS2025;


			// Team 3
			Team team149 = new Team();

			team149.teamName = "Gujarat Titans";
			team149.matches = 14;
			team149.wins = 9;
			team149.losses = 5;
			team149.nrr = "+0.254";
			team149.points = 18;

			String lastFiveMatchesGT2025[] = {
				"win", "lose", "win", "win", "lose"
			};

			team149.lastFive = lastFiveMatchesGT2025;


			// Team 4
			Team team150 = new Team();

			team150.teamName = "Mumbai Indians";
			team150.matches = 14;
			team150.wins = 8;
			team150.losses = 6;
			team150.nrr = "+1.142";
			team150.points = 16;

			String lastFiveMatchesMI2025[] = {
				"win", "win", "lose", "win", "win"
			};

			team150.lastFive = lastFiveMatchesMI2025;


			// Team 5
			Team team151 = new Team();

			team151.teamName = "Delhi Capitals";
			team151.matches = 14;
			team151.wins = 7;
			team151.losses = 6;
			team151.nrr = "+0.011";
			team151.points = 15;

			String lastFiveMatchesDC2025[] = {
				"lose", "win", "lose", "win", "win"
			};

			team151.lastFive = lastFiveMatchesDC2025;


			// Team 6
			Team team152 = new Team();

			team152.teamName = "Sunrisers Hyderabad";
			team152.matches = 14;
			team152.wins = 6;
			team152.losses = 7;
			team152.nrr = "-0.064";
			team152.points = 13;

			String lastFiveMatchesSRH2025[] = {
				"win", "lose", "win", "lose", "lose"
			};

			team152.lastFive = lastFiveMatchesSRH2025;


			// Team 7
			Team team153 = new Team();

			team153.teamName = "Lucknow Super Giants";
			team153.matches = 14;
			team153.wins = 6;
			team153.losses = 8;
			team153.nrr = "-0.376";
			team153.points = 12;

			String lastFiveMatchesLSG2025[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team153.lastFive = lastFiveMatchesLSG2025;


			// Team 8
			Team team154 = new Team();

			team154.teamName = "Rajasthan Royals";
			team154.matches = 14;
			team154.wins = 4;
			team154.losses = 10;
			team154.nrr = "-0.549";
			team154.points = 8;

			String lastFiveMatchesRR2025[] = {
				"lose", "lose", "win", "lose", "lose"
			};

			team154.lastFive = lastFiveMatchesRR2025;


			// Team 9
			Team team155 = new Team();

			team155.teamName = "Kolkata Knight Riders";
			team155.matches = 14;
			team155.wins = 5;
			team155.losses = 7;
			team155.nrr = "-0.305";
			team155.points = 12;

			String lastFiveMatchesKKR2025[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team155.lastFive = lastFiveMatchesKKR2025;


			// Team 10
			Team team156 = new Team();

			team156.teamName = "Chennai Super Kings";
			team156.matches = 14;
			team156.wins = 4;
			team156.losses = 10;
			team156.nrr = "-0.647";
			team156.points = 10;

			String lastFiveMatchesCSK2025[] = {
				"lose", "win", "lose", "lose", "lose"
			};

			team156.lastFive = lastFiveMatchesCSK2025;



			// Team 1
			Team team157 = new Team();

			team157.teamName = "Royal Challengers Bengaluru";
			team157.matches = 14;
			team157.wins = 9;
			team157.losses = 5;
			team157.nrr = "+0.783";
			team157.points = 18;

			String lastFiveMatchesRCB2026[] = {
				"win", "win", "lose", "win", "win"
			};

			team157.lastFive = lastFiveMatchesRCB2026;


			// Team 2
			Team team158 = new Team();

			team158.teamName = "Gujarat Titans";
			team158.matches = 14;
			team158.wins = 9;
			team158.losses = 5;
			team158.nrr = "+0.695";
			team158.points = 18;

			String lastFiveMatchesGT2026[] = {
				"win", "win", "lose", "win", "lose"
			};

			team158.lastFive = lastFiveMatchesGT2026;


			// Team 3
			Team team159 = new Team();

			team159.teamName = "Sunrisers Hyderabad";
			team159.matches = 14;
			team159.wins = 9;
			team159.losses = 5;
			team159.nrr = "+0.524";
			team159.points = 18;

			String lastFiveMatchesSRH2026[] = {
				"win", "lose", "win", "win", "win"
			};

			team159.lastFive = lastFiveMatchesSRH2026;


			// Team 4
			Team team160 = new Team();

			team160.teamName = "Rajasthan Royals";
			team160.matches = 14;
			team160.wins = 8;
			team160.losses = 6;
			team160.nrr = "+0.238";
			team160.points = 16;

			String lastFiveMatchesRR2026[] = {
				"win", "win", "lose", "win", "lose"
			};

			team160.lastFive = lastFiveMatchesRR2026;


			// Team 5
			Team team161 = new Team();

			team161.teamName = "Punjab Kings";
			team161.matches = 14;
			team161.wins = 7;
			team161.losses = 6;
			team161.nrr = "+0.309";
			team161.points = 15;

			String lastFiveMatchesPBKS2026[] = {
				"win", "lose", "lose", "win", "win"
			};

			team161.lastFive = lastFiveMatchesPBKS2026;


			// Team 6
			Team team162 = new Team();

			team162.teamName = "Delhi Capitals";
			team162.matches = 14;
			team162.wins = 7;
			team162.losses = 7;
			team162.nrr = "-0.651";
			team162.points = 14;

			String lastFiveMatchesDC2026[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team162.lastFive = lastFiveMatchesDC2026;


			// Team 7
			Team team163 = new Team();

			team163.teamName = "Kolkata Knight Riders";
			team163.matches = 14;
			team163.wins = 7;
			team163.losses = 7;
			team163.nrr = "-0.305";
			team163.points = 14;

			String lastFiveMatchesKKR2026[] = {
				"win", "lose", "win", "lose", "win"
			};

			team163.lastFive = lastFiveMatchesKKR2026;


			// Team 8
			Team team164 = new Team();

			team164.teamName = "Chennai Super Kings";
			team164.matches = 14;
			team164.wins = 6;
			team164.losses = 8;
			team164.nrr = "-0.345";
			team164.points = 12;

			String lastFiveMatchesCSK2026[] = {
				"lose", "win", "lose", "win", "lose"
			};

			team164.lastFive = lastFiveMatchesCSK2026;


			// Team 9
			Team team165 = new Team();

			team165.teamName = "Mumbai Indians";
			team165.matches = 14;
			team165.wins = 6;
			team165.losses = 8;
			team165.nrr = "-0.106";
			team165.points = 12;

			String lastFiveMatchesMI2026[] = {
				"win", "lose", "lose", "win", "lose"
			};

			team165.lastFive = lastFiveMatchesMI2026;


			// Team 10
			Team team166 = new Team();

			team166.teamName = "Lucknow Super Giants";
			team166.matches = 14;
			team166.wins = 4;
			team166.losses = 10;
			team166.nrr = "-0.740";
			team166.points = 8;

			String lastFiveMatchesLSG2026[] = {
				"lose", "win", "lose", "lose", "lose"
			};

			team166.lastFive = lastFiveMatchesLSG2026;





		
		// Connect all teams to Season 2008
		
		Team[] teamsForSeason2008 = {
		team1, team2, team3, team4,
		team5, team6, team7, team8
	};
	
	    season1.teams = teamsForSeason2008;
	
	// Connect all teams to Season 2009
         Team[] teamsForSeason2009 = {
		team9, team10, team11, team12,
		team13, team14, team15, team16
		
		
};
       season2.teams = teamsForSeason2009;
	   
	   
	  // Connect all teams to Season 2010
         Team[] teamsForSeason2010 = {
		team17, team18, team19, team20,
		team21, team22, team23, team24
		 };
		 
	 season3.teams =  teamsForSeason2010;
	 
	 // Connect all teams to Season 2011
      Team[] teamsForSeason2011 = {
      team25, team26, team27, team28, team29,
      team30, team31, team32, team33,team34
};
     season4.teams = teamsForSeason2011;
	 
	 // Connect all teams to Season 2012
		Team[] teamsForSeason2012 = {
			team35, team36, team37, team38, team39,
			team40, team41, team42, team43
		};
        
		season5.teams = teamsForSeason2012;
		
		// Connect all teams to Season 2013
		Team[] teamsForSeason2013 = {
			team44, team45, team46, team47, team48,
			team49, team50, team51, team52
		};

		season6.teams = teamsForSeason2013;
		
		// Connect all teams to Season 2014
		Team[] teamsForSeason2014 = {
			team53, team54, team55, team56,
			team57, team58, team59, team60
		};

		season7.teams = teamsForSeason2014;
		
		// Connect all teams to Season 2015
		Team[] teamsForSeason2015 = {
			team61, team62, team63, team64,
			team65, team66, team67, team68
		};

		season8.teams = teamsForSeason2015;
		
		// Connect all teams to Season 2016
		Team[] teamsForSeason2016 = {
			team69, team70, team71, team72,
			team73, team74, team75, team76
		};

		season9.teams = teamsForSeason2016;
		
		// Connect all teams to Season 2017
		Team[] teamsForSeason2017 = {
			team77, team78, team79, team80,
			team81, team82, team83, team84
		};

		season10.teams = teamsForSeason2017;
		
		
		
		// Connect all teams to Season 2018
		Team[] teamsForSeason2018 = {
			team85, team86, team87, team88,
			team89, team90, team91, team92
		};

		season11.teams = teamsForSeason2018;
		
		
		// Connect all teams to Season 2019
		Team[] teamsForSeason2019 = {
			team93, team94, team95, team96,
			team97, team98, team99, team100
		};

		season12.teams = teamsForSeason2019;
		
		
		// Connect all teams to Season 2020
		Team[] teamsForSeason2020 = {
			team101, team102, team103, team104,
			team105, team106, team107, team108
		};

		season13.teams = teamsForSeason2020;
		
		// Connect all teams to Season 2021
		Team[] teamsForSeason2021 = {
			team109, team110, team111, team112,
			team113, team114, team115, team116
		};

		season14.teams = teamsForSeason2021;
		
		// Connect all teams to Season 2022
		Team[] teamsForSeason2022 = {
			team117, team118, team119, team120, team121,
			team122, team123, team124, team125, team126
		};

		season15.teams = teamsForSeason2022;
		
		// Connect all teams to Season 2023
		Team[] teamsForSeason2023 = {
			team127, team128, team129, team130, team131,
			team132, team133, team134, team135, team136
		};

		season16.teams = teamsForSeason2023;
		
		// Connect all teams to Season 2024
		Team[] teamsForSeason2024 = {
			team137, team138, team139, team140, team141,
			team142, team143, team144, team145, team146
		};

		season17.teams = teamsForSeason2024;
		
		
		// Connect all teams to Season 2025
		Team[] teamsForSeason2025 = {
			team147, team148, team149, team150, team151,
			team152, team153, team154, team155, team156
		};

		season18.teams = teamsForSeason2025;
		
		
		
		// Connect all teams to Season 2026
		Team[] teamsForSeason2026 = {
			team157, team158, team159, team160, team161,
			team162, team163, team164, team165, team166
		};

		season19.teams = teamsForSeason2026;
							 
		 //create season array
		 Season[] seasons = {season1,season2,season3,season4,season5,season6,season7,
							 season8,season9,season10,season11,season12,season13,
							 season14,season15,season16,season17,season18,season19};
	 
	 //connect season array  to table
	 table.season = seasons;
	 
	 //connect table to ipl
	 ipl.table = table;
	 
	 ipl.iplDetails();
	
	
	
	
	}
	
	
	
}