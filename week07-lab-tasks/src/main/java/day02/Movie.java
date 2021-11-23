package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Movie {

    private String title;
    private int yearOfProduction;
    private String director;

    public Movie(String title, int yearOfProduction, String director) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getDirector() {
        return director;
    }
}
