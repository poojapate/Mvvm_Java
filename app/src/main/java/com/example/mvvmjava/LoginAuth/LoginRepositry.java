package com.example.mvvmjava.LoginAuth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvmjava.Api.ApiInterface;
import com.example.mvvmjava.Api.RetrofitClint;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepositry {

    ApiInterface apiInterface;

    public LoginRepositry() {

        apiInterface = RetrofitClint.getClient();
    }

    LiveData<LoginModel> loginapi(Map<String, Object> map) {

        MutableLiveData<LoginModel> mutableLiveData = new MutableLiveData<>();

        apiInterface.login(map).enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {

                mutableLiveData.postValue(response.body());

            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {

            }
        });

        return mutableLiveData;

    }
}


