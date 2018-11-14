package movies;

import util.Input;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        boolean exitApp = false;
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add a new movie");
            Integer userInput = input.getInt(0,5);
            if (userInput == 1){
                getAllMovies();
            }else if(userInput == 2){
                getAllMoviesByCatagories("animated");
            }else if(userInput == 3){
                getAllMoviesByCatagories("drama");
            }else if(userInput == 4){
                getAllMoviesByCatagories("horror");
            }else if(userInput == 5){
                getAllMoviesByCatagories("scifi");
            }else {
                exitApp = true;
            }
        }while (!exitApp);
        System.out.println("Thank you for using the movie app!!");
    }

    public static void getAllMovies(){
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }
    }

    public static void getAllMoviesByCatagories(String catagory){
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equals(catagory)){
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }
    }

    public static Movie[] addMovie(Movie[] movies, Movie movie){
        Movie[] newMoviesList = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            newMoviesList[i] = new Movie(movies[i].getName(),movies[i].getCategory());
        }
        newMoviesList[movies.length] = new Movie(movie.getName(), movie.getCategory());
        return newMoviesList;
    }
}
