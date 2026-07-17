class MaxAccountRunner{
	public static void main (String[]args){
 boolean isMaxAccountCreated =MaxAccount.createMaxAccount("Sneha","hl","10/11/2005",12345567890L,"sneha@gmail.com","sneha@123");
System.out.println(isMaxAccountCreated);
MaxAccount.fetchMaxAccountDetails();

}
}