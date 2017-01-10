package com.mostafa_anter.capstoneproject.rest;

import com.mostafa_anter.capstoneproject.model.Article;
import com.mostafa_anter.capstoneproject.model.NewsResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;


public interface ApiInterface {
    @GET("articles")
    Observable<NewsResponse> getArticles(@Query("source") String source, @Query("apiKey") String apiKey);
}
