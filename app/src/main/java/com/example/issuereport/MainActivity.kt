package com.example.issuereport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.livedata.observeAsState
import androidx.ui.material.FilledTextField

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = MutableLiveData<String>("")
        setContent {
            val state = data.observeAsState()
            FilledTextField(value = state.value!!, modifier = Modifier, onValueChange = {s: String -> data.value = s}, label = {
                Text("Label")
            })
        }
    }
}