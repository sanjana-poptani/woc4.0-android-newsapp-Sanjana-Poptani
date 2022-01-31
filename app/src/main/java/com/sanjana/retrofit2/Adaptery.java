package com.sanjana.retrofit2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adaptery extends RecyclerView.Adapter<Adaptery.MyViewHolder> {
    private final Context context;
    private final List<News> newsList;
    public static final String MSG = "com.sanjana.retrofit2.MSG";

    public Adaptery(Context context, List<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.news_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        System.out.println("Id -----------" + newsList.get(position).getSourceId());
        String t = "" + newsList.get(position).getSourceId();
        holder.id.setText(t);
        holder.published.setText(newsList.get(position).getPublishedAt());
        holder.title.setText(newsList.get(position).getTitle());
        holder.desc.setText(newsList.get(position).getDescription());
//        holder.webView.loadUrl(newsList.get(position).getUrl());
//        holder.constraintLayout.setOnClickListener(DetailedNews.class);
//        Intent intent = new Intent(this,DetailedNews.class);

        System.out.println("Image --------- " + newsList.get(position).getUrlToImage());
//        Set Glide library
        Glide.with(context)
                .load(newsList.get(position).getUrlToImage())
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title,id,published,desc;
        ImageView img;
        ConstraintLayout constraintLayout;
        WebView webView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView);
            id = itemView.findViewById(R.id.textView2);
            published = itemView.findViewById(R.id.textView3);
            desc = itemView.findViewById(R.id.textView4);
            img = itemView.findViewById(R.id.imageView);
            constraintLayout = itemView.findViewById(R.id.constraint);
            webView = itemView.findViewById(R.id.webview);
        }
    }
}
