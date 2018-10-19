package com.example.ricardo.databinding.model;

public class Article {

    private String id;
    private String external_url_text;
    private String author;
    private String title;
    private String article_media_id;
    private String article_date;
    private String thumbnail;
    private String external_url;
    private String introduction;
    private String article_fighter_id;
    private String featured_news_category;
    private String last_modified;
    private String url_name;
    private String created;
    //private String keyword_ids;
    private String published_start_date;

    public Article(String id, String external_url_text, String author, String title, String article_media_id, String article_date, String thumbnail, String external_url, String introduction, String article_fighter_id, String featured_news_category, String last_modified, String url_name, String created, String published_start_date) {
        this.id = id;
        this.external_url_text = external_url_text;
        this.author = author;
        this.title = title;
        this.article_media_id = article_media_id;
        this.article_date = article_date;
        this.thumbnail = thumbnail;
        this.external_url = external_url;
        this.introduction = introduction;
        this.article_fighter_id = article_fighter_id;
        this.featured_news_category = featured_news_category;
        this.last_modified = last_modified;
        this.url_name = url_name;
        this.created = created;
        this.published_start_date = published_start_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExternal_url_text() {
        return external_url_text;
    }

    public void setExternal_url_text(String external_url_text) {
        this.external_url_text = external_url_text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle_media_id() {
        return article_media_id;
    }

    public void setArticle_media_id(String article_media_id) {
        this.article_media_id = article_media_id;
    }

    public String getArticle_date() {
        return article_date;
    }

    public void setArticle_date(String article_date) {
        this.article_date = article_date;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getExternal_url() {
        return external_url;
    }

    public void setExternal_url(String external_url) {
        this.external_url = external_url;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getArticle_fighter_id() {
        return article_fighter_id;
    }

    public void setArticle_fighter_id(String article_fighter_id) {
        this.article_fighter_id = article_fighter_id;
    }

    public String getFeatured_news_category() {
        return featured_news_category;
    }

    public void setFeatured_news_category(String featured_news_category) {
        this.featured_news_category = featured_news_category;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getUrl_name() {
        return url_name;
    }

    public void setUrl_name(String url_name) {
        this.url_name = url_name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getPublished_start_date() {
        return published_start_date;
    }

    public void setPublished_start_date(String published_start_date) {
        this.published_start_date = published_start_date;
    }
}
