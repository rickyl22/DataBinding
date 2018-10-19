package com.example.ricardo.databinding;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;



import com.example.ricardo.databinding.databinding.ArticlePostBinding;
import com.example.ricardo.databinding.model.Article;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ViewHolderItem> implements View.OnClickListener {

    List<Article> data ;
    View.OnClickListener listener;
    @NonNull
    @Override
    public ViewHolderItem onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        ArticlePostBinding itemBinding =
                ArticlePostBinding.inflate(layoutInflater, parent, false);
        return new ViewHolderItem(itemBinding);
    }

    public ArticleAdapter(List<Article> data) {

        this.data = data;
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        if(!imageUrl.equals("")){
            Picasso.get().load(imageUrl).into(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderItem viewHolderItem, int i) {
        Article s = data.get(i);
        viewHolderItem.binding.setArticle(s);
        viewHolderItem.binding.executePendingBindings();

        //Picasso.get().load(s.getImage()).fit().into((ImageView) viewHolderItem.mImg);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }
    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolderItem extends RecyclerView.ViewHolder {

        ArticlePostBinding binding;

        public ViewHolderItem(ArticlePostBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


    }
}

