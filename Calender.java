class Calender{
	
	Day days[];
	
	
	public void printCalenderDetails(){
		
		System.out.println();
        System.out.println("########################################");
        System.out.println("           CALENDER DETAILS");
        System.out.println("########################################");
		
		for(Day day:days){
			day.printDayDetails();
		}
		 System.out.println("########################################");
        System.out.println("         END OF CALENDER");
        System.out.println("########################################");
			
		
		
		
	}
	
	
}