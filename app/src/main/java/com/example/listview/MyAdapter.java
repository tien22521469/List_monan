package com.example.listview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.AdapterView;

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
        holder.imageView.setImageResource(items.get(position).getImage());

        // Thiết lập sự kiện click cho item
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, MainActivity2.class);
            intent.putExtra("item_name", (CharSequence) items.get(position)); // Truyền dữ liệu sang MainActivity2
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
