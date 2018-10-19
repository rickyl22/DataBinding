package com.example.ricardo.databinding.viewmodel;

import android.support.v7.widget.RecyclerView;

import com.example.ricardo.databinding.ArticleAdapter;
import com.example.ricardo.databinding.api.ArticleAPI;
import com.example.ricardo.databinding.model.Article;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ArticleViewModel {

    RecyclerView recycler;

    public ArticleViewModel(RecyclerView recycler) {
        this.recycler = recycler;
    }

    public void getArticles(){
        ArticleAPI articleAPI = new Retrofit.Builder()
                .baseUrl(ArticleAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ArticleAPI.class);
        Call<List<Article>> call = articleAPI.getArticles();
        call.enqueue(new Callback<List<Article>>()
        {
            @Override
            public void onResponse(Call<List<Article>> call, Response<List<Article>> response)
            {
                List<Article> list = response.body();
                ArticleAdapter adapter = new ArticleAdapter(list);
                recycler.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Article>> call, Throwable t) {
                System.out.println("error");
            }
        });
    }
}
