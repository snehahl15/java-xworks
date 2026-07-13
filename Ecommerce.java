class Ecommerce {

    public static void main(String[] args) {


        String companyName = "Amazon";
        String founder = "Jeff Bezos";
        int foundedYear = 1994;
        String headquarters = "Seattle, USA";


        String[] products = {
            "iPhone 15",
            "Samsung Galaxy S24",
            "Dell Laptop",
            "Sony Headphones",
            "Smart Watch",
            "Bluetooth Speaker",
            "Gaming Keyboard",
            "Wireless Mouse",
            "Running Shoes",
            "Smart TV"
        };


        System.out.println("Company Name: " + companyName);
        System.out.println("Founder: " + founder);
        System.out.println("Founded Year: " + foundedYear);
        System.out.println("Headquarters: " + headquarters);


        System.out.println("Products:");

        for(String product : products){

            System.out.println(product);

        }

    }
}