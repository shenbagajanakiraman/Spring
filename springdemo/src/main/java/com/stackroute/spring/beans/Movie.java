package com.stackroute.spring.beans;

public class Movie {
   private String movieName;
   private String actorNAme;
   private String genre;

   public Movie() {

   }

    public Movie(String movieName, String actorNAme, String genre) {
        this.movieName = movieName;
        this.actorNAme = actorNAme;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorNAme() {
        return actorNAme;
    }

    public void setActorNAme(String actorNAme) {
        this.actorNAme = actorNAme;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public  String welcomeMsg () {
        return "Welcome !!!";
    }

//    public  String print() {
//        return "\nMovie Information "+
//                "movieName='" + movieName + '\'' +
//                ", actorNAme='" + actorNAme + '\'' +
//                ", genre='" + genre + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "\nMovie Information "+
                "movieName='" + movieName + '\'' +
                ", actorNAme='" + actorNAme + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
