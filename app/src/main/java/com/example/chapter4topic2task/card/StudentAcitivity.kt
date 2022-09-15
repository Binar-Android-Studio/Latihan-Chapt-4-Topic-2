package com.example.chapter4topic2task.card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter4topic2task.R
import com.example.chapter4topic2task.databinding.ActivityStudentAcitivityBinding

class StudentAcitivity : AppCompatActivity() {
    lateinit var binding: ActivityStudentAcitivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this, R.layout.activity_student_acitivity)
        val listkontak = arrayListOf(
            Student("Eliezer", "82", "bjorka"),
            Student("pepuho", "83", "happynuyear")
        )

        binding.rvContact.adapter = StudentAdapter(listkontak)
        binding.rvContact.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}