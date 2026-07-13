class WhatsApp{
	public static void createAccount(
	             String name,
				 String profilePhoto,
	             String about,
				 String country,
	            String language,
				long mobileNumber){
		System.out.println("WhatsAPP Account Created");
		System.out.println("User Name is:"+name);
		System.out.println("Profile Photo:"+profilePhoto);
		System.out.println("About:"+about);
		System.out.println("Country:"+country);
		System.out.println("Lnguage:"+language);
		System.out.println("Mobile Number:"+mobileNumber);
		
		
		
	}
	public static void main (String[] args){
		createAccount("Sneha H L","My Photo","!!!!","India","English",636331967L);
	}
}