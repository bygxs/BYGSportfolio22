package com.biniyam.bygsportfolio22;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    // this is what holds the view

    ImageView imageView;
    TextView projectName, projectDate;


    // a constructor

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
        projectName = itemView.findViewById(R.id.projectName);
        projectDate = itemView.findViewById(R.id.projectDate);
    }
}
