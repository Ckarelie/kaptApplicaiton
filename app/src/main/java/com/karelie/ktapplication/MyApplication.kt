package com.karelie.ktapplication

import androidx.annotation.NonNull
import androidx.databinding.Observable
import androidx.multidex.MultiDexApplication
import com.hjq.permissions.XXPermissions
import com.tencent.mmkv.MMKV
import io.reactivex.plugins.RxJavaPlugins
import okhttp3.OkHttpClient
import rxhttp.RxHttpPlugins
import java.util.concurrent.TimeUnit


class MyApplication : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        // 当前项目是否已经适配了分区存储的特性
        MMKV.initialize(this)
        XXPermissions.setScopedStorage(false);
        val client = OkHttpClient()
//            .connectTimeout(15, TimeUnit.SECONDS)
//            .readTimeout(15, TimeUnit.SECONDS)
//            .writeTimeout(15, TimeUnit.SECONDS)
//            .build();
        RxHttpPlugins.init(client);

    }
}