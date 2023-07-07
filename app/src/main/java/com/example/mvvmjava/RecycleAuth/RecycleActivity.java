package com.example.mvvmjava.RecycleAuth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mvvmjava.R;

import java.util.List;

public class RecycleActivity extends AppCompatActivity {

   RecyclerView home_list_recycler_1;
   PrimeViewModel primeViewModel;
    List<GetListPrimeVideoModel.Datum> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        home_list_recycler_1=findViewById(R.id.home_list_recycler_1);

        primeViewModel=new ViewModelProvider(this).get(PrimeViewModel.class);

        primeViewModel.callrecmain().observe(this, new Observer<GetListPrimeVideoModel>() {
            @Override
            public void onChanged(GetListPrimeVideoModel getListPrimeVideoModel) {

                models=getListPrimeVideoModel.getData();

                LinearLayoutManager manager = new LinearLayoutManager(RecycleActivity.this);
                manager.setOrientation(RecyclerView.HORIZONTAL);
                home_list_recycler_1.setLayoutManager(manager);
                home_list_recycler_1.setAdapter(new HomeListAdapter(RecycleActivity.this,models));

             }
          });
        }
     }