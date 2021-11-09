package com.example.lesson2kotlin1.extension

import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URL

fun ImageView.loading(image : String){
    Glide.
        with(this.context)
        .load(image)
        .into(this)
}