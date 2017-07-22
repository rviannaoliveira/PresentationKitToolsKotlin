package com.rviannaoliveira.apresentationKitToolsKotlin

/**
 * Criado por rodrigo on 22/07/17.
 */

//Code example mutable and immutable
val name: String
    get() = "Capitan"

var nameTwo: String? = null
    get() = field + " Man"
    set(value) {
        field = value
    }


fun main(args: Array<String>) {

    //Example of compilation mutable and immutable list
//    val heroes = mutableListOf("Captain America", "Iron Man", "Spider Man", "DeadPool", "Thor")
//    heroes.add("Wolverine")
//    val heroes = listOf("Captain America", "Iron Man", "Spider Man", "DeadPool", "Thor")
//    heroes.add("Wolverine")


}