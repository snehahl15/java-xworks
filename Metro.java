class Metro{
	public static void main (String[]args){
		String metroName="Namma Metro";
		String city="bangalore";
		String operator="BMRCL";
		
		String[]greenline={"Madavara","Chikkabidarakallu","Manjunathanagar","Nagasandra","Dasarahalli","jalahalli",
		"Peenyaindustry","peenya","Goraguntepalya","Yashvanthpur","Sandal Soap Factory","Mhalakshmi","Rajajinagar",
		"Kuvempu Road","Majestic","Chickpete","KR Market","National College","Lalbag","South End Circle","Jayanagar",
		"Banashankari","JP Nagar","Yelachehalli","Konakunte Cross","Doddakallasandra","Vajarahalli","Silk Institute"};
		String[]purpleline={"Whitefield", "Hopefarm Channasandra", "Kadugodi Tree Park", "Pattandur Agrahara",
		"Sri Sathya Sai Hospital", "Nallur Halli", "Kundalahalli", "Siddapura", "Garudacharapalya", "Hoodi", 
		"Seetharam Palya", "Krishnarajapuram", "Baiyappanahalli", "Swami Vivekananda Road", "Indiranagar",
		"Halasuru", "Trinity", "MG Road", "Cubbon Park", "Vidhana Soudha", "Majestic", "Vijayanagar", "Attiguppe",
		"Deepanjali Nagar", "Mysore Road", "Kengeri", "Challaghatta"};
		
	System.out.println("MetroName:"+metroName);
		System.out.println("City:"+city);
		System.out.println("operator:"+operator);
		System.out.println("The Greenline Stations Are:");
		for(String Station:greenline){
			System.out.println(Station);
		}
		System.out.println("The Purpleline Stations Are:");
	for(String Station:purpleline){
		System.out.println(Station);
	}
	}
}