package com.example.jsonexc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.jsonexc.models.MainViewModel
import com.example.jsonexc.R
import com.example.jsonexc.adapters.FilmeAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listFilmes = viewModel.getListFilmesGson()
        val adapter = FilmeAdapter(listFilmes)

        rv_filmes.adapter = adapter
    }
}