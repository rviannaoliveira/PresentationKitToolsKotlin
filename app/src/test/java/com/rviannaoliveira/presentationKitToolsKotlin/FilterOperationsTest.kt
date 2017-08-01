package com.rviannaoliveira.presentationKitToolsKotlin

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Criado por rodrigo on 22/07/17.
 */
class FilterOperationsTest {
    private val heroes: MutableList<Heroes> = mutableListOf()

    @Before
    fun setUp() {
        heroes.add(Heroes("Captain", "Shield"))
        heroes.add(Heroes("Iron Man", "Armor"))
    }

    @Test
    fun drop() {
        assertEquals(listOf(Heroes("Iron Man", "Armor")), heroes.drop(1))
    }

    @Test
    fun filter() {
        assertEquals(listOf(Heroes("Captain", "Shield")), heroes.filter { it.name == "Captain" })
    }

    @Test
    fun filterNot() {
        assertEquals(listOf(Heroes("Iron Man", "Armor")), heroes.filterNot { it.name == "Captain" })
    }

    @Test
    fun filterNotNull() {
        assertEquals(listOf(Heroes("Captain", "Shield"), Heroes("Iron Man", "Armor")), heroes.filterNotNull())
    }

    @Test
    fun distinct() {
        val newHeroes = heroes + listOf(Heroes("Captain", "Shield"))
        assertEquals(listOf(Heroes("Captain", "Shield"), Heroes("Iron Man", "Armor")), newHeroes.distinct())
    }

    @Test
    fun distinctBy() {
        val newHeroes = heroes + Heroes("Captain", "Shield")
        println(newHeroes)
        newHeroes.forEachIndexed { index, marvel -> marvel.code = index }
        assertEquals(listOf(Heroes("Captain", "Shield"), Heroes("Captain", "Shield")), newHeroes.distinctBy { it.code == 2 })
    }

    @Test
    fun find() {
        val find = heroes.find { it == Heroes("Captain", "Shield") }
        assertEquals(Heroes("Captain", "Shield"), find)
    }

    @Test
    fun doesnt_find() {
        val find = heroes.find { it == Heroes("Wolverine", "Claws") }
        assertEquals(null, find)
    }


}