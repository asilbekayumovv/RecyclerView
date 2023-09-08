package com.example.recyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ListItemBinding
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val  newList: ArrayList<News>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

   @SuppressLint("SuspiciousIndentation")
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun getItemCount(): Int {
        return newList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val  currentItem = newList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.title.text = currentItem.title
        holder.text1.text = currentItem.text1
    }

    class MyViewHolder(binding:ListItemBinding): RecyclerView.ViewHolder(binding.root){


        val titleImage = binding.titleImage
        val title  = binding.title
        val text1  = binding.text1

    }
}