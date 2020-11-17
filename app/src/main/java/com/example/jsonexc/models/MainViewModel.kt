package com.example.jsonexc.models

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.jsonexc.domain.Filme
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val context = getApplication<Application>().applicationContext

    fun getListFilmesGson(): ArrayList<Filme> {

        val jsonString = context.assets.open("filmes.json")
            .bufferedReader()
            .use { it.readText() }

        return Gson().fromJson(jsonString, object : TypeToken<ArrayList<Filme>>(){}.type)
    }
}