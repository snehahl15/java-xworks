class PoliceStation {

    static String complainantName;
    static String complaintId;
    static String complaintType;
    static String incidentLocation;
    static String complaintDate;
    static long mobileNumber;
    static String investigatingOfficer;
    static boolean isComplaintRegistered;

    public static boolean registerComplaint(
            String cName,
            String cId,
            String cType,
            String location,
            String date,
            long phoneNumber,
            String officerName,
            boolean registered) {

        isComplaintRegistered = false;

        complainantName = cName;
        complaintId = cId;
        complaintType = cType;
        incidentLocation = location;
        complaintDate = date;
        mobileNumber = phoneNumber;
        investigatingOfficer = officerName;

        isComplaintRegistered = registered;

        return isComplaintRegistered;
    }

    public static void fetchComplaintDetails() {

        System.out.println("Complainant Name      : " + complainantName);
        System.out.println("Complaint ID          : " + complaintId);
        System.out.println("Complaint Type        : " + complaintType);
        System.out.println("Incident Location     : " + incidentLocation);
        System.out.println("Complaint Date        : " + complaintDate);
        System.out.println("Mobile Number         : " + mobileNumber);
        System.out.println("Investigating Officer : " + investigatingOfficer);
        System.out.println("Complaint Registered  : " + isComplaintRegistered);
        System.out.println("-----------------------------------------");
    }
}