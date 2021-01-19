package com.patofch.sampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patofch.sampleproject.application.SampleApplication
import com.patofch.sampleproject.data.api.Repository
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as SampleApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        repository.getData()
    }
}