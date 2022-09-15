package com.example.chapter4topic2task.berita

import java.io.Serializable

data class News (var title : String, var writer : String, var image : Int, var date : String, var content : String) : Serializable