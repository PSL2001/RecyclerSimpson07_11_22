package com.example.recyclersimpson_07_11_22.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclersimpson_07_11_22.R
import com.example.recyclersimpson_07_11_22.models.PersonajeModel

class PersonajesAdapter(private val lista: List<PersonajeModel>): RecyclerView.Adapter<PersonajesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.personajes_layout, parent, false)
        return PersonajesViewHolder(v)
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = lista[position]
        holder.pintar(personaje)
    }

    //Esto es otra manera para importar en kotlin
    override fun getItemCount() = lista.size
    /*
    override fun getItemCount(): Int {
        return lista.size
     }
     */
}