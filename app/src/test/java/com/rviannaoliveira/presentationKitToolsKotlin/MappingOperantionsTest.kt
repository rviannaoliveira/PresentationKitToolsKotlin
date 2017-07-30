package com.rviannaoliveira.presentationKitToolsKotlin

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


/**
 * Criado por rodrigo on 22/07/17.
 */
class MappingOperantionsTest {
    private val movies: MutableList<Movie> = mutableListOf()

    @Before
    fun setUp() {
        movies.add(Movie("Spider Man", 2017))
        movies.add(Movie("Civil War", 2016))
    }

    @Test
    fun map() {
        movies.map { it.name + "Captain" }
                .forEach { println(it) }

    }

    @Test
    fun flatmap() {
        val newMovies = movies.flatMap { listOf(it, Movie("Thor Ragnarok", 2017)) }
        val moviesTest = listOf(Movie("Spider Man", 2017), Movie("Thor Ragnarok", 2017), Movie("Civil War", 2016), Movie("Thor Ragnarok", 2017))
        assertEquals(moviesTest, newMovies)
        newMovies.forEach { println(it.name) }
    }

    @Test
    fun groupBy() {
        val newMovies = movies + Movie("Guardian of the Galaxy", 2017) + Movie("DeadPool", 2016)
        val mapMovies = mapOf(
                2016 to listOf(Movie("Civil War", 2016), Movie("DeadPool", 2016)),
                2017 to listOf(Movie("Spider Man", 2017), Movie("Guardian of the Galaxy", 2017)))



        assertEquals(mapMovies, newMovies.sortedBy { it.year }.groupBy { if (it.year == 2016) 2016 else 2017 })
        println(newMovies.sortedBy { it.year }.groupBy { if (it.year == 2016) 2016 else 2017 })
    }
}