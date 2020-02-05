package com.nahin.recylerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Model>models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null); //parent, false

        return new MyHolder( itemView );
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.title.setText( models.get( position).getTitle() );
        holder.description.setText( models.get( position ).getDescription() );

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
