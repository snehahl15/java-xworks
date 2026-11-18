package com.xworkz.movieTicket;

import com.xworkz.movieTicket.movie.Movies;

import java.util.HashSet;
import java.util.Set;

public class MovieTicketSetRunner {
    public static void main(String[] args) {


        Set<Movies> movies = new HashSet<>();
        movies.add(new Movies(101,"Kantara","kannada",200));
        movies.add(new Movies(101,"kgf","kannada",250));
        movies.add(new Movies(101,"Kantara","kannada",200));

        for (Movies movie:movies){
            System.out.println(movie);
        }

        System.out.println("Total movies: " + movies.size());

        System.out.println(
                movies.add(new Movies(101, "Kantara", "kannada", 200))
        );

    }
}