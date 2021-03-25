package com.ashutoshjena.jumbledwords.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ashutoshjena.jumbledwords.R;

import java.util.ArrayList;

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerAdapter.RecyclerViewHolder> {

    ArrayList<String> categories;
    ArrayList<Integer> imageResources;
    Context context;
    OnRecyclerViewItemClickListener onRecyclerViewItemClickListener;

    public CategoryRecyclerAdapter(ArrayList<String> list, ArrayList<Integer> imageResources, Context context, OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        this.categories = list;
        this.imageResources = imageResources;
        this.context = context;
        this.onRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerViewHolder(itemView, onRecyclerViewItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.textView.setText(categories.get(position));
        holder.imageView.setImageResource(imageResources.get(position));
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

        ImageView imageView;
        TextView textView;
        OnRecyclerViewItemClickListener itemClickListener;

        public RecyclerViewHolder(@NonNull View itemView, OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {

            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewListItem);
            textView = itemView.findViewById(R.id.textViewListItem);
            this.itemClickListener = onRecyclerViewItemClickListener;

            imageView.setOnClickListener(this);
            textView.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.OnRecyclerViewItemClick(getAdapterPosition());
        }
    }

    public interface OnRecyclerViewItemClickListener {
        void OnRecyclerViewItemClick(int position);
    }
}
