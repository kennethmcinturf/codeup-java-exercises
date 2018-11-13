package movies;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        getAllMovies();
    }

    public static void getAllMovies(){
        System.out.println(MoviesArray.findAll().toString());
    }
}
