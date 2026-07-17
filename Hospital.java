class Hospital {
    static String patientName;
    static int patientId;
    static int age;
    static String disease;
    static String doctorName;
    static long phoneNumber;
    static double consultationFee;
    static boolean isAdmitted;

    public static boolean createHospitalRecord(String pName,int pId,int patientAge,String illness,
            String dName,long mobile,double fee,boolean admitted){
				isAdmitted=false;
        patientName=pName;
        patientId=pId;
        age=patientAge;
        disease=illness;
        doctorName=dName;
        phoneNumber=mobile;
        consultationFee=fee;
        isAdmitted=admitted;
		isAdmitted=true;
        return isAdmitted;
    }

    public static void fetchHospitalDetails(){
        System.out.println("Patient Name: "+patientName);
        System.out.println("Patient Id: "+patientId);
        System.out.println("Age: "+age);
        System.out.println("Disease: "+disease);
        System.out.println("Doctor: "+doctorName);
        System.out.println("Phone: "+phoneNumber);
        System.out.println("Fee: "+consultationFee);
        System.out.println("Admitted: "+isAdmitted);
        System.out.println("-------------------------");
    }
}
