package com.sanjana.retrofit2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.internal.EverythingIsNonNull;

public class MainActivity extends AppCompatActivity {

//    https://run.mocky.io/v3/d9a1c673-fa7e-4561-9e4a-e63545ab293e
//    Fixed part of URL: https://run.mocky.io/
//    Relative part : v3/d9a1c673-fa7e-4561-9e4a-e63545ab293e
    public static final String MSG = "com.sanjana.retrofit2.MSG";
    RecyclerView recyclerView;
    List<News> newsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        newsList = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://run.mocky.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NewsAPI movieAPI = retrofit.create(NewsAPI.class);

        Call<JSONResponse> call = movieAPI.getNews();

        call.enqueue(new Callback<JSONResponse>() {
            @Override
            @EverythingIsNonNull
            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {

                JSONResponse jsonResponse = response.body();

                if(jsonResponse.getArticleArray() == null){
                    System.out.println("Reached here");
                    return;
                }
//                String name = jsonResponse.getArticleArray().get
                newsList = new ArrayList<>(Arrays.asList(jsonResponse.getArticleArray()));
                PutDataIntoRecyclerView(newsList);

            }

            @Override
            @EverythingIsNonNull
            public void onFailure(Call<JSONResponse> call, Throwable t) {

            }
        });

    }

    private void PutDataIntoRecyclerView(List<News> newsList) {
        Adaptery adaptery = new Adaptery(this, newsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adaptery);
    }


//    public void onClickItem(View view){
//        Intent intent = new Intent(this,DetailedNews.class);
//        String content =
//    }
}