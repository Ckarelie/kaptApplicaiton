package com.karelie.ktapplication.viewmodel;

import com.karelie.ktapplication.moudle.QrcodeEnity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface QrcodeService {
    @GET("http://www.njanjar.com/index.php/Wxhl/Index/refresh.html")
    Observable<QrcodeEnity> getQrcodeMessage(@Query("userid") String userid, @Query("houseid") String houseid);
}
