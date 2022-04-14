package com.example.compareapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}