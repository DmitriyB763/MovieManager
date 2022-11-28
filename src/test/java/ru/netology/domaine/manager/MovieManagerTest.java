package ru.netology.domaine.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domaine.data.DataClass;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieManager manager = new MovieManager();
    DataClass first = new DataClass("вперед", "комедия", 1);
    DataClass second = new DataClass("бладшот", "боевик", 2);
    DataClass third = new DataClass("отель белград", "боевик", 3);
    DataClass four = new DataClass("джентельмены", "боевик", 4);
    DataClass five = new DataClass("тролли", "комедия", 5);
    DataClass six = new DataClass("человек-невидимка", "ужасы", 6);
    DataClass seven = new DataClass("трансформеры", "боевик", 7);
    DataClass eight = new DataClass("мстители", "боевик", 8);
    DataClass nine = new DataClass("желеный человек", "боевик", 9);
    DataClass ten = new DataClass("ночь в музее", "комедия", 10);
    DataClass eleven = new DataClass("халк", "боевик", 11);

    @Test
    void addMovie() { //добавление нового фильма
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);

        manager.addMovie(ten);

        DataClass[] expected = {first, second, third,four,five,six,seven,eight,nine,ten};
        DataClass[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAllWhereNoAddedMovies() {//показать все если фильмы не добавляли  ни одного

        DataClass[] expected = {};
        DataClass[] actual = manager.findAll();

        assertArrayEquals(expected,actual);

    }

    @Test
    void findLast() { // показать последние добавленные
        manager.addMovie(first);
        manager.addMovie(third);
        manager.addMovie(ten);

        DataClass[] expected = {ten,third,first};
        DataClass[] actual = manager.findLast();
    }
    @Test
    void findLastWhereCountMoreLimit() { // показать последние добавленные , если в добавленных фильмов больше лимита
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);

        DataClass[] expected = {eleven,ten,nine,eight,seven,six,five,four,third,second};
        DataClass[] actual = manager.findLast();

        assertArrayEquals(expected,actual);
    }

}