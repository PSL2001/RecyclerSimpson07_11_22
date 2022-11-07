package com.example.recyclersimpson_07_11_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclersimpson_07_11_22.adapter.PersonajesAdapter
import com.example.recyclersimpson_07_11_22.databinding.ActivityMainBinding
import com.example.recyclersimpson_07_11_22.provider.PersonajeProvider

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "The Simpsons"
        //Recycler
        setRecycler()
    }

    private fun setRecycler() {
       // val layoutManager = LinearLayoutManager(this)
        val layoutManager = GridLayoutManager(this, 2)
        binding.rvView.layoutManager = layoutManager
        val adapter = PersonajesAdapter(PersonajeProvider.lista)
        binding.rvView.adapter = adapter
    }
}