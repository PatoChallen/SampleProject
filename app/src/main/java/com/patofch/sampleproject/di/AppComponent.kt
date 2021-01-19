package com.patofch.sampleproject.di

import com.patofch.sampleproject.MainActivity
import com.patofch.sampleproject.wiring_impl.DataModule
import dagger.Component

@Component(modules = [DataModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}