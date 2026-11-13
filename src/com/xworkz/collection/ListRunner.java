package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        List<String> regularBikes = new ArrayList<>();
        regularBikes.add("Splendor Plus");
        regularBikes.add("Passion Pro");
        regularBikes.add("Honda Shine");
        regularBikes.add("Hero HF Deluxe");
        regularBikes.add("Bajaj Platina");
        System.out.println(regularBikes);

        regularBikes.add(0,"CT100");
        regularBikes.add(1,"CD100");
        System.out.println(regularBikes);

        List<String> sportsBikes = new ArrayList<>();
        sportsBikes.add("Yamaha R15");
        sportsBikes.add("KTM Duke 390");
        sportsBikes.add("TVS Apache RR 310");
        sportsBikes.add("Suzuki Gixxer");
        sportsBikes.add("Yamaha MT-15");

        List<String> superBikes = new ArrayList<>();
        superBikes.add("Kawasaki Ninja H2R");
        superBikes.add("BMW S 1000 RR");
        superBikes.add("Ducati Panigale V4");
        superBikes.add("Hayabusa");
        superBikes.add("Aprilia RSV4");

        List<String>  allBikes = new ArrayList<>();
       /* allBikes.addAll(regularBikes);
        allBikes.addAll(sportsBikes);
        allBikes.addAll(superBikes);*/
        allBikes.addAll(regularBikes);
        allBikes.addAll(sportsBikes);
        allBikes.addAll(1,superBikes);

        System.out.println(allBikes);

    }
}
