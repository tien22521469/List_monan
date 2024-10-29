package com.example.listview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder2 extends RecyclerView.ViewHolder {
    TextView tvNameMonAn,tvGiaTien, tvGiaAo;
    public MyViewHolder2(@NonNull View itemView) {
        super(itemView);
        tvNameMonAn = itemView.findViewById(R.id.tvNameMonAn);
        tvGiaTien = itemView.findViewById(R.id.tvGiaTien);
        tvGiaAo = itemView.findViewById(R.id.tvGiaAo);
    }
}
