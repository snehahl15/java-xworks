class RTO{
static String applicantName;
static String licenceNumber;
static int age;
static String vehicleType;
static String address;
static long mobileNumber;
static double licenceFee;
static boolean isLicenceCreated;


public static boolean createDrivingLicence(
    String aName,
    String lNumber,
    int applicantAge,
    String vType,
    String applicantAddress,
    long phoneNumber,
    double fee,
    boolean created
){
	 isLicenceCreated = false;

        applicantName = aName;
        licenceNumber = lNumber;
        age = applicantAge;
        vehicleType = vType;
        address = applicantAddress;
        mobileNumber = phoneNumber;
        licenceFee = fee;

        isLicenceCreated = created;
		isLicenceCreated=true;

        return isLicenceCreated;
}

    public static void fetchDrivingLicenceDetails() {

        System.out.println("Applicant Name      : " + applicantName);
        System.out.println("Licence Number      : " + licenceNumber);
        System.out.println("Age                 : " + age);
        System.out.println("Vehicle Type        : " + vehicleType);
        System.out.println("Address             : " + address);
        System.out.println("Mobile Number       : " + mobileNumber);
        System.out.println("Licence Fee         : " + licenceFee);
        System.out.println("Licence Created     : " + isLicenceCreated);
        System.out.println("----------------------------------------");
    }



}