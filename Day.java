class Day{
	
	Event events[];
	String name;
	
	public void printDayDetails(){

		System.out.println();
        System.out.println("========================================");
        System.out.println("DAY : " + name);
        System.out.println("========================================");
		for(Event event:events){
			event.printMeetingDetails();
			
			
			
		}
		
		
		
		
	}



}