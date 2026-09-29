class Phone{
	
	String brand;
	int price;
	
	public Phone(){
		this("apple");
	
		System.out.println("Shortcut1 constructor finished");
		
		
	}
	
	public Phone(String brand){
		this(brand,1000);
		System.out.println("Shortcut2 constructor finished");
	
	}
	public Phone(String brand,int price){
		this.brand = brand;
		this.price = price;
		System.out.println("master constructor finished");
		
		
	}
	
	 public void displayDetails() {
        System.out.println("Phone Details -> Brand: " + brand + " | Price: Rs. " + price);
        System.out.println("----------------------------------------------");
    }
}