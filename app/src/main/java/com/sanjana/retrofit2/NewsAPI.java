package com.sanjana.retrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsAPI {

    @GET("v3/615f9962-c1f5-4723-ab01-588057bcd535")
    Call<JSONResponse> getNews();
}
