package com.example.mvvmjava.LoginAuth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.Map;

public class LoginViewModel extends ViewModel {

    LoginRepositry loginRepositry;

    public LoginViewModel() {

        loginRepositry=new LoginRepositry();
    }

    public LiveData<LoginModel>mainlogin(Map<String, Object> map){
        return loginRepositry.loginapi(map);
    }
}
