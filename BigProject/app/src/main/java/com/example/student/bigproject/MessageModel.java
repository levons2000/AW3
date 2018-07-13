package com.example.student.bigproject;

/**
 * Created by Student on 7/13/2018.
 */

public class MessageModel {
    private int imgRes;
    private String text;
    boolean isMy = false;

    public MessageModel(int imgRes, String text, boolean isMy) {
        this.imgRes = imgRes;
        this.text = text;
        this.isMy = isMy;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
