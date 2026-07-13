class SBI {

    public static void main(String[] args) {


        String bankName = "State Bank of India";
        String city = "Bangalore";
        String bankType = "Public Sector Bank";


        String[] bangaloreBranches = {

            "SBI MG Road Branch",
            "SBI Koramangala Branch",
            "SBI Indiranagar Branch",
            "SBI Jayanagar Branch",
            "SBI Whitefield Branch",
            "SBI Electronic City Branch",
            "SBI Marathahalli Branch",
            "SBI Yeshwanthpur Branch",
            "SBI Malleshwaram Branch",
            "SBI Rajajinagar Branch",
            "SBI Vijayanagar Branch",
            "SBI Banashankari Branch",
            "SBI HSR Layout Branch",
            "SBI Hebbal Branch",
            "SBI BTM Layout Branch"

        };


        System.out.println("Bank Name: " + bankName);
        System.out.println("City: " + city);
        System.out.println("Bank Type: " + bankType);


        System.out.println("Bangalore SBI Branches:");

        for(String branch : bangaloreBranches){

            System.out.println(branch);

        }

    }
}