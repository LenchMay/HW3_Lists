package com.example.hw3lists

import java.io.Serializable
import java.util.UUID

data class Fox(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val age: String,
    val color: String
) : Serializable
