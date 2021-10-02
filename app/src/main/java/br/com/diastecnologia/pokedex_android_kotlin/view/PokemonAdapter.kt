package br.com.diastecnologia.pokedex_android_kotlin.view

import android.view.View
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import br.com.diastecnologia.pokedex_android_kotlin.domain.Pokemon

class PokemonAdapter(
    val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder> {

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(){
            
        }

    }
}