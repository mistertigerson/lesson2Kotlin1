package com.example.lesson2kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.lesson2kotlin1.databinding.ActivityMainBinding
import com.example.lesson2kotlin1.extension.loading
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val images = mutableListOf("", "", "", "", "")
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        createList()
        submitClick()
        randomClick()

    }

    private fun randomClick() {
        viewBinding.randomBtn.setOnClickListener() {
            val randomValues = Random.nextInt(0, 4)
            Glide
                .with(this)
                .load(images[randomValues])
                .into(viewBinding.urlIv)
        }
    }

    private fun submitClick() {
        viewBinding.submitBtn.setOnClickListener() {
            val images : String = viewBinding.inputEt.text.toString()
            viewBinding.urlIv.loading(images)
        }
    }

    private fun createList() {
        images[0] = "https://i.pinimg.com/736x/70/5b/bb/705bbb820c7332b04d619f7536645753.jpg"
        images[1] =
            "https://ru-static.z-dn.net/files/d00/fb0072918fcb9030d38cab90a0d1b551.jpg"
        images[2] =
            "https://pominika.ru/wp-content/uploads/2017/03/Pominika-12-Populjarnye-instagram-akkaunty-devushek-Anastasiya-Kvitko.jpg"
        images[3] =
            "https://cs12.pikabu.ru/post_img/2021/07/19/6/1626688063117934814.jpg"
        images[4] =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7NGyJboGqUrPfnJunHuBWmjbdwh08j82dRQ&usqp=CAU"
    }
}