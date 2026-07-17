class MaxAccount{
static  String firstName;
static String lastName;
static String dateOfBirth;
static long phoneNumber;
static String eMail;
static String password;
static boolean isCreated;

 public static boolean createMaxAccount(String fName,String lName,String dob,long mobileNumber,String mailID,String pwd){
isCreated=false;
firstName=fName;
lastName=lName;
dateOfBirth=dob;
phoneNumber=mobileNumber;
eMail=mailID;
password=pwd;
isCreated=true;
return isCreated;
}
 public static void fetchMaxAccountDetails() {

System.out.println("The First Name is:"+firstName);
System.out.println("The Last Name is:"+lastName);
System.out.println("The  Date Of Birth is:"+dateOfBirth);
System.out.println("The Mobile Number  is:"+phoneNumber);
System.out.println("The  Email ID is:"+eMail);
System.out.println("The password is:"+password);

	
}

}
