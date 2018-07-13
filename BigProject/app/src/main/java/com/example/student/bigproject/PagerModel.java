package com.example.student.bigproject;

/**
 * Created by Student on 7/9/2018.
 */

public class PagerModel {

    private String imgUrl;
    private String title;

    public PagerModel(String imgUrl, String title) {
        this.imgUrl = imgUrl;
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
