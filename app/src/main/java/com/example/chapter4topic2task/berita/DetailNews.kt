package com.example.chapter4topic2task.berita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.chapter4topic2task.R
import com.example.chapter4topic2task.databinding.ActivityDetailNewsBinding

class DetailNews : AppCompatActivity() {

    lateinit var binding : ActivityDetailNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_news)

        var getname = intent.getSerializableExtra("title")
        var getwriter = intent.getSerializableExtra("writer")
        var getimage = intent.getSerializableExtra("image")
        var getdate = intent.getSerializableExtra("date")
        var getcontent = intent.getSerializableExtra("content")

        binding.data = News(getname as String,
            getwriter as String,
            getimage as Int,
            getdate as String,
            getcontent as String)

    }
}