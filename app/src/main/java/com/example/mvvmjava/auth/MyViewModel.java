package com.example.mvvmjava.auth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.Map;

public class MyViewModel extends ViewModel {

    Repository repository;

    public MyViewModel( ) {
        repository= new Repository();
    }

    public LiveData<SignUpModel> mysign(Map<String,Object> map){

        return repository.callLoginApi(map);
    }
}
