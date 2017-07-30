package com.rviannaoliveira.presentationKitToolsKotlin

import org.junit.Assert
import org.junit.Test

/**
 * Criado por rodrigo on 22/07/17.
 */
class AggregateOperationsTest {
    private val list = listOf(1, 2, 3, 4, 5, 6)

    @Test
    fun example_forEach() {
        list.forEach { print(it) }
    }

    @Test
    fun example_forEachIndexed() {
        list.forEachIndexed { index, value -> println("position $index contains a $value") }
    }

    @Test
    fun example_max() {
        Assert.assertEquals(6, list.max())
    }
}