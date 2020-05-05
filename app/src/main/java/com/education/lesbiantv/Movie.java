package com.education.lesbiantv;

public class Movie {

    private String Title;
    private int Category;
    private String Url;
    private String Description;

    public Movie(){}

    public Movie(String title, int category, String url, String description){
        Title= title;
        Category= category;
        Url = url;
        Description = description;
    };

    public int getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }
    public String  setDescription() {
        return Description;
    }


    public String getTitle() {
        return Title;
    }

    public String getUrl() {
        return Url;
    }

    public void setCategory(int category) {
        Category = category;
    }

    public void setDescription(String title) {
        Title = title;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
