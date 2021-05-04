package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter_Donus extends RecyclerView.Adapter<CustomAdapter_Donus.ViewHolder> {
    private ArrayList<Donus> mDonuses;
    private OnClickLiner listener;

    public CustomAdapter_Donus(ArrayList<Donus> mDonuses, OnClickLiner listener) {
        this.mDonuses = mDonuses;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.donus_item,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public int getItemCount() {
        return mDonuses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Donus donus1;
        ImageView imganhSP;
        TextView tvName,tvPrice,tvChitiet;
        ImageButton btncong;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imganhSP = itemView.findViewById(R.id.imganhsp1);
            tvName = itemView.findViewById(R.id.tvten1);
            tvPrice = itemView.findViewById(R.id.tvgia1);
            tvChitiet = itemView.findViewById(R.id.tvchitiet1);
            btncong = itemView.findViewById(R.id.imgbtncong1);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.clickItem(donus1);
                }
            });
        }

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Donus donus = mDonuses.get(position);
        holder.donus1 = donus;
        holder.imganhSP.setImageResource(donus.getAnhSP());
        holder.tvName.setText(donus.getTenSP());
        holder.tvPrice.setText(donus.getGiaSP()+"");
        holder.tvChitiet.setText(donus.getChiTietSP());


    }
}
