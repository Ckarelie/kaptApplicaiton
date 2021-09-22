package com.karelie.ktapplication.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.karelie.ktapplication.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity(){
     lateinit var binding: ActivityMainBinding
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding=ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         init()
         onClick()
     }

     fun init(){
         //权限申请
//         XXPermissions.with(this)
//             .permission(PermissionInfo)
     }

    fun onClick(){
        binding.btnTurnOut.setOnClickListener { goToSystem() }
    }


    fun goToSystem(){
        val intent = Intent(this,SystemActivity::class.java)
        startActivity(intent)
    }


}