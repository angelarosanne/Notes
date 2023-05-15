package com.example.Notes.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/hello")
class ControllerNotes {
    @GetMapping
    fun helloWorld(){
        println( "Hello world!")

    }

}