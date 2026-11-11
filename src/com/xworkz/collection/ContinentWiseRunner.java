package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ContinentWiseRunner {
    public static void main(String[] args) {

        //Asia

        Collection asianCountries = new ArrayList();
        asianCountries.add("India");
        asianCountries.add("china");
        asianCountries.add("nepal");
        asianCountries.add("japan");
        asianCountries.add("Bangladesh");

        //Africa

        Collection africaCountries = new ArrayList();
        africaCountries.add("nigeria");
        africaCountries.add("egypt");
        africaCountries.add("kenya");
        africaCountries.add("south africa");
        africaCountries.add("ghana");

        //Europe

        Collection europeCountries = new ArrayList();
        europeCountries.add("Germany");
        europeCountries.add("France");
        europeCountries.add("Italy");
        europeCountries.add("Spain");
        europeCountries.add("Norway");

        //North America

        Collection northAmericanCountries = new ArrayList();
        northAmericanCountries.add("canada");
        northAmericanCountries.add("United States");
        northAmericanCountries.add("mexico");
        northAmericanCountries.add("Jamaica");

        //SouthAmerica

        Collection southAmericanCountries = new ArrayList();
        southAmericanCountries.add("Brazil");
        southAmericanCountries.add("Argentina");
        southAmericanCountries.add("Chile");
        southAmericanCountries.add("Peru");
        southAmericanCountries.add("Colombia");

        //Australia


        Collection oceaniaCountries = new ArrayList();
        oceaniaCountries.add("Austrakia");
        oceaniaCountries.add("New Zealand");
        oceaniaCountries.add("Fiji");
        oceaniaCountries.add("Samoa");
        oceaniaCountries.add("Tonga");


        //Combine all continents /collection

        Collection worldCountries = new ArrayList();
        worldCountries.addAll(asianCountries);
        worldCountries.addAll(africaCountries);
        worldCountries.addAll(europeCountries);
        worldCountries.addAll(northAmericanCountries);
        worldCountries.addAll(southAmericanCountries);
        worldCountries.addAll(oceaniaCountries);


        //size

        System.out.println("Total Countries" + worldCountries.size());

        //display

        System.out.println(worldCountries);

        //contains
        boolean isIndiaAvailable = worldCountries.contains("India");
        System.out.println(isIndiaAvailable);

        //remove all

        worldCountries.removeAll(asianCountries);
        System.out.println("After Removing Asia");
        System.out.println(worldCountries);

        //remove
        africaCountries.remove("egypt");

        System.out.println("After Removing egypt");
        System.out.println(africaCountries);

        //retain all  common elements bw two collection
        worldCountries.retainAll(africaCountries);
        System.out.println("After retaining africa");
        System.out.println(worldCountries);

        //empty check

        boolean isEmpty = worldCountries.isEmpty();
        System.out.println("Is Empty:" +isEmpty);





    }
}
