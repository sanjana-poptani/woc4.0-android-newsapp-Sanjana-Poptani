package com.sanjana.retrofit2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JSONResponse {

    String status;
    int totalResults;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    @SerializedName("articles")
    @Expose
    private News[] articleArray;

    public News[] getArticleArray() {
        return articleArray;
    }

    public void setArticleArray(News[] articleArray) {
        this.articleArray = articleArray;
    }

}
