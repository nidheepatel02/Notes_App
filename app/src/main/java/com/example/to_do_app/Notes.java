package com.example.to_do_app;

public class Notes {
    String title,description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Notes(String title, String description){
        this.title=title;
        this.description=description;
    }

}
