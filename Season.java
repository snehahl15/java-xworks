class Season{
Team teams[];

int seasonYear;


   public void seasonInfo(){
	   System.out.println("season:"+seasonYear);
	   System.out.println("Team                         M       W       L       NRR       pts       Last 5       ");
	   
	   for(Team anyTeam:teams){
		   anyTeam.teamInfo();
	   
	   
   }
	

}
}