package com.example.simplekoinsample

interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImpl(): HelloRepository {
    override fun giveHello(): String {
        return "hello"
    }
}