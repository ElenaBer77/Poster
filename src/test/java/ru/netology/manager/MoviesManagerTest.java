package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movies;

public class MoviesManagerTest {

    private Movies movies1 = new Movies(1, "Бладшот", "боевик", false);
    private Movies movies2 = new Movies(2, "Вперёд", "мультфильм", false);
    private Movies movies3 = new Movies(3, "Отель 'Белград'", "комедия", false);
    private Movies movies4 = new Movies(4, "Джентельмены", "боевик", false);
    private Movies movies5 = new Movies(5, "Человек-невидимка", "ужасы", false);
    private Movies movies6 = new Movies(6, "Тролли. Мировой тур", "мультфильм", true);
    private Movies movies7 = new Movies(7, "Номер один", "комедия", true);
    private MoviesManager movies;

    @Test

    public void addMovie0() {
        MoviesManager movie = new MoviesManager();

        String[] expected = {};
        String[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie2() {
        MoviesManager movie = new MoviesManager();

        movie.addFilm("movies1");
        movie.addFilm("movies2");

        String[] expected = {"movies1", "movies2"};
        String[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie3() {
        MoviesManager movie = new MoviesManager();

        movie.addFilm("movies1");
        movie.addFilm("movies2");
        movie.addFilm("movies3");

        String[] expected = {"movies1", "movies2", "movies3"};
        String[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie7() {
        MoviesManager movie = new MoviesManager();

        movie.addFilm("movies1");
        movie.addFilm("movies2");
        movie.addFilm("movies3");
        movie.addFilm("movies4");
        movie.addFilm("movies5");
        movie.addFilm("movies6");
        movie.addFilm("movies7");


        String[] expected = {"movies1", "movies2", "movies3", "movies4", "movies5", "movies6", "movies7"};
        String[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie8() {
        MoviesManager movie = new MoviesManager();

        movie.addFilm("movies1");
        movie.addFilm("movies2");
        movie.addFilm("movies3");
        movie.addFilm("movies4");
        movie.addFilm("movies5");
        movie.addFilm("movies6");
        movie.addFilm("movies7");
        movie.addFilm("movies8");

        String[] expected = {"movies1", "movies2", "movies3", "movies4", "movies5", "movies6", "movies7", "movies8"};
        String[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie6() {
        MoviesManager movie = new MoviesManager();

        movie.addFilm("movies1");
        movie.addFilm("movies2");
        movie.addFilm("movies3");
        movie.addFilm("movies4");
        movie.addFilm("movies5");
        movie.addFilm("movies6");

        String[] expected = {"movies1", "movies2", "movies3", "movies4", "movies5", "movies6"};
        String[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reversOrder7() {
        MoviesManager movie = new MoviesManager();
        movie.addFilm("movies1");
        movie.addFilm("movies2");
        movie.addFilm("movies3");
        movie.addFilm("movies4");
        movie.addFilm("movies5");
        movie.addFilm("movies6");
        movie.addFilm("movies7");

        String[] expected = {"movies7", "movies6", "movies5", "movies4", "movies3"};
        String[] actual = movie.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reversOrder5() {
        MoviesManager movie = new MoviesManager();
        movie.addFilm("movies1");
        movie.addFilm("movies2");
        movie.addFilm("movies3");
        movie.addFilm("movies4");
        movie.addFilm("movies5");

        String[] expected = {"movies5", "movies4", "movies3", "movies2", "movies1"};
        String[] actual = movie.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
