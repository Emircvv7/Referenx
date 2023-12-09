package com.example.referenx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<ContinentModel> continentList;
    private OnItemClickListener onItemClickListener;

    public ContinentAdapter(ArrayList<ContinentModel> continentList, OnItemClickListener onItemClickListener) {
        this.continentList = continentList;
        this.onItemClickListener = onItemClickListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.onBind(continentList.get(position));
        holder.itemView.setOnClickListener(v -> {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    private TextView continentName;
    private ImageView imgContinent;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        continentName = itemView.findViewById(R.id.continent_name);
        imgContinent = itemView.findViewById(R.id.img_continent);
    }

    public void onBind(ContinentModel continent) {
        continentName.setText(continent.getName());
        Glide.with(itemView.getContext()).load(continent.getImage()).into(imgContinent);
    }
}
