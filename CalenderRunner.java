class CalenderRunner{
	
	
	public static void main (String[] a){
		
		Calender calender = new Calender();
		
		
		//monday meeting1
		
		Day monday = new Day();
		monday.name = "Monday";
		
		Event event1 = new Event();
		event1.title = "Daily Catch-up";
		
		event1.date ="10-11-2026";
		event1.startTime = "10 AM";
		event1.endTime = "11 AM";
		event1.isAllDayEvent = false;
		event1.isTeamEvent = false;
		
			Invitee invitee1 = new Invitee();
			invitee1.eMail = "komala@gmail.com";
			invitee1.name = "komala";
			invitee1.phoneNumber = 8767876789l;
		

            Invitee invitee2 = new Invitee();
			invitee2.eMail= "sneha@gmail.com";
			invitee2.name = "sneha";
			invitee2.phoneNumber =9876543290l;
			
            Invitee invitee3 = new Invitee();
			invitee3.eMail= "meena@gmail.com";
			invitee3.name = "meena";
			invitee3.phoneNumber =9876543290l;
			
			Invitee inviteesOnMondayMeeting1[] = {invitee1 , invitee2 , invitee3};
			 event1.invitees = inviteesOnMondayMeeting1;
		
		
		  //Monday Event2
		
		
		Event event2 = new Event();
		
		event2.title = "Conversation on AI Implementation";
		
		event2.date ="10-11-2026";
		event2.startTime = "12 AM";
		event2.endTime = "1 PM";
		event2.isAllDayEvent = true;
		event2.isTeamEvent = true;
		
		Invitee invitee4 = new Invitee();
		
		
			invitee4.eMail = "komala@gmail.com";
			invitee4.name = "komala";
			invitee4.phoneNumber = 8767876789l;

            Invitee invitee5 = new Invitee();
			
			invitee5.eMail = "pradeep@gmail.com";
			invitee5.name = "pradeep";
			invitee5.phoneNumber = 8767876789l;
			
            Invitee invitee6 = new Invitee();

             invitee6.eMail = "dileep@gmail.com";
			invitee6.name =" dileep";
			invitee6.phoneNumber = 8767876789l;			
			
			Invitee inviteesOnMondayMeeting2[] = {invitee4 , invitee5 , invitee6};
			 event2.invitees = inviteesOnMondayMeeting2;
		
		
		Event mondayEvents[] = {event1 , event2};
		monday.events = mondayEvents;
		
		//Tuesdayy eventss
		Day tuesday = new Day();
		tuesday.name = "Tuesday";
		
		Event event3 = new Event();
		
		event3.title = "Conversation on AI Implementation";
		
		event3.date ="11-11-2026";
		event3.startTime = "12 AM";
		event3.endTime = "1 PM";
		event3.isAllDayEvent = true;
		event3.isTeamEvent = true; 
		
		
		
		
		Invitee invitee7 = new Invitee();
		    invitee7.eMail = "pradeep@gmail.com";
			invitee7.name = "pradeep";
			invitee7.phoneNumber = 8767876789l;
		
		Invitee invitee8 = new Invitee();
		
		     invitee8.eMail = "dileep@gmail.com";
			invitee8.name = "dileep";
			invitee8.phoneNumber = 8767876789l;	
		
		
		Invitee inviteesOnTuesdayMeeting1[] = {invitee7 , invitee8};
			 event3.invitees = inviteesOnTuesdayMeeting1;
			 
			 
			Event event4 = new Event(); 
			
		event4.title = "Conversation on chatboat Implementation";
		
		event4.date ="11-11-2026";
		event4.startTime = "3 PM";
		event4.endTime = " 4PM";
		event4.isAllDayEvent = true;
		event4.isTeamEvent = true;
			
			
			
		Invitee invitee9 = new Invitee();
		    invitee9.eMail = "bhagya@gmail.com";
			invitee9.name = "Bhagya";
			invitee9.phoneNumber = 8767976789l;	
		
		
		Invitee invitee10 = new Invitee();
		
		     invitee10.eMail = "lakshmi@gmail.com";
			invitee10.name = "Lakshmi";
			invitee10.phoneNumber = 8767876689l;	
		
		
		Invitee inviteesOnTuesdayMeeting2[] = {invitee9, invitee10};
			 event4.invitees = inviteesOnTuesdayMeeting2;
			 
			 
			 Event event5 = new Event(); 
			 
			 
		event5.title = "Sick-leave";
		
		event5.date =null;
		event5.startTime = null;
		event5.endTime = null;
		event5.isAllDayEvent = false;
		event5.isTeamEvent = false; 
			 
			 
			 
			 
			 Invitee invitee11 = new Invitee();
			 
			 invitee11.eMail = null;
			invitee11.name = null;
			invitee11.phoneNumber = 0;
			 
			 Invitee invitee12 = new Invitee();
			 
			 invitee12.eMail = null;
			invitee12.name = null;
			invitee12.phoneNumber = 0;
			 
		
			 
			 
			 Invitee inviteesOnTuesdayMeeting3[] = {invitee11, invitee12};
			 event5.invitees = inviteesOnTuesdayMeeting3;
			 
			 
			 
			 Event tuesdayEvents[] = {event3 , event4,event5};
		    tuesday.events = tuesdayEvents;
		
			
			
			
		
		Day days[] = {monday , tuesday};
		
         calender.days = days;
		 calender.printCalenderDetails();
		
		
		
	
		
	}



}