package com.example.panda

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Friends_adapter(val con: ProfileActivity, val list:ArrayList<Friends>):RecyclerView.Adapter<Friends_adapter.Link>(){
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.friends_item, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.img.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}