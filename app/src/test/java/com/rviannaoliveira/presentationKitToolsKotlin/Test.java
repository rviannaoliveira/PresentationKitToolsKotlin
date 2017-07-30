package com.rviannaoliveira.presentationKitToolsKotlin;

import android.annotation.SuppressLint;

import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Criado por rodrigo on 22/07/17.
 */

public class Test {
    private List<Heroes> list = new ArrayList<>();
    private List<Movie> movies = new ArrayList<>();

    @Before
    public void setUp() {
        list.add(new Heroes("Captain", "Shield"));
        list.add(new Heroes("Captain America", "Shield"));
        list.add(new Heroes("Infernal Soldier", "Shield"));
        list.add(new Heroes("Falcon", "Shield"));
        list.add(new Heroes("Captain", "Punch"));

        movies.add(new Movie("Spider Man", 2017));
        movies.add(new Movie("Civil War", 2016));
        movies.add(new Movie("Guardian of the Galaxy", 2017));
        movies.add(new Movie("DeadPool", 2016));
    }

    @org.junit.Test
    public void forEach() {
        for (Heroes heroes : list) {
            System.out.println(heroes.getName());
        }
        assertEquals(5, list.size());

    }

    @org.junit.Test
    public void filter() {
        List<Heroes> list2 = new ArrayList<>();

        for (Heroes heroes : list) {
            if ("Punch".equals(heroes.getPower())) {
                list2.add(heroes);
            }
        }

        assertEquals(1, list2.size());
    }

    @SuppressLint("UseSparseArrays")
    @org.junit.Test
    public void groupBy() {
        Map<Integer, List<Movie>> map = new HashMap<>();
        List<Movie> movies2016 = new ArrayList<>();
        List<Movie> movies2017 = new ArrayList<>();

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie, Movie movie2) {
                return Integer.compare(movie.getYear(), movie2.getYear());
            }
        });


        for (Movie movie : movies) {
            if (movie.getYear() == 2016) {
                movies2016.add(movie);
            } else {
                movies2017.add(movie);
            }
        }
        map.put(2016, movies2016);
        map.put(2017, movies2017);


        System.out.print(map);
        assertEquals("{2016=[Movie(name=Civil War, year=2016), Movie(name=DeadPool, year=2016)], 2017=[Movie(name=Spider Man, year=2017), Movie(name=Guardian of the Galaxy, year=2017)]}", map.toString());
    }

    @After
    public void finish() {
        list.clear();
        movies.clear();
    }
}
