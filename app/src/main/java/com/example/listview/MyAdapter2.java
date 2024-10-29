package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import javax.crypto.ShortBufferException;

public class MyAdapter2 extends RecyclerView.Adapter<MyViewHolder2> {
        Context context;
        private List<Item2> item2;

        public MyAdapter2(Context context, List<Item2> item2) {
            this.context = context;
            this.item2 = item2;
        }

        @NonNull
        @Override
        public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MyViewHolder2(LayoutInflater.from(context).inflate(R.layout.item_view2,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
            holder.tvNameMonAn.setText(item2.get(position).getTenMonAn());
            holder.tvGiaTien.setText(item2.get(position).getGiaTien());
            holder.tvGiaAo.setText(item2.get(position).getGiaAo());
        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
