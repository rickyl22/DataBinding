package com.example.ricardo.databinding;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.ricardo.databinding.api.ArticleAPI;
import com.example.ricardo.databinding.model.Article;
import com.example.ricardo.databinding.viewmodel.ArticleViewModel;
import com.squareup.leakcanary.LeakCanary;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recycler;
    ArticleViewModel mArticleViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this.getApplication());
        setContentView(R.layout.activity_main);
        recycler = (RecyclerView) findViewById(R.id.recycler_article);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mArticleViewModel = new ArticleViewModel(recycler);
        mArticleViewModel.getArticles();
    }
}
