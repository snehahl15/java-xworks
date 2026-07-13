class YouTube {


    public static void createChannel(
            String channelName,
            String ownerName,
            String category,
            int subscribers,
            int videos,
            String language,
            String country) {


        System.out.println("YouTube Channel Created");

        System.out.println("Channel Name : " + channelName);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Category : " + category);
        System.out.println("Subscribers : " + subscribers);
        System.out.println("Total Videos : " + videos);
        System.out.println("Language : " + language);
        System.out.println("Country : " + country);


    }


    public static void main(String[] args) {


        createChannel(
                "Tech World",
                "Sneha",
                "Programming",
                50000,
                120,
                "English",
                "India"
        );


    }

}