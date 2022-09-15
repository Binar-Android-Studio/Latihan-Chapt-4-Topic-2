package com.example.chapter4topic2task.card

import android.graphics.drawable.Drawable

class Student (var firstname : String, var nrp : String,var img : String){
    fun getimageurl () :String{
        return "\"@drawable/" + img + "\""
    }

    fun getget() : String {
        return "@drawable/" + img
    }

}