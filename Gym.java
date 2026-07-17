class Gym {

    static String memberName;
    static String membershipId;
    static int age;
    static String membershipType;
    static String trainerName;
    static long mobileNumber;
    static double membershipFee;
    static boolean isMembershipCreated;

    public static boolean createGymMembership(
            String mName,
            String mId,
            int memberAge,
            String mType,
            String tName,
            long phoneNumber,
            double fee,
            boolean created) {

        isMembershipCreated = false;

        memberName = mName;
        membershipId = mId;
        age = memberAge;
        membershipType = mType;
        trainerName = tName;
        mobileNumber = phoneNumber;
        membershipFee = fee;

        isMembershipCreated = created;

        return isMembershipCreated;
    }

    public static void fetchGymMembershipDetails() {

        System.out.println("Member Name        : " + memberName);
        System.out.println("Membership ID      : " + membershipId);
        System.out.println("Age                : " + age);
        System.out.println("Membership Type    : " + membershipType);
        System.out.println("Trainer Name       : " + trainerName);
        System.out.println("Mobile Number      : " + mobileNumber);
        System.out.println("Membership Fee     : " + membershipFee);
        System.out.println("Membership Created : " + isMembershipCreated);
        System.out.println("--------------------------------------");
    }
}