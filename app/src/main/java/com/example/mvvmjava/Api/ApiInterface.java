package com.example.mvvmjava.Api;

import com.example.mvvmjava.LoginAuth.LoginModel;
import com.example.mvvmjava.RecycleAuth.GetListPrimeVideoModel;
import com.example.mvvmjava.auth.SignUpModel;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("api/user/signUp")
    Call<SignUpModel>signup(@Body Map<String,Object>body);

    @POST("api/user/login")
    Call<LoginModel>login(@Body Map<String, Object> body);

    @GET("video/getListPrimeVideo")
    Call<GetListPrimeVideoModel>getListPrimeVideo();
}
