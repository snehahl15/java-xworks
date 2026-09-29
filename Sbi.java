class Sbi{
	
	int bankId;
	String branch;
	String bankName;
	String address;
	String ifscCode;
	String micrCode;
	double balance;
	long phoneNo;
	int accNo;
	
	
	Sbi(){
		this(1,"Bhasham circle"); 
	}
	
	
	Sbi(int bankId,String branch ){
		this(2,786589999L,27867677);
		System.out.println("cons invoked");
		
		
		this.bankId=bankId;
		this.branch=branch;
		
}

	Sbi(int bankId,long phoneNo,int accNo){
		
		this.balance=balance;
		this.bankId=bankId;
		this.branch=branch;
		
	}
	
	public void printSbiDetails(){
		//this();
		//Sbi();
		p();
		System.out.println(""+bankId);
	
	}
	public void p(){
	
}