package com.example.ricardo.databinding.api;

import com.example.ricardo.databinding.model.Article;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.GET;

public interface ArticleAPI {
    String BASE_URL = "http://ufc-data-api.ufc.com/api/v3/iphone/";
    @GET("news/")
    Call<List<Article>> getArticles();
}
