package com.example.instagramui.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instagramui.R
import com.example.instagramui.models.Post
import com.example.instagramui.models.Story

internal  class PostAdapter (private val postsList: List<Post>): RecyclerView.Adapter<PostAdapter.MyViewHolder>(){
    internal inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        var profileImage: ImageView = view.findViewById(R.id.profileImage)
        var fullName: TextView = view.findViewById(R.id.fullName)
        var contentImage = view.findViewById<ImageView>(R.id.contentImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.post_list,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return postsList.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val post = postsList[position]
        Glide.with(holder.itemView).load(post.getProfile()).into(holder.profileImage)
        holder.fullName.text = post.getName()
        Glide.with(holder.itemView).load(post.getContent()).into(holder.contentImage)
    }
}
