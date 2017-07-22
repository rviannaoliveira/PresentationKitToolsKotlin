package com.rviannaoliveira.apresentationKitToolsKotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class CollectionTest {

    @Test
    fun example_add_item_array() {
        println("-----------------------------------------------> example_add_item_array")
        val heroes = arrayOf("Captain America", "Iron Man", "Spider Man", "DeadPool", "Thor")
        println("val heroes = arrayOf(\"Captain America\", \"Iron Man\", \"Spider Man\", \"DeadPool\", \"Thor\")")
        println("heroes[3] = \"Hulk\"")
        heroes[3] = "Hulk"
        assertEquals("Hulk", heroes[3])
    }

    @Test
    fun example_add_item_using_plus_array() {
        println("-----------------------------------------------> example_add_item_using_plus_array")
        var heroes = arrayOf("Captain America", "Iron Man", "Spider Man", "DeadPool", "Thor")
        println("val heroes = arrayOf(\"Captain America\", \"Iron Man\", \"Spider Man\", \"DeadPool\", \"Thor\")")
        println("heroes += \"Doctor Strange\"")
        heroes += "Doctor Strange"
        assertEquals("Doctor Strange", heroes[5])
    }

    @Test
    fun example_set() {
        println("-----------------------------------------------> example_set")
        val heroes = mutableSetOf("Captain America", "Iron Man", "Spider Man", "DeadPool", "Thor")
        println("----Init")
        println(heroes)
        println("----Insert Vision")
        heroes.add("Vision")
        println(heroes)
        println("----Inserted Thor")
        heroes.add("Thor")
        println(heroes)
        println("----not Inserted")

        assertEquals(6, heroes.size)
    }

    @Test
    fun example_map() {
        println("-----------------------------------------------> example_map")
        val heroes = mapOf(1 to "Captain America", 2 to "Iron Man", 3 to "Spider Man", 4 to "DeadPool")
        println("val heroes = mapOf(1 to \"Captain America\", 2 to \"Iron Man\",3 to  \"Spider Man\", 4 to \"DeadPool\")")
        println("heroes -> " + heroes)
        println("heroes[1] -> " + heroes[1])
        assertEquals("Captain America", heroes[1])
    }


    @Test
    fun main() {

    }


}