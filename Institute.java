class Institute {

    static String studentName;
    static String courseName;
    static String instituteId;
    static String trainerName;
    static long mobileNumber;
    static double courseFee;
    static String batchTiming;
    static boolean isAdmissionDone;

    public static boolean createAdmission(
            String sName,
            String cName,
            String iId,
            String tName,
            long phoneNumber,
            double fee,
            String batch,
            boolean admitted) {

        isAdmissionDone = false;

        studentName = sName;
        courseName = cName;
        instituteId = iId;
        trainerName = tName;
        mobileNumber = phoneNumber;
        courseFee = fee;
        batchTiming = batch;
        isAdmissionDone = admitted;

        return isAdmissionDone;
    }

    public static void fetchAdmissionDetails() {

        System.out.println("Student Name      : " + studentName);
        System.out.println("Course Name       : " + courseName);
        System.out.println("Institute ID      : " + instituteId);
        System.out.println("Trainer Name      : " + trainerName);
        System.out.println("Mobile Number     : " + mobileNumber);
        System.out.println("Course Fee        : " + courseFee);
        System.out.println("Batch Timing      : " + batchTiming);
        System.out.println("Admission Status  : " + isAdmissionDone);
        System.out.println("-----------------------------------------");
    }
}