package com.example.instagramui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instagramui.R
import com.example.instagramui.models.Story

internal class StoryAdapter (private val storiesList: List<Story>): RecyclerView.Adapter<StoryAdapter.MyViewHolder>(){
    internal inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        var name: TextView = view.findViewById(R.id.name)
        var image: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.story_list,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return storiesList.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val story = storiesList[position]
        holder.name.text = story.getName()
        Glide.with(holder.itemView).load(story.getImage()).into(holder.image)
    }
}

