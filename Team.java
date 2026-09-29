class Team{
	String teamName;
	int matches;
	int wins;
	int losses;
	String nrr;
	int points;
	String lastFive[];
	
	public void teamInfo(){
		System.out.print(teamName + "       " +
        matches + "            " +
        wins + "       " +
        losses + "       " +
        nrr + "       " +
        points + "       ");

		for(String result:lastFive){
			System.out.print(result+" ");
			
			
		}
		System.out.println();
		
		
		
	}	

}
	
	