package com.example.listview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView tvMonAn, tvSanPham, tvDangGiam;
    ImageView imageView;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMonAn = itemView.findViewById(R.id.tvMonAn);
        tvDangGiam = itemView.findViewById(R.id.tvdanggiam);
        tvSanPham = itemView.findViewById(R.id.tvSanPham);
        imageView = itemView.findViewById(R.id.imageView);
    }
}
