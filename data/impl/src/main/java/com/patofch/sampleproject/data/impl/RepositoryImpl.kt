package com.patofch.sampleproject.data.impl

import com.patofch.sampleproject.data.api.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(): Repository {

    override fun getData(): List<String> {
        TODO("Not yet implemented")
    }
}