package com.karelie.ktapplication.view

import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.huawei.hms.hmsscankit.ScanUtil
import com.huawei.hms.ml.scan.HmsBuildBitmapOption
import com.karelie.ktapplication.databinding.ActivitySystemBinding
import rxhttp.RxHttp


class SystemActivity : AppCompatActivity(){
    lateinit var binding: ActivitySystemBinding

    private var type = 0
    private var margin = 1
    private var color = Color.BLACK
    private var background = Color.WHITE
    private var resultImage: Bitmap? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySystemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        onClick()
    }
    fun  init(){

    }
    fun onClick(){
        binding.systemBtnGetqrcode.setOnClickListener { getQrcode() }
    }

    //获取二维码数据并传入图片当中
    fun getQrcode(){
        val result = RxHttp.get("/index.php/Wxhl/Index/refresh.html")
            .add("userid","6584")
            .add("houseid","182")
            .asString()
        connectInImage(result.toString())
    }

    fun connectInImage(qrcode : String){
        val options= HmsBuildBitmapOption.Creator()
            .setBitmapMargin(margin)
            .setBitmapColor(color)
            .setBitmapBackgroundColor(background)
            .create()
        resultImage = ScanUtil.buildBitmap(qrcode,type,700,700,options)
        binding.imageViewQrcode.setImageBitmap(resultImage)
    }



}