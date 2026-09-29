class TeamsRunner{
	
	public static void main(String[] schedule){
		
		Invitee invitee = new Invitee();
		
	     Meeting meeting = new Meeting();
		 
		 Calender calender = new Calender();
		 
		  Teams teams = new Teams();
		  
		  //Invitee Details
		  
		  invitee.name = "Sneha";
		  invitee.eMail = "sneha@gmail.com";
		  invitee.phoneNumber = 9741404704L;
		  
		  //Meeting Details
		  meeting.title = "Java Project Discussion";
		  meeting.date = "21-08-2026";
		  meeting.startTime = "10:00 AM";
		  meeting.endTime = "11:00 AM";
		  meeting.duration = "1 Hour";
		  meeting.isAllDayEvent = false;
		  
		  //Meeting Has-A invitee
		  meeting.invitee = invitee;
		  
		  //Calender Has-A meeting
		  
		  calender.meeting = meeting;
		  //Teams Has-A calender
		  teams.calender = calender;
		  
		  teams.printTeamsDetails();
		  
		  
		  
		  
	
		
		
		
		
		
		
		
	}




}