package com.karelie.ktapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.karelie.ktapplication.moudle.UserInforEnity

open class DataViewModel : ViewModel(){
    init {

    }

    open fun postUserInfor(): UserInforEnity? {
        val userInforEnity: UserInforEnity? = null
        return userInforEnity
    }

}