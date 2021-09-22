package com.karelie.ktapplication.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class KarelieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    fun init(){

    }


}