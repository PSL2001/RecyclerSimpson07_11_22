package com.example.recyclersimpson_07_11_22.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclersimpson_07_11_22.databinding.PersonajesLayoutBinding
import com.example.recyclersimpson_07_11_22.models.PersonajeModel

class PersonajesViewHolder(v: View): RecyclerView.ViewHolder(v) {
    private val binding = PersonajesLayoutBinding.bind(v)

    fun pintar(personaje: PersonajeModel) {
        binding.tvTitulo.text = personaje.titulo
        binding.tvDescripcion.text = personaje.descripcion
        binding.ivPersonaje.setImageResource(personaje.imagen)
    }

}
