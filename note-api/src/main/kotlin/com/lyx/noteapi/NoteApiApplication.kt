package com.lyx.noteapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class NoteApiApplication

fun main(args: Array<String>) {
    SpringApplication.run(NoteApiApplication::class.java, *args)
}
