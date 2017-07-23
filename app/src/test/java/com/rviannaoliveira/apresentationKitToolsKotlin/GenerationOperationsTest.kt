package com.rviannaoliveira.apresentationKitToolsKotlin

import org.junit.Assert
import org.junit.Test

/**
 * Criado por rodrigo on 22/07/17.
 */
class GenerationOperationsTest {
    val heroes = mutableListOf(Heroes("Spider Man", "web"), Heroes("Thor", "hammer"))

    @Test
    fun plus() {
        val newHeroes = heroes + listOf(Heroes("Venom", "Symbiosis"), Heroes("Doctor Doom", "radiation"))
        newHeroes.forEach { println(it) }

        Assert.assertEquals(2, heroes.size)
        Assert.assertEquals(4, newHeroes.size)
    }
}