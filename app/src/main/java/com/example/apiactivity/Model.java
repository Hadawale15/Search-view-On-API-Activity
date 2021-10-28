package com.example.apiactivity;

public class Model {
    int userId, id;
    String Title, PostDesc;

    public Model(int id, int userId, String title, String postDesc) {
        this.id = id;
        this.userId = userId;
        Title = title;
        PostDesc = postDesc;
    }

    public Model() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPostDesc() {
        return PostDesc;
    }

    public void setPostDesc(String postDesc) {
        PostDesc = postDesc;
    }
}