class VTU {

    public static void main(String[] args) {


        String universityName = "Visvesvaraya Technological University";
        String founder = "Government of Karnataka";
        int foundedYear = 1998;
        String location = "Belagavi, Karnataka";


        String[] collegeNames = {
            "Bangalore Institute of Technology",
            "BMS College of Engineering",
            "RV College of Engineering",
            "PES University",
            "MS Ramaiah Institute of Technology",
            "New Horizon College of Engineering",
            "Dayananda Sagar College of Engineering",
            "CMR Institute of Technology",
            "Acharya Institute of Technology",
            "Nitte Meenakshi Institute of Technology"
			"Channabasaveshwara Institute Of Technology"
        };


        System.out.println("University Name: " + universityName);
        System.out.println("Founder: " + founder);
        System.out.println("Founded Year: " + foundedYear);
        System.out.println("Location: " + location);


        System.out.println("VTU Affiliated Colleges:");

        for(String college : collegeNames){

            System.out.println(college);

        }

    }
}