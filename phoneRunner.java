class PhoneRunner{
	
	public static void main(String[] a){
		
		System.out.println("starting ultimate phone simulation");
		
		Phone phoneA = new Phone("samsung",200000);
		phoneA.displayDetails();
	
	   
		Phone phoneB = new Phone();
		phoneB.displayDetails();
		
		Phone phoneC = new Phone("vivo");
		phoneC.displayDetails();
		

	}
}