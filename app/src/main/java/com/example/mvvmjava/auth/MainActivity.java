package com.example.mvvmjava.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvvmjava.LoginAuth.LoginActivity;
import com.example.mvvmjava.R;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    MyViewModel myViewModel;
    TextView signup;
    EditText f_name_edit,l_name_edit,email,password;
    String abhi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f_name_edit=findViewById(R.id.f_name_edit);
        l_name_edit=findViewById(R.id.l_name_edit);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        signup=findViewById(R.id.signup);

        myViewModel=new ViewModelProvider(this).get(MyViewModel.class);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Map<String,Object> mMap = new HashMap<>();
                mMap.put("firstName",f_name_edit.getText().toString());
                mMap.put("lastName",l_name_edit.getText().toString());
                mMap.put("email",email.getText().toString());
                mMap.put("password",password.getText().toString());

                myViewModel.mysign(mMap).observe(MainActivity.this, new Observer<SignUpModel>() {
                    @Override
                    public void onChanged(SignUpModel signUpModel) {
                        signUpModel.getMessage();

                        Toast.makeText(MainActivity.this,signUpModel.getMessage(), Toast.LENGTH_SHORT).show();

                        Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });


    }
}