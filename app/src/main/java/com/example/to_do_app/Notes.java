package com.example.to_do_app;

public class Notes {
    String Title,Description;

    public Notes(String title,String description){
        this.Title=title;
        this.Description=description;
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
