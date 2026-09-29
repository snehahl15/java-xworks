class Airport{
	
	//instance variable
	int airportCode;
	String cityName;

	
	//custom Datatype
	Terminal terminal;
	
	public void getAirportDetails(){
		System.out.println("airportCode:"+airportCode);
		System.out.println("cityName:"+cityName);
		terminal.getTerminalDetails();
		
		
		
	}


}