package com.team01

import java.nio.file.Files
import java.nio.file.StandardCopyOption


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// 자바의 record와 유사
//data class Person(
//    val name: String,
//    val age: Int
//) {}

class Person(val name: String, val age: Int = 0){

}

fun main() {
    val person1 = Person("Alice", 25)
    val person2 = Person("Bob")

    println("person1: ${person1.name}, ${person1.age}")
    println("person2: ${person2.name}, ${person2.age}")
}
