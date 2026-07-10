class Amazon{
public static double search(String item){
	System.out.println("Search started");
	System.out.println(item);
	double prize=99.00;
	System.out.println(" price of " + item + " is "+ price);
	System.out.println("Search ended");
	
}
public static void main (String[] args){
	System.out.println("main started");
	String item="pizza";
	
	search();
	System.out.println("main ended");

}
}