package com.example.chapter4topic2task.card

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4topic2task.databinding.StudentCardBinding

class StudentAdapter (var lisKontak : ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>(){

    class  ViewHolder (var binding : StudentCardBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(itemData : Student){
            binding.student = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = StudentCardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lisKontak[position])
    }

    override fun getItemCount(): Int {
        return  lisKontak.size
    }

}