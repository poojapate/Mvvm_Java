package com.example.mvvmjava.RecycleAuth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvmjava.Api.ApiInterface;
import com.example.mvvmjava.Api.RetrofitClint;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PrimeRepository {

    ApiInterface apiInterface;

    public PrimeRepository() {

        apiInterface= RetrofitClint.getClient();
    }

        LiveData<GetListPrimeVideoModel>callprimeM(){

        MutableLiveData<GetListPrimeVideoModel>mutableLiveData=new MutableLiveData();

           apiInterface.getListPrimeVideo().enqueue(new Callback<GetListPrimeVideoModel>() {
               @Override
               public void onResponse(Call<GetListPrimeVideoModel> call, Response<GetListPrimeVideoModel> response) {

                               mutableLiveData.postValue(response.body());

                     }

               @Override
               public void onFailure(Call<GetListPrimeVideoModel> call, Throwable t) {

               }
            });

           return mutableLiveData;

        }
     }
