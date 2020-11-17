package com.example.jsonexc.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jsonexc.R
import com.example.jsonexc.domain.Filme

class FilmeAdapter(private val listaFilmes: ArrayList<Filme>): RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeAdapter.FilmeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_filme, parent, false)
        return FilmeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FilmeAdapter.FilmeViewHolder, position: Int) {
        var filme = listaFilmes[position]
        holder.tv_nome_filme.text = filme.nome
        holder.tv_resumo_filme.text = filme.resumo
    }

    override fun getItemCount() = listaFilmes.size

    class FilmeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tv_nome_filme: TextView = itemView.findViewById(R.id.tv_nome_filme)
        var tv_resumo_filme: TextView = itemView.findViewById(R.id.tv_resumo_filme)
    }
}