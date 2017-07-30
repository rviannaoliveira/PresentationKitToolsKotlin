package com.rviannaoliveira.presentationKitToolsKotlin

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Criado por rodrigo on 22/07/17.
 */
class OrderOperationsTest {
    val numbers = listOf(13, 32, 27, 45)

    @Test
    fun reverse() {
        assertEquals(listOf(45, 27, 32, 13), numbers.reversed())
    }

    @Test
    fun sort_With_Number() {
        assertEquals(listOf(13, 27, 32, 45), numbers.sorted())
    }

    @Test
    fun sortDescending_With_Number() {
        val numbers = listOf(13, 32, 27, 45)
        assertEquals(listOf(45, 32, 27, 13), numbers.sortedDescending())
    }

    @Test
    fun sortBy_with_Number() {
        val numbers = listOf(13, 32, 27, 45)
        assertEquals(listOf(32, 13, 27, 45), numbers.sortedBy { it % 2 })
    }

    @Test
    fun sortBy_with_Object() {
        val heroes = mutableListOf(Heroes("Spider Man", "web"), Heroes("Thor", "hammer"), Heroes("Captain", "Shield"))
        val heroesTest = mutableListOf(Heroes("Captain", "Shield"), Heroes("Spider Man", "web"), Heroes("Thor", "hammer"))
        heroes.sortBy { it.name }
        assertEquals(heroesTest, heroes)
    }

    @Test
    fun sortWith_with_Object() {
        val heroes = mutableListOf(Heroes("Spider Man", "web"), Heroes("Thor", "hammer"), Heroes("Captain", "Shield"), Heroes("Captain", "Punch"))
        val heroesTest = mutableListOf(Heroes("Captain", "Punch"), Heroes("Captain", "Shield"), Heroes("Spider Man", "web"), Heroes("Thor", "hammer"))
        heroes.sortWith(compareBy({ it.name }, { it.power }))
        assertEquals(heroesTest, heroes)
    }

}