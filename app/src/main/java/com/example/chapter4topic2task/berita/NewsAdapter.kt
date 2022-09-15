package com.example.chapter4topic2task.berita

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4topic2task.R
import com.example.chapter4topic2task.databinding.ActivityNewsBinding
import com.example.chapter4topic2task.databinding.NewsCardBinding

class NewsAdapter (var lisBerita : ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    var onClick:((News) -> Unit)? = null

    class ViewHolder(var binding: NewsCardBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(itemData : News){
            binding.news = itemData
            binding.beritanya.setOnClickListener(object : View.OnClickListener{
                override fun onClick(view: View?) {
                    var bundle = Bundle()
                    bundle.putString("title", itemData.title)
                    bundle.putString("writer", itemData.writer)
                    bundle.putInt("image", itemData.image)
                    bundle.putString("date", itemData.date)
                    bundle.putString("content", itemData.content)
                    val intent = Intent(view!!.context,DetailNews::class.java)
                    intent.putExtras(bundle)
                    view.context.startActivity(intent)
                }
            })
        }
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = NewsCardBinding.inflate(LayoutInflater.from(parent.context),parent,false)


        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lisBerita[position])
    }

    override fun getItemCount(): Int {
        return lisBerita.size
    }
}