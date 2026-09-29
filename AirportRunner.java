class AirportRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        // Airport 1
        Airport airport1 = new Airport();
        airport1.airportCode = 101;
        airport1.airportName = "Kempegowda International Airport";
        airport1.cityName = "Bangalore";
        airport1.stateName = "Karnataka";
        airport1.totalRunways = 2;
        airport1.internationalAirport = true;

        Terminal terminal1 = new Terminal();
        terminal1.terminalName = "Terminal 1";
        terminal1.totalGates = 20;
        terminal1.hasInternationalCustoms = true;
        terminal1.currentPassengerCount = 5000;
        terminal1.terminalType = "International";
        terminal1.terminalManager = "Ramesh";

        airport1.terminal = terminal1;
        airport1.printDetails();


        // Airport 2
        Airport airport2 = new Airport();
        airport2.airportCode = 102;
        airport2.airportName = "Chennai International Airport";
        airport2.cityName = "Chennai";
        airport2.stateName = "Tamil Nadu";
        airport2.totalRunways = 2;
        airport2.internationalAirport = true;

        Terminal terminal2 = new Terminal();
        terminal2.terminalName = "Terminal 1";
        terminal2.totalGates = 18;
        terminal2.hasInternationalCustoms = true;
        terminal2.currentPassengerCount = 4500;
        terminal2.terminalType = "International";
        terminal2.terminalManager = "Suresh";

        airport2.terminal = terminal2;
        airport2.printDetails();


        // Airport 3
        Airport airport3 = new Airport();
        airport3.airportCode = 103;
        airport3.airportName = "Cochin International Airport";
        airport3.cityName = "Kochi";
        airport3.stateName = "Kerala";
        airport3.totalRunways = 3;
        airport3.internationalAirport = true;

        Terminal terminal3 = new Terminal();
        terminal3.terminalName = "Terminal 3";
        terminal3.totalGates = 16;
        terminal3.hasInternationalCustoms = true;
        terminal3.currentPassengerCount = 4000;
        terminal3.terminalType = "International";
        terminal3.terminalManager = "Anil";

        airport3.terminal = terminal3;
        airport3.printDetails();


        // Airport 4
        Airport airport4 = new Airport();
        airport4.airportCode = 104;
        airport4.airportName = "Rajiv Gandhi International Airport";
        airport4.cityName = "Hyderabad";
        airport4.stateName = "Telangana";
        airport4.totalRunways = 2;
        airport4.internationalAirport = true;

        Terminal terminal4 = new Terminal();
        terminal4.terminalName = "Main Terminal";
        terminal4.totalGates = 22;
        terminal4.hasInternationalCustoms = true;
        terminal4.currentPassengerCount = 5500;
        terminal4.terminalType = "International";
        terminal4.terminalManager = "Mahesh";

        airport4.terminal = terminal4;
        airport4.printDetails();


        // Airport 5
        Airport airport5 = new Airport();
        airport5.airportCode = 105;
        airport5.airportName = "Mangaluru International Airport";
        airport5.cityName = "Mangalore";
        airport5.stateName = "Karnataka";
        airport5.totalRunways = 1;
        airport5.internationalAirport = true;

        Terminal terminal5 = new Terminal();
        terminal5.terminalName = "Main Terminal";
        terminal5.totalGates = 12;
        terminal5.hasInternationalCustoms = true;
        terminal5.currentPassengerCount = 2500;
        terminal5.terminalType = "International";
        terminal5.terminalManager = "Kiran";

        airport5.terminal = terminal5;
        airport5.printDetails();


        // Airport 6
        Airport airport6 = new Airport();
        airport6.airportCode = 106;
        airport6.airportName = "Coimbatore International Airport";
        airport6.cityName = "Coimbatore";
        airport6.stateName = "Tamil Nadu";
        airport6.totalRunways = 1;
        airport6.internationalAirport = true;

        Terminal terminal6 = new Terminal();
        terminal6.terminalName = "Main Terminal";
        terminal6.totalGates = 14;
        terminal6.hasInternationalCustoms = true;
        terminal6.currentPassengerCount = 3000;
        terminal6.terminalType = "International";
        terminal6.terminalManager = "Vijay";

        airport6.terminal = terminal6;
        airport6.printDetails();


        // Airport 7
        Airport airport7 = new Airport();
        airport7.airportCode = 107;
        airport7.airportName = "Trivandrum International Airport";
        airport7.cityName = "Thiruvananthapuram";
        airport7.stateName = "Kerala";
        airport7.totalRunways = 1;
        airport7.internationalAirport = true;

        Terminal terminal7 = new Terminal();
        terminal7.terminalName = "Terminal 2";
        terminal7.totalGates = 15;
        terminal7.hasInternationalCustoms = true;
        terminal7.currentPassengerCount = 3200;
        terminal7.terminalType = "International";
        terminal7.terminalManager = "Arun";

        airport7.terminal = terminal7;
        airport7.printDetails();


        // Airport 8
        Airport airport8 = new Airport();
        airport8.airportCode = 108;
        airport8.airportName = "Calicut International Airport";
        airport8.cityName = "Kozhikode";
        airport8.stateName = "Kerala";
        airport8.totalRunways = 1;
        airport8.internationalAirport = true;

        Terminal terminal8 = new Terminal();
        terminal8.terminalName = "Main Terminal";
        terminal8.totalGates = 13;
        terminal8.hasInternationalCustoms = true;
        terminal8.currentPassengerCount = 2800;
        terminal8.terminalType = "International";
        terminal8.terminalManager = "Rahul";

        airport8.terminal = terminal8;
        airport8.printDetails();


        // Airport 9
        Airport airport9 = new Airport();
        airport9.airportCode = 109;
        airport9.airportName = "Madurai Airport";
        airport9.cityName = "Madurai";
        airport9.stateName = "Tamil Nadu";
        airport9.totalRunways = 1;
        airport9.internationalAirport = false;

        Terminal terminal9 = new Terminal();
        terminal9.terminalName = "Domestic Terminal";
        terminal9.totalGates = 10;
        terminal9.hasInternationalCustoms = false;
        terminal9.currentPassengerCount = 1800;
        terminal9.terminalType = "Domestic";
        terminal9.terminalManager = "Prakash";

        airport9.terminal = terminal9;
        airport9.printDetails();


        // Airport 10
        Airport airport10 = new Airport();
        airport10.airportCode = 110;
        airport10.airportName = "Tiruchirappalli International Airport";
        airport10.cityName = "Trichy";
        airport10.stateName = "Tamil Nadu";
        airport10.totalRunways = 1;
        airport10.internationalAirport = true;

        Terminal terminal10 = new Terminal();
        terminal10.terminalName = "Main Terminal";
        terminal10.totalGates = 11;
        terminal10.hasInternationalCustoms = true;
        terminal10.currentPassengerCount = 2200;
        terminal10.terminalType = "International";
        terminal10.terminalManager = "Ganesh";

        airport10.terminal = terminal10;
        airport10.printDetails();


        // Airport 11
        Airport airport11 = new Airport();
        airport11.airportCode = 111;
        airport11.airportName = "Vijayawada International Airport";
        airport11.cityName = "Vijayawada";
        airport11.stateName = "Andhra Pradesh";
        airport11.totalRunways = 1;
        airport11.internationalAirport = true;

        Terminal terminal11 = new Terminal();
        terminal11.terminalName = "Main Terminal";
        terminal11.totalGates = 12;
        terminal11.hasInternationalCustoms = true;
        terminal11.currentPassengerCount = 2100;
        terminal11.terminalType = "International";
        terminal11.terminalManager = "Ravi";

        airport11.terminal = terminal11;
        airport11.printDetails();


        // Airport 12
        Airport airport12 = new Airport();
        airport12.airportCode = 112;
        airport12.airportName = "Visakhapatnam International Airport";
        airport12.cityName = "Visakhapatnam";
        airport12.stateName = "Andhra Pradesh";
        airport12.totalRunways = 1;
        airport12.internationalAirport = true;

        Terminal terminal12 = new Terminal();
        terminal12.terminalName = "Main Terminal";
        terminal12.totalGates = 14;
        terminal12.hasInternationalCustoms = true;
        terminal12.currentPassengerCount = 2500;
        terminal12.terminalType = "International";
        terminal12.terminalManager = "Naveen";

        airport12.terminal = terminal12;
        airport12.printDetails();


        // Airport 13
        Airport airport13 = new Airport();
        airport13.airportCode = 113;
        airport13.airportName = "Tirupati Airport";
        airport13.cityName = "Tirupati";
        airport13.stateName = "Andhra Pradesh";
        airport13.totalRunways = 1;
        airport13.internationalAirport = false;

        Terminal terminal13 = new Terminal();
        terminal13.terminalName = "Domestic Terminal";
        terminal13.totalGates = 8;
        terminal13.hasInternationalCustoms = false;
        terminal13.currentPassengerCount = 1500;
        terminal13.terminalType = "Domestic";
        terminal13.terminalManager = "Venkat";

        airport13.terminal = terminal13;
        airport13.printDetails();


        // Airport 14
        Airport airport14 = new Airport();
        airport14.airportCode = 114;
        airport14.airportName = "Rajahmundry Airport";
        airport14.cityName = "Rajahmundry";
        airport14.stateName = "Andhra Pradesh";
        airport14.totalRunways = 1;
        airport14.internationalAirport = false;

        Terminal terminal14 = new Terminal();
        terminal14.terminalName = "Domestic Terminal";
        terminal14.totalGates = 7;
        terminal14.hasInternationalCustoms = false;
        terminal14.currentPassengerCount = 1200;
        terminal14.terminalType = "Domestic";
        terminal14.terminalManager = "Karthik";

        airport14.terminal = terminal14;
        airport14.printDetails();


        // Airport 15
        Airport airport15 = new Airport();
        airport15.airportCode = 115;
        airport15.airportName = "Kannur International Airport";
        airport15.cityName = "Kannur";
        airport15.stateName = "Kerala";
        airport15.totalRunways = 1;
        airport15.internationalAirport = true;

        Terminal terminal15 = new Terminal();
        terminal15.terminalName = "Main Terminal";
        terminal15.totalGates = 14;
        terminal15.hasInternationalCustoms = true;
        terminal15.currentPassengerCount = 2600;
        terminal15.terminalType = "International";
        terminal15.terminalManager = "Manoj";

        airport15.terminal = terminal15;
        airport15.printDetails();


        // Airport 16
        Airport airport16 = new Airport();
        airport16.airportCode = 116;
        airport16.airportName = "Mysore Airport";
        airport16.cityName = "Mysore";
        airport16.stateName = "Karnataka";
        airport16.totalRunways = 1;
        airport16.internationalAirport = false;

        Terminal terminal16 = new Terminal();
        terminal16.terminalName = "Domestic Terminal";
        terminal16.totalGates = 6;
        terminal16.hasInternationalCustoms = false;
        terminal16.currentPassengerCount = 900;
        terminal16.terminalType = "Domestic";
        terminal16.terminalManager = "Shankar";

        airport16.terminal = terminal16;
        airport16.printDetails();


        // Airport 17
        Airport airport17 = new Airport();
        airport17.airportCode = 117;
        airport17.airportName = "Hubli Airport";
        airport17.cityName = "Hubli";
        airport17.stateName = "Karnataka";
        airport17.totalRunways = 1;
        airport17.internationalAirport = false;

        Terminal terminal17 = new Terminal();
        terminal17.terminalName = "Domestic Terminal";
        terminal17.totalGates = 7;
        terminal17.hasInternationalCustoms = false;
        terminal17.currentPassengerCount = 1100;
        terminal17.terminalType = "Domestic";
        terminal17.terminalManager = "Harish";

        airport17.terminal = terminal17;
        airport17.printDetails();


        // Airport 18
        Airport airport18 = new Airport();
        airport18.airportCode = 118;
        airport18.airportName = "Belgaum Airport";
        airport18.cityName = "Belgaum";
        airport18.stateName = "Karnataka";
        airport18.totalRunways = 1;
        airport18.internationalAirport = false;

        Terminal terminal18 = new Terminal();
        terminal18.terminalName = "Domestic Terminal";
        terminal18.totalGates = 8;
        terminal18.hasInternationalCustoms = false;
        terminal18.currentPassengerCount = 1300;
        terminal18.terminalType = "Domestic";
        terminal18.terminalManager = "Deepak";

        airport18.terminal = terminal18;
        airport18.printDetails();


        // Airport 19
        Airport airport19 = new Airport();
        airport19.airportCode = 119;
        airport19.airportName = "Shivamogga Airport";
        airport19.cityName = "Shivamogga";
        airport19.stateName = "Karnataka";
        airport19.totalRunways = 1;
        airport19.internationalAirport = false;

        Terminal terminal19 = new Terminal();
        terminal19.terminalName = "Domestic Terminal";
        terminal19.totalGates = 6;
        terminal19.hasInternationalCustoms = false;
        terminal19.currentPassengerCount = 800;
        terminal19.terminalType = "Domestic";
        terminal19.terminalManager = "Nithin";

        airport19.terminal = terminal19;
        airport19.printDetails();


        // Airport 20
        Airport airport20 = new Airport();
        airport20.airportCode = 120;
        airport20.airportName = "Kalaburagi Airport";
        airport20.cityName = "Kalaburagi";
        airport20.stateName = "Karnataka";
        airport20.totalRunways = 1;
        airport20.internationalAirport = false;

        Terminal terminal20 = new Terminal();
        terminal20.terminalName = "Domestic Terminal";
        terminal20.totalGates = 5;
        terminal20.hasInternationalCustoms = false;
        terminal20.currentPassengerCount = 700;
        terminal20.terminalType = "Domestic";
        terminal20.terminalManager = "Sunil";

        airport20.terminal = terminal20;
        airport20.printDetails();


        // Airport 21
        Airport airport21 = new Airport();
        airport21.airportCode = 121;
        airport21.airportName = "Kadapa Airport";
        airport21.cityName = "Kadapa";
        airport21.stateName = "Andhra Pradesh";
        airport21.totalRunways = 1;
        airport21.internationalAirport = false;

        Terminal terminal21 = new Terminal();
        terminal21.terminalName = "Domestic Terminal";
        terminal21.totalGates = 5;
        terminal21.hasInternationalCustoms = false;
        terminal21.currentPassengerCount = 600;
        terminal21.terminalType = "Domestic";
        terminal21.terminalManager = "Mohan";

        airport21.terminal = terminal21;
        airport21.printDetails();


        // Airport 22
        Airport airport22 = new Airport();
        airport22.airportCode = 122;
        airport22.airportName = "Kurnool Airport";
        airport22.cityName = "Kurnool";
        airport22.stateName = "Andhra Pradesh";
        airport22.totalRunways = 1;
        airport22.internationalAirport = false;

        Terminal terminal22 = new Terminal();
        terminal22.terminalName = "Domestic Terminal";
        terminal22.totalGates = 5;
        terminal22.hasInternationalCustoms = false;
        terminal22.currentPassengerCount = 500;
        terminal22.terminalType = "Domestic";
        terminal22.terminalManager = "Raghu";

        airport22.terminal = terminal22;
        airport22.printDetails();


        // Airport 23
        Airport airport23 = new Airport();
        airport23.airportCode = 123;
        airport23.airportName = "Pondicherry Airport";
        airport23.cityName = "Puducherry";
        airport23.stateName = "Puducherry";
        airport23.totalRunways = 1;
        airport23.internationalAirport = false;

        Terminal terminal23 = new Terminal();
        terminal23.terminalName = "Domestic Terminal";
        terminal23.totalGates = 4;
        terminal23.hasInternationalCustoms = false;
        terminal23.currentPassengerCount = 400;
        terminal23.terminalType = "Domestic";
        terminal23.terminalManager = "Arun";

        airport23.terminal = terminal23;
        airport23.printDetails();


        // Airport 24
        Airport airport24 = new Airport();
        airport24.airportCode = 124;
        airport24.airportName = "Salem Airport";
        airport24.cityName = "Salem";
        airport24.stateName = "Tamil Nadu";
        airport24.totalRunways = 1;
        airport24.internationalAirport = false;

        Terminal terminal24 = new Terminal();
        terminal24.terminalName = "Domestic Terminal";
        terminal24.totalGates = 4;
        terminal24.hasInternationalCustoms = false;
        terminal24.currentPassengerCount = 500;
        terminal24.terminalType = "Domestic";
        terminal24.terminalManager = "Bala";

        airport24.terminal = terminal24;
        airport24.printDetails();


        // Airport 25
        Airport airport25 = new Airport();
        airport25.airportCode = 125;
        airport25.airportName = "Tuticorin Airport";
        airport25.cityName = "Thoothukudi";
        airport25.stateName = "Tamil Nadu";
        airport25.totalRunways = 1;
        airport25.internationalAirport = false;

        Terminal terminal25 = new Terminal();
        terminal25.terminalName = "Domestic Terminal";
        terminal25.totalGates = 5;
        terminal25.hasInternationalCustoms = false;
        terminal25.currentPassengerCount = 600;
        terminal25.terminalType = "Domestic";
        terminal25.terminalManager = "Kumar";

        airport25.terminal = terminal25;
        airport25.printDetails();


        // Airport 26
        Airport airport26 = new Airport();
        airport26.airportCode = 126;
        airport26.airportName = "Agatti Airport";
        airport26.cityName = "Agatti";
        airport26.stateName = "Lakshadweep";
        airport26.totalRunways = 1;
        airport26.internationalAirport = false;

        Terminal terminal26 = new Terminal();
        terminal26.terminalName = "Domestic Terminal";
        terminal26.totalGates = 3;
        terminal26.hasInternationalCustoms = false;
        terminal26.currentPassengerCount = 300;
        terminal26.terminalType = "Domestic";
        terminal26.terminalManager = "Joseph";

        airport26.terminal = terminal26;
        airport26.printDetails();


        // Airport 27
        Airport airport27 = new Airport();
        airport27.airportCode = 127;
        airport27.airportName = "Port Blair Airport";
        airport27.cityName = "Port Blair";
        airport27.stateName = "Andaman and Nicobar Islands";
        airport27.totalRunways = 1;
        airport27.internationalAirport = false;

        Terminal terminal27 = new Terminal();
        terminal27.terminalName = "Domestic Terminal";
        terminal27.totalGates = 8;
        terminal27.hasInternationalCustoms = false;
        terminal27.currentPassengerCount = 1000;
        terminal27.terminalType = "Domestic";
        terminal27.terminalManager = "Thomas";

        airport27.terminal = terminal27;
        airport27.printDetails();


        // Airport 28
        Airport airport28 = new Airport();
        airport28.airportCode = 128;
        airport28.airportName = "Kannur Airport";
        airport28.cityName = "Kannur";
        airport28.stateName = "Kerala";
        airport28.totalRunways = 1;
        airport28.internationalAirport = true;

        Terminal terminal28 = new Terminal();
        terminal28.terminalName = "International Terminal";
        terminal28.totalGates = 12;
        terminal28.hasInternationalCustoms = true;
        terminal28.currentPassengerCount = 2400;
        terminal28.terminalType = "International";
        terminal28.terminalManager = "Ajith";

        airport28.terminal = terminal28;
        airport28.printDetails();


        // Airport 29
        Airport airport29 = new Airport();
        airport29.airportCode = 129;
        airport29.airportName = "Kochi Naval Airport";
        airport29.cityName = "Kochi";
        airport29.stateName = "Kerala";
        airport29.totalRunways = 1;
        airport29.internationalAirport = false;

        Terminal terminal29 = new Terminal();
        terminal29.terminalName = "Domestic Terminal";
        terminal29.totalGates = 4;
        terminal29.hasInternationalCustoms = false;
        terminal29.currentPassengerCount = 300;
        terminal29.terminalType = "Domestic";
        terminal29.terminalManager = "George";

        airport29.terminal = terminal29;
        airport29.printDetails();


        // Airport 30
        Airport airport30 = new Airport();
        airport30.airportCode = 130;
        airport30.airportName = "Begumpet Airport";
        airport30.cityName = "Hyderabad";
        airport30.stateName = "Telangana";
        airport30.totalRunways = 1;
        airport30.internationalAirport = false;

        Terminal terminal30 = new Terminal();
        terminal30.terminalName = "Domestic Terminal";
        terminal30.totalGates = 5;
        terminal30.hasInternationalCustoms = false;
        terminal30.currentPassengerCount = 500;
        terminal30.terminalType = "Domestic";
        terminal30.terminalManager = "Ravi";

        airport30.terminal = terminal30;
        airport30.printDetails();


        // Airport 31
        Airport airport31 = new Airport();
        airport31.airportCode = 131;
        airport31.airportName = "Kadapa Domestic Airport";
        airport31.cityName = "Kadapa";
        airport31.stateName = "Andhra Pradesh";
        airport31.totalRunways = 1;
        airport31.internationalAirport = false;

        Terminal terminal31 = new Terminal();
        terminal31.terminalName = "Domestic Terminal";
        terminal31.totalGates = 4;
        terminal31.hasInternationalCustoms = false;
        terminal31.currentPassengerCount = 400;
        terminal31.terminalType = "Domestic";
        terminal31.terminalManager = "Ramesh";

        airport31.terminal = terminal31;
        airport31.printDetails();


        // Airport 32
        Airport airport32 = new Airport();
        airport32.airportCode = 132;
        airport32.airportName = "Vellore Airport";
        airport32.cityName = "Vellore";
        airport32.stateName = "Tamil Nadu";
        airport32.totalRunways = 1;
        airport32.internationalAirport = false;

        Terminal terminal32 = new Terminal();
        terminal32.terminalName = "Domestic Terminal";
        terminal32.totalGates = 4;
        terminal32.hasInternationalCustoms = false;
        terminal32.currentPassengerCount = 350;
        terminal32.terminalType = "Domestic";
        terminal32.terminalManager = "Siva";

        airport32.terminal = terminal32;
        airport32.printDetails();


        // Airport 33
        Airport airport33 = new Airport();
        airport33.airportCode = 133;
        airport33.airportName = "Warangal Airport";
        airport33.cityName = "Warangal";
        airport33.stateName = "Telangana";
        airport33.totalRunways = 1;
        airport33.internationalAirport = false;

        Terminal terminal33 = new Terminal();
        terminal33.terminalName = "Domestic Terminal";
        terminal33.totalGates = 4;
        terminal33.hasInternationalCustoms = false;
        terminal33.currentPassengerCount = 400;
        terminal33.terminalType = "Domestic";
        terminal33.terminalManager = "Naresh";

        airport33.terminal = terminal33;
        airport33.printDetails();


        // Airport 34
        Airport airport34 = new Airport();
        airport34.airportCode = 134;
        airport34.airportName = "Kollam Airport";
        airport34.cityName = "Kollam";
        airport34.stateName = "Kerala";
        airport34.totalRunways = 1;
        airport34.internationalAirport = false;

        Terminal terminal34 = new Terminal();
        terminal34.terminalName = "Domestic Terminal";
        terminal34.totalGates = 3;
        terminal34.hasInternationalCustoms = false;
        terminal34.currentPassengerCount = 300;
        terminal34.terminalType = "Domestic";
        terminal34.terminalManager = "Biju";

        airport34.terminal = terminal34;
        airport34.printDetails();


        // Airport 35
        Airport airport35 = new Airport();
        airport35.airportCode = 135;
        airport35.airportName = "Hassan Airport";
        airport35.cityName = "Hassan";
        airport35.stateName = "Karnataka";
        airport35.totalRunways = 1;
        airport35.internationalAirport = false;

        Terminal terminal35 = new Terminal();
        terminal35.terminalName = "Domestic Terminal";
        terminal35.totalGates = 3;
        terminal35.hasInternationalCustoms = false;
        terminal35.currentPassengerCount = 250;
        terminal35.terminalType = "Domestic";
        terminal35.terminalManager = "Manjunath";

        airport35.terminal = terminal35;
        airport35.printDetails();

        System.out.println("Main ended");
    }
}