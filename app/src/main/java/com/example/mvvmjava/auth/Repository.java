package com.example.mvvmjava.auth;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvmjava.Api.ApiInterface;
import com.example.mvvmjava.Api.RetrofitClint;
import java.util.HashMap;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    ApiInterface apiInterface;

    public Repository(){

        apiInterface = RetrofitClint.getClient();
    }

    LiveData<SignUpModel> callLoginApi(Map<String,Object> map){

        MutableLiveData<SignUpModel> mutableLiveData = new MutableLiveData<>();


         apiInterface.signup(map).enqueue(new Callback<SignUpModel>() {
            @Override
            public void onResponse(Call<SignUpModel> call, Response<SignUpModel> response) {




                            mutableLiveData.postValue(response.body());
                            Log.d("yt4yt8i", "onResponse: "+response);






                }



            @Override
            public void onFailure(Call<SignUpModel> call, Throwable t) {

            }
        });

         return mutableLiveData;
    }
}
