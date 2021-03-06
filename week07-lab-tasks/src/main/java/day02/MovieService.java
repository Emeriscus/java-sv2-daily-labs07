package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public MovieService(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            fillListWithMovies(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Nem létező fájl, vagy útvonal.", ioe);
        }
    }

    private void fillListWithMovies(List<String> lines) {
        for (String actual : lines) {
            String[] temp = actual.split(";");
            movies.add(new Movie(temp[0], Integer.parseInt(temp[1]), temp[2]));
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
