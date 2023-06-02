package com.example.panda

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.panda.Poster

class Аlphabet_adapter (val con:Context, val list:ArrayList<Poster>):RecyclerView.Adapter<Аlphabet_adapter.Link>(){
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
        //val im_di:ImageView =  itemView.findViewById(R.id.item_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.alphabet_item, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        //holder.im_di.setImageResource(list[position].imageId)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}