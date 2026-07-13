class Threads {


    public static void createProfile(
            String userName,
            String displayName,
            String bio,
            int followers,
            int posts,
            String location,
            String interests) {


        System.out.println("Threads Profile Created");

        System.out.println("Username : " + userName);
        System.out.println("Display Name : " + displayName);
        System.out.println("Bio : " + bio);
        System.out.println("Followers : " + followers);
        System.out.println("Posts : " + posts);
        System.out.println("Location : " + location);
        System.out.println("Interests : " + interests);


    }


    public static void main(String[] args) {


        createProfile(
                "sneha_hl",
                "Sneha",
                "Java Developer",
                10000,
                250,
                "India",
                "Coding, Technology"
        );


    }

}