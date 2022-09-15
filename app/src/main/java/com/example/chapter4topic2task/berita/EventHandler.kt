package com.example.chapter4topic2task.berita

import android.content.Context
import android.content.Intent

class EventHandler (var context: Context) {
    fun onPindah(){
        context.startActivity(Intent(context, DetailNews::class.java))
    }
}