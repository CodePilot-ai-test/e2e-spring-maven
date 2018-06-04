package com.e2e.e2ekotlinapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class E2eKotlinAppApplication

fun main(args: Array<String>) {
    runApplication<E2eKotlinAppApplication>(*args)
}
