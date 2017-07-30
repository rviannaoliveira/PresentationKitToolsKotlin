package com.rviannaoliveira.presentationKitToolsKotlin

import org.junit.Assert.*
import org.junit.Test

/**
 * Criado por rodrigo on 22/07/17.
 */
class StandardTest {
    private val list: MutableList<Power> = mutableListOf()

    /**
     * Return new object and it work with 'this'
     * */
    @Test
    fun apply() {
        val power = Power().apply {
            name = "Reigun"
            cost = 2
            cooldown = 1
            nvl = 10
        }

        assertEquals("Reigun", power.name)
    }

    /**
     *Return new object and it work with 'it'
     * */
    @Test
    fun also() {
        val power = Power().also {
            it.name = "Reigun"
            it.cost = 2
            it.cooldown = 1
            it.nvl = 10
            list.add(it)
        }

        assertEquals("Reigun", power.name)
    }


    /**
     * convenient when you find yourself having to call multiple different methods on the same object
     */
    @Test
    fun with() {
        val power: Power = Power()

        with(power) {
            name = "Reigun"
            cost = 2
            cooldown = 1
            nvl = 10
            let { list.add(it) }
        }

        assertNotEquals(null, power)
    }

    @Test
    fun run() {
        val power = Power()

        val name = power.run {
            name = "Thunder"
            cost = 2
            cooldown = 1
            nvl = 10
            "Thor"
        }
        println(name)
        assertEquals("Thunder", power.name)
        assertEquals("Thor", name)
    }

    @Test
    fun let() {
        var heroes: Heroes? = null
        heroes?.let { fail() }
        heroes = Heroes("Magneto", "magnetism")
        val newNameHeroe = heroes.let {
            it.movie?.let { fail() }
            assertEquals("Magneto", it.name)
            "Xavier"
        }
        println(newNameHeroe)
        assertEquals("Xavier", newNameHeroe)
    }

}