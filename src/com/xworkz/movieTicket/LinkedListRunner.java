package com.xworkz.movieTicket;

import com.xworkz.movieTicket.movie.Movies;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        /*Collection<String>  linkedList= new LinkedList<>();

        linkedList.add("kantara");
        linkedList.add("mahabharatha");
        linkedList.add("ramayana");
        linkedList.add("kgf");

        System.out.println(linkedList);*/

        Collection<Movies> movies =  new LinkedList<>();
        movies.add(new Movies(1, "KGF", "Kannada", 250));
        movies.add(new Movies(2,"rajakumar","kannada",240));
        movies.add(new Movies(3,"dasa","kannada",300));
        movies.add(new Movies(4,"kariya","kannada",300));
        movies.add(new Movies(5,"jolly days","kannada",200));
        movies.add(new Movies(6,"murphy","kannda",100));

        for (Movies movie:movies){
            System.out.println(movie);
        }





    }
}
