package com.example.mvvmjava.RecycleAuth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mvvmjava.R;

import java.util.List;

public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.Hviewholder> {

    Context context;
    List<GetListPrimeVideoModel.Datum> models;

    public HomeListAdapter(Context context, List<GetListPrimeVideoModel.Datum> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public Hviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Hviewholder(LayoutInflater.from(context).inflate(R.layout.home_list_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Hviewholder holder, int position) {


        Glide.with(context)
                .load(models.get(position).getThumbNailUrl())
                .into(holder.img);

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class Hviewholder extends RecyclerView.ViewHolder {

        ImageView img;
        public Hviewholder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.img);
        }
    }
}
