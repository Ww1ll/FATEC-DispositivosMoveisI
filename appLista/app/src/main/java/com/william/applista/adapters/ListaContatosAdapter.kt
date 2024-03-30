package com.william.applista.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.william.applista.R
import com.william.applista.models.Contato
import java.util.zip.Inflater

class ListaContatosAdapter(private val contatos: List<Contato>) :
    RecyclerView.Adapter<ListaContatosAdapter.ContatoViewHolder>(){
        class ContatoViewHolder(v : View) : RecyclerView.ViewHolder(v){

            var nome: TextView? = null
            var telefone:TextView? = null
            var foto:ImageView?= null



            init {

            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contato, parent, false)

        return ContatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        val nome:TextView = holder.itemView.findViewById(R.id.txtNome)
        val telefone:TextView = holder.itemView.findViewById(R.id.txtTelefone)
        val foto = holder.foto

        nome.setText(contatos.get(position).nome)
        telefone.setText(contatos.get(position).telefone)
    }

    override fun getItemCount(): Int {
        return contatos.count()
    }
}


