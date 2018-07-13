package com.example.student.bigproject;

/**
 * Created by Student on 7/10/2018.
 */

public class ChatModel {
    private int imgResource;
    private String name;
    private String status;
    private String phoneNumber;
    private String email;

    public ChatModel(int imgResource, String name, String status, String phoneNumber, String email) {
        this.imgResource = imgResource;
        this.name = name;
        this.status = status;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
