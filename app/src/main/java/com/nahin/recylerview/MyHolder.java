package com.nahin.recylerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    TextView title,description;



    public MyHolder(@NonNull View itemView) {

        super( itemView );

        this.title = itemView.findViewById( R.id.textViewID1 );
        this.description = itemView.findViewById( R.id.textViewID2 );


    }
}
