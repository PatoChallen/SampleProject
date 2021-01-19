package com.patofch.sampleproject.data.api

interface Repository {
    fun getData(): List<String>
}