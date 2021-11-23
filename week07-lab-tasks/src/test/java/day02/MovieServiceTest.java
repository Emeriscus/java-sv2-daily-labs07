package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testFillMovies() {
        MovieService movieService = new MovieService(Paths.get("src/test/resources/movies.csv"));

        assertEquals(5, movieService.getMovies().size());
        assertEquals("James Cameron", movieService.getMovies().get(1).getDirector());
    }

    @Test
    void testFillMoviesFileNotFound() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> new MovieService(Paths.get("movies.txt")));

        assertEquals("Nem létező fájl, vagy útvonal.", ise.getMessage());
        assertEquals(NoSuchFileException.class, ise.getCause().getClass());
    }
}
