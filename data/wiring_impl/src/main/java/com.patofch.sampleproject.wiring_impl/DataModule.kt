package com.patofch.sampleproject.wiring_impl

import com.patofch.sampleproject.data.api.Repository
import com.patofch.sampleproject.data.impl.RepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun bindsRepository(repositoryImpl: RepositoryImpl): Repository
}