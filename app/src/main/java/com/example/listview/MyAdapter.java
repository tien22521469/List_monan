package com.example.listview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    private List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }
    
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvSanPham.setText(items.get(position).getDescription1());
        holder.tvDangGiam.setText(items.get(position).getDescription2());
        holder.tvMonAn.setText(items.get(position).getTitle());
        holder.materialCardView.setBackgroundDrawable(items.get(position).getImageResource(holder.itemView.getContext()));

//        holder.materialCardView.setBackground(items.get(position).getImageResource());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
