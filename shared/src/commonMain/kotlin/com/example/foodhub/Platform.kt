package com.example.foodhub

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform