package com.xworkz.movieTicket.movie;

import lombok.*;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor

public class Movies {
  private  int movieId;
 private   String movieName;
  private  String language;
   private double ticketPrice;


  /* public  Movies(int movieId,String movieName,String language,double ticketPrice){
       this.movieId = movieId;
       this.movieName = movieName;
       this.language = language;
       this.ticketPrice = ticketPrice;
   }


    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", language='" + language + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }



    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Movies))
            return false;

        Movies movies = (Movies) obj;

        return movieId == movies.movieId &&
                Double.compare(ticketPrice, movies.ticketPrice) == 0 &&
                Objects.equals(movieName, movies.movieName) &&
                Objects.equals(language, movies.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, movieName, language, ticketPrice);
    }*/
}
