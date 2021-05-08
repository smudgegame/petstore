package org.smudge.petstore

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PetstoreApplication

fun main(args: Array<String>) {
    SpringApplication.run(PetstoreApplication::class.java, *args)
}
