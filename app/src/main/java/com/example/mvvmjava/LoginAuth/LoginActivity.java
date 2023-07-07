package com.example.mvvmjava.LoginAuth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmjava.R;
import com.example.mvvmjava.RecycleAuth.RecycleActivity;
import com.example.mvvmjava.auth.MyViewModel;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {


    EditText email, pass;
    TextView login_btn;
    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        login_btn = findViewById(R.id.login_btn);


        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Map<String, Object> map = new HashMap<>();
                map.put("email", email.getText().toString().trim());
                map.put("password",pass.getText().toString().trim());


                loginViewModel.mainlogin(map).observe(LoginActivity.this, new Observer<LoginModel>() {
                    @Override
                    public void onChanged(LoginModel loginModel) {

                        Boolean mess = loginModel.isResult();

                        Intent intent=new Intent(LoginActivity.this, RecycleActivity.class);
                        startActivity(intent);

                    }
                });

            }
        });
    }
}