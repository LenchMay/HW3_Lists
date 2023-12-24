package com.example.hw3lists

class FoxDataSource {

    private val foxesList = mutableListOf<Fox>()

    fun getFoxes(): List<Fox> = foxesList.toList()

    fun addFox(fox: Fox) {
        foxesList.add(fox)
    }
    fun deleteFox(fox: Fox) {
        foxesList.remove(fox)
    }
}