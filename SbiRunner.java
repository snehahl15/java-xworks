class SbiRunner{
	
	public static void main(String []aa){
		
		Sbi bank=new Sbi();
		System.out.println("BankId:"+bank.bankId);
		System.out.println("balance:"+bank.balance);
		
		
		Sbi bank1=new Sbi();
		System.out.println("BankId:"+bank1.bankId);
		System.out.println("balance:"+bank1.balance);
		
		
		Sbi bank2=new Sbi();
		bank2.bankId=2;
		System.out.println("BankId:"+bank1.bankId);
		
		
	}
}