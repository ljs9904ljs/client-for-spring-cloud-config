package com.example.configclient.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConfigController(
    @Value("\${spring.datasource.uri}")
    private val uri: String,

    @Value("\${spring.datasource.username}")
    private val username: String,

    @Value("\${spring.datasource.password}")
    private val password: String
) {

    @GetMapping("/uri")
    fun getUri(): String {
        return uri
    }

    @GetMapping("/username")
    fun getUsername(): String {
        return username
    }

    @GetMapping("/password")
    fun getPassword(): String {
        return password
    }

    @GetMapping("/ping")
    fun ping(): String {
        return "pong"
    }

}