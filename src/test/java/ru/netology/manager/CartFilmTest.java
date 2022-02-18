package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterManager;

import static org.junit.jupiter.api.Assertions.*;

class CartFilmTest {

    @Test
    public void shouldGetAllFilmInsideLimit() {
        PosterManager first = new PosterManager(1, 1, "filmone", 1);
        PosterManager second = new PosterManager(2, 2, "filmtwo", 2);
        PosterManager third = new PosterManager(3, 3, "filmthree", 3);
        PosterManager fourth = new PosterManager(4, 4, "filmfour", 4);
        PosterManager fifth = new PosterManager(5, 5, "filmfive", 5);
        PosterManager sixth = new PosterManager(6, 6, "filmsix", 6);
        PosterManager seventh = new PosterManager(7, 7, "filmseven", 7);
        PosterManager eighth = new PosterManager(8, 8, "filmeight", 8);
        PosterManager ninth = new PosterManager(9, 9, "filmnine", 9);

        CartFilm manager = new CartFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);

        manager.findLast();

        PosterManager[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        PosterManager[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetOneFilm() {
        PosterManager first = new PosterManager(1, 1, "filmone", 1);

        CartFilm manager = new CartFilm(1);
        manager.save(first);
        manager.findAll();

        PosterManager[] expected = {first};
        PosterManager[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMaximum() {
        PosterManager first = new PosterManager(1, 1, "filmone", 1);
        PosterManager second = new PosterManager(2, 2, "filmtwo", 2);
        PosterManager third = new PosterManager(3, 3, "filmthree", 3);
        PosterManager fourth = new PosterManager(4, 4, "filmfour", 4);
        PosterManager fifth = new PosterManager(5, 5, "filmfive", 5);

        CartFilm manager = new CartFilm(3);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);

        manager.findLast();

        PosterManager[] expected = {third, second, first};
        PosterManager[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEmptyArray() {

        CartFilm manager = new CartFilm();
        manager.findAll();

        PosterManager[] expected = {};
        PosterManager[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm() {
        PosterManager first = new PosterManager(1, 1, "filmone", 1);
        PosterManager second = new PosterManager(2, 2, "filmtwo", 2);
        PosterManager third = new PosterManager(3, 3, "filmthree", 3);

        CartFilm manager = new CartFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);

        manager.addById(4);

        PosterManager fourth = null;
        PosterManager[] expected = {first, second, third, fourth};
        PosterManager[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByIdFilm() {
        PosterManager first = new PosterManager(1, 1, "filmone", 1);
        PosterManager second = new PosterManager(2, 2, "filmtwo", 1);
        PosterManager third = new PosterManager(3, 3, "filmthree", 1);

        CartFilm manager = new CartFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);

        manager.removeById(3);

        PosterManager[] expected = {first, second};
        PosterManager[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }
}