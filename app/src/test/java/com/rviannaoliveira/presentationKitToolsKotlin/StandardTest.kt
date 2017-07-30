package com.rviannaoliveira.presentationKitToolsKotlin

import org.junit.Assert.*
import org.junit.Test

/**
 * Criado por rodrigo on 22/07/17.
 */
class StandardTest {
    private val list: MutableList<Power> = mutableListOf()

    /**
     * Return new object
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
     * it work with 'it'
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

    @Test
    fun with() {
        val power: Power? = Power()

        with(power) {
            power?.name = "Reigun"
            power?.cost = 2
            power?.cooldown = 1
            power?.nvl = 10
            power?.let { list.add(it) }
        }

        assertNotEquals(null, power)
    }

    /**
     * it like apply but doesnt return anything
     */
    @Test
    fun run() {
        val power = Power()

        power.run {
            name = "Reigun"
            cost = 2
            cooldown = 1
            nvl = 10
        }

        assertEquals("Reigun", power.name)
    }

    @Test
    fun let() {
        var heroes: Heroes? = null
        heroes?.let { fail() }
        heroes = Heroes("Magneto", "magnetism")
        heroes.let {
            it.movie?.let { fail() }
            assertEquals("Magneto", it.name)
        }
    }
}