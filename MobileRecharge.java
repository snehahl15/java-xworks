class MobileRecharge {

    static String customerName;
    static long mobileNumber;
    static String operatorName;
    static double rechargeAmount;
    static String planValidity;
    static String paymentMode;
    static String transactionId;
    static boolean isRechargeSuccessful;

    public static boolean rechargeMobile(
            String cName,
            long phoneNumber,
            String operator,
            double amount,
            String validity,
            String payment,
            String txnId,
            boolean status) {

        isRechargeSuccessful = false;

        customerName = cName;
        mobileNumber = phoneNumber;
        operatorName = operator;
        rechargeAmount = amount;
        planValidity = validity;
        paymentMode = payment;
        transactionId = txnId;

        isRechargeSuccessful = status;

        return isRechargeSuccessful;
    }

    public static void fetchRechargeDetails() {

        System.out.println("Customer Name        : " + customerName);
        System.out.println("Mobile Number        : " + mobileNumber);
        System.out.println("Operator Name        : " + operatorName);
        System.out.println("Recharge Amount      : " + rechargeAmount);
        System.out.println("Plan Validity        : " + planValidity);
        System.out.println("Payment Mode         : " + paymentMode);
        System.out.println("Transaction ID       : " + transactionId);
        System.out.println("Recharge Successful  : " + isRechargeSuccessful);
        System.out.println("--------------------------------------------");
    }
}