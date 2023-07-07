package com.example.mvvmjava.Api;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClint {

    public static Retrofit retrofit = null;

    public static ApiInterface getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES);
        client.addInterceptor(interceptor);

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://43.204.165.115:7077/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client.build())
                    .build();
        }

        ApiInterface apiInterface;
        apiInterface = retrofit.create(ApiInterface.class);
        return apiInterface;

      }
   }
