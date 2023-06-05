package com.example.panda

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Achievements_adapter(val con: ProfileActivity, val list:ArrayList<Achievements>):RecyclerView.Adapter<Achievements_adapter.Link>(){
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.image)
        val text1: TextView  =  itemView.findViewById(R.id.text1)
        val text2: TextView  =  itemView.findViewById(R.id.text2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.achievements_item, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.img.setImageResource(list[position].image)
        holder.text1.setText(list[position].text1)
        holder.text2.setText(list[position].text2)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}