class Event{
	
	Invitee invitees[];
	String title;
	String date;
	String startTime;
	String endTime;
	boolean isAllDayEvent;
	boolean isTeamEvent;
	
	
	public void printMeetingDetails(){
		 System.out.println("----------------------------------------");
        System.out.println("EVENT DETAILS");
        System.out.println("----------------------------------------");

        System.out.println("Title          : " + title);
        System.out.println("Date           : " + date);
        System.out.println("Start Time     : " + startTime);
        System.out.println("End Time       : " + endTime);
        System.out.println("All Day Event  : " + isAllDayEvent);
        System.out.println("Team Event     : " + isTeamEvent);

        System.out.println();
        System.out.println("INVITEES");
        System.out.println("----------------------------------------");
		
		  
		  for(Invitee invitee:invitees){
			  invitee.getInviteeDetails();
			  
			  
			  
		  }
		
		
	}
	
	


}